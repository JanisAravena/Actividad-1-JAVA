package clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Persona {
    //Atributos privados
    private String nombre;
    private LocalDate fechaNacimiento;
    private int edad;

    //metodo constructor
    public Persona() {
        this.nombre = "";
        this.fechaNacimiento = LocalDate.now();
        this.edad = 0;
    }

    //metodo constructor con parametros
    // public Persona(String nombre, String fechaNacimiento, int edad) {
    //     this.nombre = nombre;
    //     this.edad = edad;

    //     DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    //     LocalDate fechaFormato = LocalDate.parse(fechaNacimiento, formato);

    //     this.fechaNacimiento = fechaFormato;
    // }

        public Persona(String nombre, String fechaNacimiento) {
        this.nombre = nombre;

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaFormato = LocalDate.parse(fechaNacimiento, formato);

        this.fechaNacimiento = fechaFormato;
        this.edad = calcularEdad();
    }

    //metodos getter y setter
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
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formato);
        this.edad = calcularEdad();
    }

    public int getEdad() {
        return edad;
    }

    // public void setEdad(int edad) {
    //     this.edad = edad;
    // }

    //metodo de instancia
    public int calcularEdad() {
        Period diferencia = Period.between(this.fechaNacimiento, LocalDate.now());
        int edadCalculada = diferencia.getYears();
        return edadCalculada;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Fecha de nacimiento: " + fechaNacimiento + " | Edad: " + edad;
    }
    
}   
