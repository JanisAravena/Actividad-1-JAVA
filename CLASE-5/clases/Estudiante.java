package clases;

import java.util.ArrayList;
import java.util.Random;

public class Estudiante extends Persona implements Calculos {
    private int nroLegajo;
    private String bootcamp;
    private String cohorte;
    private ArrayList<Integer> calificaciones;
    public static ArrayList<Integer> legajos = new ArrayList<>();

    public Estudiante() {
        super();
        this.nroLegajo = 0;
        this.bootcamp = "";
        this.cohorte = "";
        this.calificaciones = new ArrayList<>();
    }

    public Estudiante(String nombre, String fechaNacimiento, String email, String bootcamp, String cohorte) {
        super(nombre, fechaNacimiento, email);
        this.nroLegajo = generarNroLegajo();
        this.bootcamp = bootcamp;
        this.cohorte = cohorte;
        this.calificaciones = new ArrayList<>();
        Estudiante.legajos.add(this.nroLegajo);
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public String getBootcamp() {
        return bootcamp;
    }

    public void setBootcamp(String bootcamp) {
        this.bootcamp = bootcamp;
    }

    public String getCohorte() {
        return cohorte;
    }

    public void setCohorte(String cohorte) {
        this.cohorte = cohorte;
    }

    public static ArrayList<Integer> getLegajos() {
        return legajos;
    }

    public ArrayList<Integer> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Integer> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public void agregarCalificacion(int calificacion) {
        this.calificaciones.add(calificacion);
    }

    private int generarNroLegajo() {
        Random random = new Random();
        int numeroGenerado = random.nextInt(9000) + 1000;
        if (Estudiante.legajos.contains(numeroGenerado)) {
            return this.generarNroLegajo();
        }
        return numeroGenerado;
    }

    @Override
    public String toString() {
        return "Estudiantes:" + super.toString() + " | nroLegajo: " + nroLegajo + " | Bootcamp: " + bootcamp
                + " | Cohorte: " + cohorte + " | Calificaciones: " + calificaciones;
    }

    @Override
    public String verCalificaciones() {
        return super.getNombre() + ": " + calificaciones;
    }

    @Override
    public double calcularPromedioCalificaciones() {
        double suma = 0;
        for (int i = 0; i < calificaciones.size(); i++) {
            suma += calificaciones.get(i);
        }
        return suma / calificaciones.size();

    }
}