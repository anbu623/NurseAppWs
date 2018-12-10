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
public class SalidaListadoVisitas {
    private List<Visit> visitas;

    public SalidaListadoVisitas() {
    }

    public SalidaListadoVisitas(List<Visit> visitas) {
        this.visitas = visitas;
    }

    public List<Visit> getVisitas() {
        return visitas;
    }

    public void setVisitas(List<Visit> visitas) {
        this.visitas = visitas;
    }
    
}
