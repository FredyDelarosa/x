package models;

public class Usuario {
    private String nombre;
    private Integer edad;

    // Constructor
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.edad = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}

