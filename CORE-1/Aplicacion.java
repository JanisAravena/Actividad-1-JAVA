import clases.Algoritmos;

public class Aplicacion {
    public static void main(String[] args) {

        // esPar
        System.out.println(Algoritmos.esPar(10));
        System.out.println(Algoritmos.esPar(11));

        // esPrimo
        System.out.println(Algoritmos.esPrimo(1));
        System.out.println(Algoritmos.esPrimo(3));
        System.out.println(Algoritmos.esPrimo(10));

        // stringEnReversa
        System.out.println(Algoritmos.stringEnReversa("Hola"));
        System.out.println(Algoritmos.stringEnReversa("Janis"));

        // esPalindromo
        System.out.println(Algoritmos.esPalindromo("Janis"));
        System.out.println(Algoritmos.esPalindromo("Reconocer"));

        // secuenciaFizzBuzz
        Algoritmos.secuenciaFizzBuzz(15);

    }
}
