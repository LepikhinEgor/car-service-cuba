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

    private CountryConfig countryConfig;

    private UserSessionSource userSessionSource;

    private CountryDaoService countryDao;

    private ExtUserService extUserService;

    @Inject
    public void setUserSessionSource(UserSessionSource userSessionSource) {
        this.userSessionSource = userSessionSource;
    }

    @Inject
    public void setExtUserService(ExtUserService extUserService) {
        this.extUserService = extUserService;
    }

    @Inject
    public void setCountryDao(CountryDaoService countryDao) {
        this.countryDao = countryDao;
    }

    @Inject
    public void setCountryConfig(CountryConfig countryConfig) {
        this.countryConfig = countryConfig;
    }

    @Override
    @Transactional
    public Country getUserDefaultCountry() {
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