package com.egorl.car_service.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

//@NamePattern("%s|name")
@DiscriminatorValue("LEGAL")
@Entity(name = "carservice_LegalEntity")
public class LegalEntity extends Person {
    private static final long serialVersionUID = -6645000748542165378L;

    @Column(name = "INN")
    private String inn;

    @Column(name = "LEGAL_NAME")
    private String legalName;

    @Lob
    @Column(name = "ADDRESS")
    private String address;

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
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