/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lorensoft.nurseapp;

import java.util.List;

/**
 *
 * @author anbu6
 */
public class SalidaListadoVisitasMedidas {
    private List<VisitMeasures> visitasMedidas;

    public List<VisitMeasures> getVisitasMedidas() {
        return visitasMedidas;
    }

    public void setVisitasMedidas(List<VisitMeasures> visitasMedidas) {
        this.visitasMedidas = visitasMedidas;
    }

    public SalidaListadoVisitasMedidas(List<VisitMeasures> visitasMedidas) {
        this.visitasMedidas = visitasMedidas;
    }

    public SalidaListadoVisitasMedidas() {
    }


    
}
