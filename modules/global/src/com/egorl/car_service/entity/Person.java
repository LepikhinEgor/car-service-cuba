package com.egorl.car_service.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@NamePattern("%s|telephone")
@Entity(name = "carservice_Person")
@Table(name = "CARSERVICE_PERSON")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
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