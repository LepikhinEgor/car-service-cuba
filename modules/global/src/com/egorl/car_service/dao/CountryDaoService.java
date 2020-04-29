package com.egorl.car_service.dao;

import com.egorl.car_service.entity.Country;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public interface CountryDaoService {
    String NAME = "carservice_CountryDaoService";

    void create(Country country);
}