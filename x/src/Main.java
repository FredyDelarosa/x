import models.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String seleccion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar nombre de usuario");
            System.out.println("2. Agregar edad a un usuario");
            System.out.println("3. Mostrar usuarios registrados");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            seleccion = scanner.nextLine();

            switch (seleccion) {
                case "1":
                    System.out.print("Ingrese un nombre de usuario: ");
                    String nombre = scanner.nextLine();
                    usuarios.add(new Usuario(nombre));
                    System.out.println("Usuario agregado.");
                    break;
                case "2":
                    if (usuarios.isEmpty()) {
                        System.out.println("No hay usuarios registrados.");
                        break;
                    }
                    System.out.println("Seleccione un usuario para agregar edad: ");
                    for (int i = 0; i < usuarios.size(); i++) {
                        System.out.println((i + 1) + ". " + usuarios.get(i).getNombre());
                    }
                    int indice = scanner.nextInt() - 1;
                    scanner.nextLine();
                    if (indice >= 0 && indice < usuarios.size()) {
                        System.out.print("Ingrese la edad para " + usuarios.get(indice).getNombre() + ": ");
                        int edad = scanner.nextInt();
                        scanner.nextLine();
                        usuarios.get(indice).setEdad(edad);
                        System.out.println("Edad asignada correctamente.");
                    } else {
                        System.out.println("Selección no válida.");
                    }
                    break;
                case "3":
                    if (usuarios.isEmpty()) {
                        System.out.println("No hay usuarios registrados para mostrar.");
                    } else {
                        System.out.println("Usuarios registrados:");
                        for (Usuario usuario : usuarios) {
                            System.out.println("Nombre: " + usuario.getNombre() + ", Edad: " + (usuario.getEdad() == null ? "Edad no asignada" : usuario.getEdad()));
                        }
                    }
                    break;
                case "4":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
                    break;
            }
        } while (!"4".equals(seleccion));

        scanner.close();
    }
}
