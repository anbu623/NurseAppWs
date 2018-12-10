/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lorensoft.nurseapp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author anbu6
 */
@Entity
@Table(name = "vital_sign")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VitalSign.findAll", query = "SELECT v FROM VitalSign v")})
public class VitalSign implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Size(max = 150)
    @Column(name = "name")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "min_range")
    private BigDecimal minRange;
    @Column(name = "max_range")
    private BigDecimal maxRange;
    @Size(max = 50)
    @Column(name = "metric")
    private String metric;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vitalSign")
    private Collection<VisitMeasures> visitMeasuresCollection;

    public VitalSign() {
    }

    public VitalSign(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMinRange() {
        return minRange;
    }

    public void setMinRange(BigDecimal minRange) {
        this.minRange = minRange;
    }

    public BigDecimal getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(BigDecimal maxRange) {
        this.maxRange = maxRange;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    @XmlTransient
    public Collection<VisitMeasures> getVisitMeasuresCollection() {
        return visitMeasuresCollection;
    }

    public void setVisitMeasuresCollection(Collection<VisitMeasures> visitMeasuresCollection) {
        this.visitMeasuresCollection = visitMeasuresCollection;
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
        if (!(object instanceof VitalSign)) {
            return false;
        }
        VitalSign other = (VitalSign) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lorensoft.nurseapp.VitalSign[ id=" + id + " ]";
    }
    
}
