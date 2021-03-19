/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.binarywebservice;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author shelc
 */
@Entity
@Table(name = "EMPLOYEEDATA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employeedata.findAll", query = "SELECT e FROM Employeedata e"),
    @NamedQuery(name = "Employeedata.findById", query = "SELECT e FROM Employeedata e WHERE e.id = :id"),
    @NamedQuery(name = "Employeedata.findByFilename", query = "SELECT e FROM Employeedata e WHERE e.filename = :filename")})
public class Employeedata implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "FILENAME")
    private String filename;
    @Lob
    @Column(name = "DATA")
    private byte[] data;

    public Employeedata() {
    }

    public Employeedata(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
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
        if (!(object instanceof Employeedata)) {
            return false;
        }
        Employeedata other = (Employeedata) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.binarywebservice.Employeedata[ id=" + id + " ]";
    }
    
}
