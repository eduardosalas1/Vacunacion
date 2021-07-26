package com.vacunacion.vacuna.Controller;

import com.vacunacion.vacuna.Entity.CentroVacuna;
import java.util.*;

public class CentroVacunaController{

    Integer OchentaMas = 647355;
    Integer SetentaAsetentaNueve = 1271842;
    Integer SesentaAsesentaNueve = 2221241;
    Integer CincuentaAcincuentaNueve = 3277134;
    Integer CuarentaCuarentanueve = 4183174;
    Integer TreintaTreintaNueve = 5031117;
    Integer DieciochoVeinteNueve = 6303670;

    List<CentroVacuna> Centros = new ArrayList();

    public CentroVacunaController(){}

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

    public Integer Cobertura(){
        Integer numero = (numPersVacunadas()/22935533)*100;

        return numero;
    }
}

