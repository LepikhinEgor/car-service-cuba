package com.egorl.car_service.entity;

import com.egorl.car_service.service.CountryService;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.sys.AppContext;

import javax.inject.Inject;
import javax.persistence.*;

@NamePattern("%s|name")
@Table(name = "CARSERVICE_CAR_DEALER")
@Entity(name = "carservice_CarDealer")
public class CarDealer extends StandardEntity {
    private static final long serialVersionUID = 1512823975050809729L;

    @Column(name = "NAME", unique = true, nullable = false)
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID")
    private Country country;
    @Column(name = "CODE", unique = true, nullable = false)
    private Integer code;
    @Transient
    private CountryService countryService;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}