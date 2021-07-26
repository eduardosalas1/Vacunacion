package com.vacunacion.vacuna.Entity;

public class Personas{

    String nombre;
    Integer edad;
    boolean vacunado;

    public Personas(String nombre, Integer edad){

        this.nombre = nombre;
        this.edad = edad;

    }

    public void estaVacunado(){
        this.vacunado = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public boolean isVacunado() {
        return vacunado;
    }




}