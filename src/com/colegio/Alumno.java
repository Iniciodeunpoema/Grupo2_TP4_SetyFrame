
package com.colegio;

import java.util.HashSet;

public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materiasInsciptas;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materiasInsciptas = new HashSet<>();
    }
    
    public void agregarMateria(Materia materia) {
        if (! materiasInsciptas.contains(materia)) {
            materiasInsciptas.add(materia);
            System.out.println(nombre + " inscripto en " + materia.getNombre());
        }else {
            System.out.println(nombre + " ya esta inscripto en " + materia.getNombre());
        }
    }
    
    public int cantidadDeMaterias() {
        return materiasInsciptas.size();
    }
    
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
