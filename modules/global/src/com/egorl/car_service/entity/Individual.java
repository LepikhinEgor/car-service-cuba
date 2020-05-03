package com.egorl.car_service.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

//@NamePattern("%s %s|name, surname")
@DiscriminatorValue("INDIVIDUAL")
@Entity(name = "carservice_Individual")
public class Individual extends Person {
    private static final long serialVersionUID = -578139825523532705L;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}