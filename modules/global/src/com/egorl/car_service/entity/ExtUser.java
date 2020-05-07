package com.egorl.car_service.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Extends;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;

@Entity(name = "carservice_ExtUser")
@Extends(User.class)
public class ExtUser extends User {
    private static final long serialVersionUID = 3509325227726920140L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEFAULT_COUNTRY_ID")
    private Country defaultCountry;

    public Country getDefaultCountry() {
        return defaultCountry;
    }

    public void setDefaultCountry(Country defaultCountry) {
        this.defaultCountry = defaultCountry;
    }
}