package com.egorl.car_service.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Extends;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "carservice_ExtUser")
@Extends(User.class)
public class ExtUser extends User {
    private static final long serialVersionUID = 3509325227726920140L;

    @Column(name = "DEFAULT_COUNTRY")
    private String defaultCountry;

    public String getDefaultCountry() {
        return defaultCountry;
    }

    public void setDefaultCountry(String defaultCountry) {
        this.defaultCountry = defaultCountry;
    }
}