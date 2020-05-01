package com.egorl.car_service.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
public class Person extends StandardEntity {
    private static final long serialVersionUID = -4739312890935052914L;

    @Column(name = "TELEPHONE", nullable = false)
    protected String telephone;

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}