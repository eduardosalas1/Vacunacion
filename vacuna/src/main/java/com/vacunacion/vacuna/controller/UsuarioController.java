package com.vacunacion.vacuna.controller;


import com.vacunacion.vacuna.Entity.CentroVacuna;
import java.util.*;


public class UsuarioController{


    CentroVacunaController centroVacunaController;


    public UsuarioController(){
        //Constructor por defecto
    }

    public void darAlta(String nombre){

        List<CentroVacuna> centros = centroVacunaController.getCentros();

        for(int i = 0 ; i < centros.size() ; i++){
            if(nombre == centros.get(i).getNombre()){
                centros.get(i).setEstado(1);
            }
        }

    }

    public Integer coberturaVacunados(){
        return centroVacunaController.coberturaVacunados();
    }


}