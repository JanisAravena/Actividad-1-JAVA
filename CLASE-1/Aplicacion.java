// El código que has proporcionado es un programa simple en Java que imprime "Hola Mundo"
//  en la consola. Aquí te explico cada parte del código:

// 1. `public class Aplicacion {`
//    - Esta línea declara una clase pública llamada `Aplicacion`. En Java, todo el código debe estar dentro de una clase. El nombre de la clase debe coincidir con el nombre del archivo (en este caso, `Aplicacion.java`).        
// 2. `public static void main(String[] args) {`
//    - Esta línea declara el método `main`, que es el punto de entrada de cualquier
//      programa Java. El método `main` es donde el programa comienza a ejecutarse.
//    - `public` significa que el método es accesible desde cualquier parte del programa.
//    - `static` significa que el método pertenece a la clase y no a una instancia de la clase.
//    - `void` indica que el método no devuelve ningún valor.
//    - `String[] args` es un parámetro que permite al programa recibir argumentos desde la línea de comandos.
//  En este caso, no se están utilizando argumentos, pero es una parte estándar de la declaración del método `main`.
// 3. `System.out.println("Hola Mundo");`
//    - Esta línea es la que realmente imprime el mensaje "Hola Mundo" en la consola.
//    - `System` es una clase predefinida en Java que proporciona acceso a
//      funcionalidades del sistema, como la entrada y salida de datos.
//    - `out` es un objeto de la clase `System` que representa la salida estándar (la consola).
//    - `println` es un método que imprime el texto proporcionado y
//  luego mueve el cursor a la siguiente línea. En este caso, imprime "Hola Mundo".

public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");


// cuales son los tipos de datos primitivos en Java? En Java, los tipos de datos primitivos son los tipos de datos básicos que no son objetos. Estos tipos de datos se utilizan para almacenar valores simples. Los tipos de datos primitivos en Java son los siguientes:
// 1. `byte`: Un entero de 8 bits con signo. Rango: -128 a 127.
// 2. `short`: Un entero de 16 bits con signo. Rango: -32,768 a 32,767.
// 3. `int`: Un entero de 32 bits con signo. Rango: -2,147,483,648 a 2,147,483,647.
// 4. `long`: Un entero de 64 bits con signo. Rango: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807.   
// 5. `float`: Un número de punto flotante de 32 bits. Rango: aproximadamente ±3.40282347E+38F (6-7 dígitos decimales).
// 6. `double`: Un número de punto flotante de 64 bits. Rango:
//     aproximadamente ±1.79769313486231570E+308 (15 dígitos decimales).   
// 7. `char`: Un carácter Unicode de 16 bits. Rango: '\u0000' (0) a '\uffff' (65,535).
// 8. `boolean`: Un tipo de dato que puede tener solo dos valores: `true` o `false`. Se utiliza para representar valores lógicos.
// Estos tipos de datos primitivos son fundamentales en Java y se utilizan para almacenar y manipular datos simples en los programas.  

//Cuales son las clases envolventes en Java? En Java, las clases envolventes (wrapper classes) son clases que proporcionan una representación de objetos para los tipos de datos primitivos. Estas clases permiten tratar los tipos de datos primitivos como objetos, lo que es útil en situaciones donde se requieren objetos, como en colecciones o al utilizar métodos que esperan objetos. Las clases envolventes correspondientes a cada tipo de dato primitivo son las siguientes:
// 1. `Byte`: Envoltorio para el tipo de dato primitivo `byte`.
// 2. `Short`: Envoltorio para el tipo de dato primitivo `short`.
// 3. `Integer`: Envoltorio para el tipo de dato primitivo `int`.
// 4. `Long`: Envoltorio para el tipo de dato primitivo `long`.
// 5. `Float`: Envoltorio para el tipo de dato primitivo `float`.   
// 6. `Double`: Envoltorio para el tipo de dato primitivo `double`.
// 7. `Character`: Envoltorio para el tipo de dato primitivo `char`.
// 8. `Boolean`: Envoltorio para el tipo de dato primitivo `boolean`.
// 9. String: Aunque no es una clase envolvente para un tipo de dato primitivo, `String` es una clase muy utilizada en Java para representar cadenas de texto. Es una clase inmutable, lo que significa que una vez creada, su valor no puede cambiar. Las clases envolventes proporcionan métodos para convertir entre tipos de datos primitivos y objetos, así como para realizar operaciones adicionales. Por ejemplo, la clase `Integer` tiene métodos para convertir un `int` a una cadena de texto o para comparar dos objetos `Integer`. Las clases envolventes son parte del paquete `java.lang` y se importan automáticamente en cualquier programa Java.
// Estas clases envolventes proporcionan métodos para convertir entre tipos de datos primitivos y objetos, así como para realizar operaciones adicionales. Por ejemplo, la clase `Integer` tiene métodos para convertir un `int` a una cadena de texto o para comparar dos objetos `Integer`. Las clases envolventes son parte del paquete `java.lang` y se importan automáticamente en cualquier programa Java.

// variable para devolver la edad de una persona, se podría declarar una variable de tipo `int` para almacenar la edad, ya que la edad es un número entero. Por ejemplo:
// ```javaint edad = 25;
// ```
// En este ejemplo, se declara una variable llamada `edad` de tipo `int` y se le asigna el valor `25`, que representa la edad de una persona. Puedes cambiar el valor de `edad` según sea necesario para representar diferentes edades.

int edad = 25;
float altura = 1.75f;
// En este ejemplo, se declara una variable llamada `altura` de tipo `float` y se le asigna el valor `1.75f`, que representa la altura de una persona en metros. El sufijo `f` se utiliza para indicar que el número es un literal de tipo `float`. Si no se incluye el sufijo, el número se tratará como un `double` por defecto. Puedes cambiar el valor de `altura` según sea necesario para representar diferentes alturas.

double peso = 70.5;
// En este ejemplo, se declara una variable llamada `peso` de tipo `double` y
// se le asigna el valor `70.5`, que representa el peso de una persona en kilogramos. El tipo `double` es adecuado para almacenar valores de punto flotante con mayor precisión que el tipo `float`. Puedes cambiar el valor de `peso` según sea necesario para representar diferentes pesos.

long distancia = 100000L;
// En este ejemplo, se declara una variable llamada `distancia` de tipo `long` y se le asigna el valor `100000L`, que representa una distancia en metros. El sufijo `L` se utiliza para indicar que el número es un literal de tipo `long`. Si no se incluye el sufijo, el número se tratará como un `int` por defecto. Puedes cambiar el valor de `distancia` según sea necesario para representar diferentes distancias.

boolean esEstudiante = true;
// En este ejemplo, se declara una variable llamada `esEstudiante` de tipo `boolean` y se le asigna el valor `true`, que indica que la persona es un estudiante. El tipo `boolean` solo puede tener dos valores: `true` o `false`. Puedes cambiar el valor de `esEstudiante` a `false` si la persona no es un estudiante.

char letra = 'A';
// En este ejemplo, se declara una variable llamada `letra` de tipo `char` y se le asigna el valor `'A'`, que representa un carácter. El tipo `char` se utiliza para almacenar un solo carácter Unicode. Puedes cambiar el valor de `letra` a cualquier otro carácter según sea necesario.

String nombre = "Juan";
// En este ejemplo, se declara una variable llamada `nombre` de tipo `String` y se le asigna el valor `"Juan"`, que representa el nombre de una persona. La clase `String` se utiliza para almacenar cadenas de texto. Puedes cambiar el valor de `nombre` a cualquier otra cadena de texto según sea necesario.

System.out.println("Edad: " + edad);
System.out.println("Altura: " + altura);
System.out.println("Peso: " + peso);
System.out.println("Distancia: " + distancia);
System.out.println("Es estudiante: " + esEstudiante);
System.out.println("Letra: " + letra);
System.out.println("Nombre: " + nombre);

//Ejemplo de casting en Java: El casting es el proceso de convertir un tipo de dato a otro. En Java, existen dos tipos de casting: el casting implícito y el casting explícito.
// 1. Casting implícito: Ocurre cuando se asigna un valor de un tipo de dato más pequeño a un tipo de dato más grande. Por ejemplo:
int numeroEntero = 100;
long numeroLargo = numeroEntero; // Casting implícito de int a long
// En este ejemplo, se asigna el valor de `numeroEntero` (que es
// un `int`) a `numeroLargo` (que es un `long`). El casting implícito ocurre automáticamente porque un `long` puede almacenar un valor más grande que un `int` sin pérdida de información.
// 2. Casting explícito: Ocurre cuando se asigna un valor de un
// tipo de dato más grande a un tipo de dato más pequeño, lo que puede resultar en pérdida de información. En este caso, se debe realizar un casting explícito utilizando paréntesis. Por ejemplo:
double numeroDecimal = 3.14;
int numeroEntero2 = (int) numeroDecimal; // Casting explícito de double a int
// En este ejemplo, se asigna el valor de `numeroDecimal` (que es un `double`) a `numeroEntero2` (que es un `int`). El casting explícito se realiza utilizando `(int)` antes de la variable `numeroDecimal`. Esto convertirá el valor de `3.14` a `3`, perdiendo la parte decimal. Es importante tener cuidado al realizar castings explícitos, ya que pueden resultar en pérdida de información o en errores si el valor no se puede convertir adecuadamente.



    }
}