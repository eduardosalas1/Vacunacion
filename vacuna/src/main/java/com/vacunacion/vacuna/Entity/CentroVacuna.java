package com.vacunacion.vacuna.Entity;

import java.util.*;

public class CentroVacuna{

    String nombre;
    Integer estado = 0;

    List<Personas> listaPersonas;


    public CentroVacuna(String nombre, Integer estado){

        this.nombre = nombre;

        if(estado > 0){
            this.estado = 1;
        }
        else {

            this.estado = 0;
        }

        this.listaPersonas = new ArrayList();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public void addPersona(Personas persona){
        persona.estaVacunado();
        listaPersonas.add(persona);
    }

    public Integer rangos(Integer r1, Integer r2){

        Integer counter = 0;
        for (int i = 0 ; i < listaPersonas.size() ; i++){
            if(listaPersonas.get(i).edad >= r1 && listaPersonas.get(i).edad <= r2){
                counter++;
            }
        }

        return counter;
    }

    public Integer PersonasVacunadas(){
        return this.listaPersonas.size();
    }


}