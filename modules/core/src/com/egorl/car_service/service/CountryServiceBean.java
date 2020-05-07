package com.egorl.car_service.service;

import com.egorl.car_service.config.CountryConfig;
import com.egorl.car_service.entity.Country;
import com.egorl.car_service.entity.ExtUser;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.UserSessionSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

@Service(CountryService.NAME)
public class CountryServiceBean implements CountryService {

    @Inject
    private CountryConfig countryConfig;

    @Inject
    private UserSessionSource userSessionSource;

    @Inject
    private CountryDaoService countryDao;

    @Inject
    private ExtUserService extUserService;

    @Override
    @Transactional
    public Country getDefaultCountry() {
        Country defaultCountry;
        ExtUser extUser = extUserService.getById(userSessionSource.currentOrSubstitutedUserId());

        if (extUser.getDefaultCountry() == null) {
            String countryName = countryConfig.getDefaultCountryName();
            defaultCountry = countryDao.findByName(countryName);
        } else
            defaultCountry = extUser.getDefaultCountry();

        return defaultCountry;
    }

}