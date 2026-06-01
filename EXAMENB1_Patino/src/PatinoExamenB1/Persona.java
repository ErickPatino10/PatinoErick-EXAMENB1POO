package PatinoExamenB1;

import java.util.Objects;

public abstract class Persona {
    private String nombre;
    private String correo;


    public Persona(String nombre, String correo) {
        this.nombre = nombre;
        setCorreo(correo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo.contains("@")){
            this.correo = correo;
        }else{
            throw new IllegalArgumentException("El correo debe contener una @");
        }
    }

    abstract public String obtenerRol();

    @Override
    public String toString() {
        return "Nombre: " + nombre + '\'' +
                ", Correo: " + correo + '\'' ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(correo, persona.correo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(correo);
    }
}
