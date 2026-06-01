package PatinoExamenB1;

import java.util.*;

public class Curso implements Crud {
    private String nombreCurso;
    HashMap<String , Double> calificaciones;
    Scanner sc = new Scanner(System.in);

    public Curso(String nombrCurso ) {
        this.nombreCurso = nombrCurso;
    }

    @Override
    public void registrarNota(String correo, double nota) {

    }

    @Override
    public void actualizarNota(String correo, double nuevaNota) {

    }

    @Override
    public void eliminarNota(String correo) {

    }

    @Override
    public double promedioCurso() {
        return 0;
    }

    @Override
    public String mejorEstudiante() {
        return "";
    }
}
