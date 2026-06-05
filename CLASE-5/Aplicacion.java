import clases.Persona;

public class Aplicacion {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Janis", "1998-07-05");

        persona1.setNombre("Millaray");
        persona1.setFechaNacimiento("2000-10-30");

        persona2.setNombre("Francisca");

        System.out.println("Nombre persona 1: " + persona1.toString());
        System.out.println("Nombre persona 2: " + persona2.toString());

    }
}