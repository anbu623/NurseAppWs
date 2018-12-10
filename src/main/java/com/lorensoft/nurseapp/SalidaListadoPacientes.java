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
public class SalidaListadoPacientes {

    List<Pacient> pacientes;

    public SalidaListadoPacientes() {
    }

    public SalidaListadoPacientes(List<Pacient> pacientes) {
        this.pacientes = pacientes;
    }

    public List<Pacient> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Pacient> pacientes) {
        this.pacientes = pacientes;
    }
    
}
