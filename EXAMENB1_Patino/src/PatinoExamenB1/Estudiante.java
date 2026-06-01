package PatinoExamenB1;

import PatinoExamenB1.Persona;

import java.util.Objects;

public class Estudiante extends Persona {
    private int edad;



    public Estudiante(String nombre, String correo, int edad) {
        super(nombre, correo);
        setEdad(edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 15 && edad < 35){
            this.edad = edad;
        }else{
            throw new IllegalArgumentException("Edad invalida. ");
        }
    }

    @Override
    public String obtenerRol() {
        return "Rol asiganado: estudiante";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return edad == that.edad;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(edad);
    }

    @Override
    public String toString() {

        return "Estudiante{" +
                "Edad: " + edad ;
    }
}
