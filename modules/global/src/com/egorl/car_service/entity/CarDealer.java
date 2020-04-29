package com.egorl.car_service.entity;

import com.egorl.car_service.service.CountryService;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.sys.AppContext;

import javax.inject.Inject;
import javax.persistence.*;

@Table(name = "CARSERVICE_CAR_DEALER")
@Entity(name = "carservice_CarDealer")
public class CarDealer extends StandardEntity {
    private static final long serialVersionUID = 1512823975050809729L;

    @Transient
    private CountryService countryService;

    @Column(name = "NAME", unique = true, nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID")
    private Country country;

    @Column(name = "CODE", unique = true, nullable = false)
    private Integer code;

    @PrePersist
    public void prePersist() {
        countryService = AppContext.getApplicationContext().getBean(CountryService.class); //??? Иожно ли иначе, через Inject
        if (country == null)
            country = countryService.getDefaultCountry();
    }

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