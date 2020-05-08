package com.egorl.car_service.service;

import com.egorl.car_service.entity.Country;

public interface CountryService {
    String NAME = "carservice_CountryService";

    public Country getUserDefaultCountry();
}