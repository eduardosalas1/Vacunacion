package com.vacunacion.vacuna.controller;

import com.vacunacion.vacuna.Entity.CentroVacuna;
import java.util.*;

public class CentroVacunaController{


    List<CentroVacuna> Centros = new ArrayList();

    public CentroVacunaController(){
        //Constructor por defecto
    }

    public void addCentro(CentroVacuna centro){
        this.Centros.add(centro);
    }

    public Integer sizeCentros(){
        return this.Centros.size();
    }

    public Integer numPersVacunadas(){
        Integer counter = 0;
        for(int i = 0 ; i < Centros.size() ; i++){
            counter += Centros.get(i).PersonasVacunadas();
        }

        return counter ;
    }

    public List<CentroVacuna> getCentros() {
        return this.Centros;
    }

    public Integer coberturaVacunados(){
        return (numPersVacunadas()/22935533)*100;
    }
}

