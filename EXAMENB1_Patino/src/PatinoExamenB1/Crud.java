package PatinoExamenB1;

public interface Crud {

    void registrarNota(String correo, double nota);
	void actualizarNota(String correo, double nuevaNota);
	void eliminarNota(String correo);
	double promedioCurso();
	String mejorEstudiante();

}
