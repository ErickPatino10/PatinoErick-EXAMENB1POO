package PatinoExamenB1;

import java.util.ArrayList;
import java.util.Scanner;


public class SistemaPruebas {
    Scanner sc = new Scanner(System.in);
    ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public void main() {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        do {

           mostarMenu();
            opcion = sc.nextInt();


            switch (opcion) {
                case 1:
                    registrarEstudiante();
                    break;
                case 2:
                    buscarEstudiante();
                    break;
                case 3:
                    System.out.println("Ingrese su correo: ");
                    String correo = sc.nextLine();
                    for (Estudiante estudiante : estudiantes){
                        if (correo.equals(estudiante.getCorreo())){
                            System.out.println("Nota: ");
                            double nota = sc.nextDouble();

                            return;
                        }
                        System.out.println("Correo no encontrado");
                    }
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:
                    System.out.println("\nSaliendo ...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    ;
            }


        } while (opcion >= 0);


    }

    public void registrarEstudiante(){
        try {
            System.out.println("Ingrese su nombre: ");
            String nombre1 = sc.nextLine();
            System.out.println("Ingrese su correo: ");
            String correo1 = sc.nextLine();
            System.out.println("Ingrese su edad: ");
            int edad1 = sc.nextInt();
            Estudiante estudiante = new Estudiante(nombre1,correo1, edad1);
            estudiantes.add(estudiante);
            System.out.println("\n Registrado exitosamente");

        }catch (Exception e){
            System.out.println("No registrado");

        }



    }

    public void buscarEstudiante(){
        System.out.println("Ingrese su correo: ");
        String correo = sc.nextLine();
        for (Estudiante estudiante : estudiantes  ){
            if (estudiante.getCorreo().equals(correo)){
                System.out.println("\n Estudiante: ");
                System.out.println("Nombre: "+estudiante.getNombre());
                System.out.println("Correo: "+estudiante.getCorreo());
                System.out.println("Edad: "+estudiante.getEdad());
                System.out.println(estudiante.obtenerRol());
                System.out.println("\n==========================\n");
                return;
            }
            System.out.println("Correo no encontrado");
        }

    }

    public void mostarMenu(){
        System.out.println("===== SISTEMA ACADÉMICO =====" +
                "\n1. Registrar estudiante" +
                "\n2. Buscar estudiante por correo." +
                "\n3. Registrar nota" +
                "\n4. Actualizar nota" +
                "\n5. Eliminar nota" +
                "\n6. Mostrar promedio del curso" +
                "\n7. Mostrar el correo del estudiante con la nota más alta" +
                "\n8. Mostrar estudiantes registrados" +
                "\n9. Salir." +
                "\nIngrese una opcion: ");
    }
    


}



