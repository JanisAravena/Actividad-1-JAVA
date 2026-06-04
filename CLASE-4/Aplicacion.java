import java.util.HashMap;
import java.util.Set;

public class Aplicacion {
    public static void main(String[] args) {

        // HASHMAPS O MAPAS DE HASH
        // Es una estructura de datos que almacena pares clave-valor. Permite acceder a
        // los valores asociados a una clave de manera eficiente. Es útil para almacenar
        // datos que se pueden identificar mediante una clave única, como un número de
        // identificación o un nombre.
        // Crear un HashMap
        HashMap<String, Integer> edades = new HashMap<>();
        // Agregar elementos al HashMap
        edades.put("Juan", 25);
        edades.put("María", 30);
        edades.put("Pedro", 20);
        edades.put("Juan", 27); // Sobrescribe el valor asociado a la clave "Juan"
        // Acceder a un valor mediante su clave
        int edadJuan = edades.get("Juan");
        System.out.println("La edad de Juan es: " + edadJuan);
        // Verificar si una clave existe en el HashMap
        boolean existeMaria = edades.containsKey("María");
        System.out.println("¿Existe María en el HashMap? " + existeMaria);
        // Eliminar un elemento del HashMap
        edades.remove("Pedro");
        // Iterar sobre los elementos del HashMap

        Set<String> claves = edades.keySet();
        System.out.println("Claves en el HashMap: " + claves);

        for (String clave : claves) {
            System.out.println(clave + " tiene " + edades.get(clave) + " años.");
        }

        // Excepciones
        int[] numeros = { 1, 2, 3, 4, 5, 6 };

        try {

            int posicion2 = numeros[2];
            int posicion3 = numeros[3];
            int posicion8 = numeros[8]; // Esto lanzará una excepción ArrayIndexOutOfBoundsException, ya que el índice 8
                                        // está fuera del rango del arreglo

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango. " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        } finally {
            System.out.println("Este bloque se ejecuta siempre, independientemente de si ocurrió una excepción o no.");
        }


    }
}