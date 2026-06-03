// ejemplo de toUpperCase() en Java: El método `toUpperCase()` es un método de la clase `String` que se utiliza para convertir todos los caracteres de una cadena de texto a mayúsculas. Aquí tienes un ejemplo de cómo usarlo:

// public class Aplicacion {
//     public static void main(String[] args) {
//         String texto = "Hola, mundo!";
//         String textoEnMayusculas = texto.toUpperCase();
//         System.out.println("Texto original: " + texto);
//         System.out.println("Texto en mayúsculas: " + textoEnMayusculas);
//     }
// }

// Ejemplo de .trim() en Java: El método `trim()` es un método de la clase `String` que se utiliza para eliminar los espacios en blanco al principio y al final de una cadena de texto. Aquí tienes un ejemplo de cómo usarlo:
// public class Aplicacion {
//     public static void main(String[] args) {
//         String textoConEspacios = "   Hola, mundo!   ";
//         String textoSinEspacios = textoConEspacios.trim();
//         System.out.println("Texto original: '" + textoConEspacios + "'");
//         System.out.println("Texto sin espacios: '" + textoSinEspacios + "'");
//     }
// }

//ejemplo de .concat() en Java: El método `concat()` es un método de la clase `String` que se utiliza para concatenar (unir) dos cadenas de texto. Aquí tienes un ejemplo de cómo usarlo:


// public class Aplicacion {
//     public static void main(String[] args) {
//         String texto1 = "Hola, ";
//         String texto2 = "mundo!";
//         String textoConcatenado = texto1.concat(texto2);
//         System.out.println("Texto 1: " + texto1);
//         System.out.println("Texto 2: " + texto2);
//         System.out.println("Texto concatenado: " + textoConcatenado);
//     }
// }

// ejemplo de .equals() en Java: El método `equals()` es un método de la clase `String` que se utiliza para comparar el contenido de dos cadenas de texto. Devuelve `true` si las cadenas son iguales y `false` si no lo son. Aquí tienes un ejemplo de cómo usarlo:

// public class Aplicacion {
//     public static void main(String[] args) {
//         String texto1 = "Hola, mundo!";
//         String texto2 = "Hola, mundo!";
//         String texto3 = "Hola, Java!";
        
//         boolean sonIguales1 = texto1.equals(texto2);
//         boolean sonIguales2 = texto1.equals(texto3);
        
//         System.out.println("Texto 1: " + texto1);
//         System.out.println("Texto 2: " + texto2);
//         System.out.println("Texto 3: " + texto3);
//         System.out.println("¿Texto 1 es igual a Texto 2? " + sonIguales1);
//         System.out.println("¿Texto 1 es igual a Texto 3? " + sonIguales2);
//     }
// }

// ejemplo de .length() en Java: El método `length()` es un método de la clase `String` que se utiliza para obtener la longitud de una cadena de texto, es decir, el número de caracteres que contiene. Aquí tienes un ejemplo de cómo usarlo:

// public class Aplicacion {
//     public static void main(String[] args) {
//         String texto = "Hola, mundo!";
//         int longitud = texto.length();
//         System.out.println("Texto: " + texto);
//         System.out.println("Longitud del texto: " + longitud);
//     }
// }

// ejemplo de condicional if en Java: El condicional `if` es una estructura de control que se utiliza para ejecutar un bloque de código solo si se cumple una condición específica. Aquí tienes un ejemplo de cómo usarlo:
    
// public class Aplicacion {
//     public static void main(String[] args) {
//         System.out.println("Hola Mundo");
//         int numero = -10;
//         if (numero >= 0) {
//             System.out.println("El número es mayor o igual a 0.");
//         } else {
//             System.out.println("El número es menor que 0.");
//         }
//     }
// }

// Ejemplo operador ternario en Java: El operador ternario es una forma concisa de escribir una expresión condicional. Se utiliza para asignar un valor a una variable en función de una condición. La sintaxis del operador ternario es la siguiente: `condición ? valorSiVerdadero : valorSiFalso`. Aquí tienes un ejemplo de cómo usarlo:

// public class Aplicacion {
//     public static void main(String[] args) {
//         int numero = 10;
//         String resultado = (numero >= 5) ? "El número es mayor o igual a 5." : "El número es menor que 5.";
//         System.out.println(resultado);
//     }
// }

// ejemplo de switch en Java: El `switch` es una estructura de control que se utiliza para ejecutar diferentes bloques de código en función del valor de una variable. Es una alternativa a múltiples sentencias `if-else` cuando se tienen varias condiciones basadas en el mismo valor. Aquí tienes un ejemplo de cómo usarlo:

// public class Aplicacion {
//     public static void main(String[] args) {
//         System.out.println("Hola Mundo");
//         int dia = 3;
//         String nombreDia = null;
//         switch (dia) {
//             case 1:
//                 nombreDia = "Lunes";
//                 break;
//             case 2:
//                 nombreDia = "Martes";
//                 break;
//             case 3:
//                 nombreDia = "Miércoles";
//                 break;
//             case 4:
//                 nombreDia = "Jueves";
//                 break;
//             case 5:
//                 nombreDia = "Viernes";
//                 break;
//             case 6:
//                 nombreDia = "Sábado";
//                 break;
//             case 7:
//                 nombreDia = "Domingo";
//                 break;
//             default:
//                 System.out.println("Número de día no válido.");
//         }
//         System.out.println("El día es: " + nombreDia);
//     }
// }

// Ejemplo ciclo for en Java: El ciclo `for` es una estructura de control que se utiliza para repetir un bloque de código un número específico de veces. La sintaxis del ciclo `for` es la siguiente: `for (inicialización; condición; actualización) { // código a ejecutar }`. Aquí tienes un ejemplo de cómo usarlo:

// public class Aplicacion {
//     public static void main(String[] args) {
//         System.out.println("Hola Mundo");

//         int [] numeros = {1, 2, 3, 4, 5};
//         for (int i = 0; i < numeros.length; i++) {
//             System.out.println("Número: " + numeros[i]);
//         }
//     }
// }

// ejemplo con while en Java: El ciclo `while` es una estructura de control que se utiliza para repetir un bloque de código mientras se cumpla una condición específica. La sintaxis del ciclo `while` es la siguiente: `while (condición) { // código a ejecutar }`. Aquí tienes un ejemplo de cómo usarlo:

// public class Aplicacion {
//     public static void main(String[] args) {
//         System.out.println("Hola Mundo");

//         int contador = 0;
//         while (contador < 5) {
//             System.out.println("Contador: " + contador);
//             contador++;
//         }
//     }
// }

// Ejemplo de ciclo do-while en Java: El ciclo `do-while` es similar al ciclo `while`, pero garantiza que el bloque de código se ejecute al menos una vez, ya que la condición se evalúa después de la ejecución del bloque. La sintaxis del ciclo `do-while` es la siguiente: `do { // código a ejecutar } while (condición);`. Aquí tienes un ejemplo de cómo usarlo:

// public class Aplicacion {
//     public static void main(String[] args) {
//         System.out.println("Hola Mundo");

//         int contador = 0;
//         do {
//             System.out.println("Contador: " + contador);
//             contador++;
//         } while (contador < 5);
//     }
// }

// Ejemplo de ciclo for-each en Java: El ciclo `for-each` es una forma simplificada de iterar sobre elementos de una colección o un arreglo. La sintaxis del ciclo `for-each` es la siguiente: `for (tipo variable : colección) { // código a ejecutar }`. Aquí tienes un ejemplo de cómo usarlo:

public class Aplicacion { 
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        int[] numeros = {1, 2, 3, 4, 5};
        for (int numero : numeros) {
            System.out.println("Número: " + numero);
        }
    }
}
