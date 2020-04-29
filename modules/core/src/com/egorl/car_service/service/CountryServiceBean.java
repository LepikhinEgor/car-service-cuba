package com.egorl.car_service.service;

import com.egorl.car_service.config.CountryConfig;
import com.egorl.car_service.entity.Country;
import com.haulmont.cuba.core.global.Metadata;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service(CountryService.NAME)
public class CountryServiceBean implements CountryService {

    @Inject
    private CountryConfig countryConfig;

    @Inject
    private Metadata metadata;

    @Override
    public Country getDefaultCountry() {
        Country country = metadata.create(Country.class);

        country.setName(countryConfig.getDefaultCountryName());
        country.setCode(countryConfig.getDefaultCountryCode());

        return country;
    }
}