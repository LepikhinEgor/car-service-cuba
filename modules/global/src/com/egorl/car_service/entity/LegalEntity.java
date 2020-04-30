package com.egorl.car_service.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Table(name = "CARSERVICE_LEGAL_ENTITY")
@Entity(name = "carservice_LegalEntity")
public class LegalEntity extends StandardEntity {
    private static final long serialVersionUID = -6645000748542165378L;

    @Column(name = "INN")
    private String inn;

    @Column(name = "NAME")
    private String name;

    @Lob
    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "TELEPHONE")
    private String telephone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }
}