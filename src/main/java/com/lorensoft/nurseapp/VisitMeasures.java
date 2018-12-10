/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lorensoft.nurseapp;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author anbu6
 */

public class VisitMeasures implements Serializable {

 
    private Integer id;
  
    private BigDecimal measure1;
   
    private String measure2;
   
    private Visit visit;
   
    private VitalSign vitalSign;

    public VisitMeasures() {
    }

    public VisitMeasures(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMeasure1() {
        return measure1;
    }

    public void setMeasure1(BigDecimal measure1) {
        this.measure1 = measure1;
    }

    public String getMeasure2() {
        return measure2;
    }

    public void setMeasure2(String measure2) {
        this.measure2 = measure2;
    }

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }

    public VitalSign getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSign vitalSign) {
        this.vitalSign = vitalSign;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VisitMeasures)) {
            return false;
        }
        VisitMeasures other = (VisitMeasures) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lorensoft.nurseapp.VisitMeasures[ id=" + id + " ]";
    }
    
}
