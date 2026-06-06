package clases;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    // Atributos privados
    private String nombre;
    private LocalDate fechaNacimiento;
    private int edad;
    private String email;
    private int id;
    public static int incrementId = 1;

    // metodo constructor
    public Persona() {
        /*
         * this.nombre = "";
         * this.fechaNacimiento = LocalDate.now();
         * this.edad = 0;
         * this.email = "";
         */
        this("", LocalDate.now().toString(), "");
    }

    // metodo constructor con parametros
    // public Persona(String nombre, String fechaNacimiento, int edad) {
    // this.nombre = nombre;
    // this.edad = edad;

    // DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    // LocalDate fechaFormato = LocalDate.parse(fechaNacimiento, formato);

    // this.fechaNacimiento = fechaFormato;
    // }

    public Persona(String nombre, String fechaNacimiento) {
        /*
         * this.nombre = nombre;
         * this.fechaNacimiento =
         * ManejoDeFechas.convertirStringALocalDate(fechaNacimiento);
         * this.edad = calcularEdad();
         * this.email = "";
         */
        this(nombre, fechaNacimiento, "");
    }

    // contructor con email
    public Persona(String nombre, String fechaNacimiento, String email) {
        this.nombre = nombre;
        this.fechaNacimiento = ManejoDeFechas.convertirStringALocalDate(fechaNacimiento);
        this.edad = calcularEdad();
        this.email = email;
        this.id = Persona.incrementId++;
    }

    // metodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = ManejoDeFechas.convertirStringALocalDate(fechaNacimiento);
        this.edad = calcularEdad();
    }

    public int getEdad() {
        return edad;
    }

    // public void setEdad(int edad) {
    // this.edad = edad;
    // }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIncrementId() {
        return incrementId;
    }

    public static void setIncrementId(int incrementId) {
        Persona.incrementId = incrementId;
    }

    // metodo de instancia
    public int calcularEdad() {
        Period diferencia = Period.between(this.fechaNacimiento, LocalDate.now());
        int edadCalculada = diferencia.getYears();
        return edadCalculada;
    }

    @Override
    public String toString() {
        return " ID: " + id + " | Nombre: " + nombre + " | Fecha de nacimiento: " + fechaNacimiento + " | Edad: " + edad
                + " | Email: " + email;
    }

}
