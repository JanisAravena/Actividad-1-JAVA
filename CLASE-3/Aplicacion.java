
// Es un ejemplo básico de cómo crear y llamar métodos en Java, pasando parámetros y obteniendo un resultado mediante return
import java.util.Date;
import clases.Calculadora;
import java.util.ArrayList;
import java.util.Arrays;

public class Aplicacion {
    public static void main(String[] args) {

        // Método estásticos y modularización
        int respuesta = Calculadora.sumar(8, 9);
        int respuesta2 = Calculadora.sumar(8, 9, respuesta);
        int respuesta3 = Calculadora.sumar(8, 9, 10.7);

        System.out.println("La suma entre 8 y 9 es: " + respuesta);
        System.out.println("La suma entre 8, 9 y 17 es: " + respuesta2);
        System.out.println("La suma entre 8, 9 y 10.7 es: " + respuesta3);

        Date fechaActual = new Date();
        System.out.println("La fecha actual es: " + fechaActual);

        // Arreglos Estáticos
        int[] numeros = new int[5]; // [0, 0, 0, 0, 0]
        // String[] numeros2 = {"1", "2", "3", "4", "5"}; // ["1", "2", "3", "4", "5"]

        numeros[0] = 10; // [10, 0, 0, 0, 0]
        numeros[2] = 23; // [10, 0, 23, 0, 0]
        // numeros[8] = 56; // Esto genera un error de índice fuera de rango, ya que el
        // arreglo solo tiene 5 elementos

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Areglos Dinámicos
        ArrayList<String> colores = new ArrayList<String>();

        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");

        colores.addAll(Arrays.asList("Naranja", "Blanco", "Gris"));

        colores.remove("Blanco");
        colores.remove(1);

        String primerColor = colores.get(0);

        boolean contieneAzul = colores.contains("Azul");

        colores.set(0, "Morado");

        // como hacer para recorrer en un for each
        for (int i = 0; i < colores.size(); i++) {
            System.out.println(colores.get(i));
        }

        System.out.println("El primer color es: " + primerColor);
        System.out.println("Todos los colores son: " + colores);
        System.out.println("Contiene Azul: " + contieneAzul);

    }

}
