
// import clases.Persona;
import clases.Estudiante;
import clases.Instructor;
import java.util.ArrayList;
import java.util.Arrays;

public class Aplicacion {
        public static void main(String[] args) {

                /*
                 * Persona persona1 = new Persona();
                 * Persona persona2 = new Persona("Janis", "1998-07-05");
                 * Persona persona3 = new Persona("Camila", "1995-03-15", "camila@example.com");
                 * 
                 * persona1.setNombre("Millaray");
                 * persona1.setFechaNacimiento("2000-10-30");
                 * 
                 * persona2.setNombre("Francisca");
                 * 
                 * System.out.println(persona1.toString());
                 * System.out.println(persona2.toString());
                 * System.out.println(persona3.toString());
                 */

                Estudiante estudiante1 = new Estudiante("Janis", "1999-12-20", "sofia@example.com", "Full Stack Java",
                                "Cohorte A");
                System.out.println(estudiante1.toString());

                Estudiante estudiante2 = new Estudiante("Camila", "1995-03-15", "correo@gmail.com", "Full Stack Java",
                                "Cohorte B");
                System.out.println(estudiante2.toString());

                Estudiante estudiante3 = new Estudiante("Sofia", "2000-10-30", "ddklvd@gmail.com", "Full Stack Java",
                                "Cohorte A");
                System.out.println(estudiante3.toString());

                Instructor instructor1 = new Instructor("Maria", "1985-05-10", "maria@example.com");
                instructor1.agregarBootcamp("Full Stack Java");
                instructor1.agregarAlumno(estudiante1);
                instructor1.agregarAlumno(estudiante3);
                System.out.println(instructor1.toString());

                ArrayList<Integer> calificaciones1 = new ArrayList<Integer>(Arrays.asList(6, 9, 7));
                ArrayList<Integer> calificaciones2 = new ArrayList<Integer>(Arrays.asList(10, 8, 7));

                estudiante1.setCalificaciones(calificaciones2);
                estudiante3.setCalificaciones(calificaciones1);

                System.out.println(estudiante1.toString());
                System.out.println("El promedio de calificaciones de "
                                + String.format("%.2f", estudiante1.calcularPromedioCalificaciones()) + " es: "
                                + estudiante1.calcularPromedioCalificaciones());

                System.out.println(estudiante3.toString());
                System.out.println("El promedio de calificaciones de "
                                + String.format("%.2f", estudiante3.calcularPromedioCalificaciones()) + " es: "
                                + estudiante3.calcularPromedioCalificaciones());

                System.out.println("El promedio de calificaciones de los alumnos del instructor "
                                + String.format("%.2f", instructor1.calcularPromedioCalificaciones()));

                System.out.println(estudiante1.verCalificaciones());
                System.out.println(instructor1.verCalificaciones());

        }
}