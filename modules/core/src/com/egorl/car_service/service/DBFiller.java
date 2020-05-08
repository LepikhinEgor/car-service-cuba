package com.egorl.car_service.service;

import com.egorl.car_service.config.CountryConfig;
import com.egorl.car_service.entity.Country;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.global.Events;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.sys.events.AppContextStartedEvent;
import com.haulmont.cuba.security.app.Authenticated;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class DBFiller {

    private CountryDaoService countryDao;

    private CountryConfig countryConfig;

    private Metadata metadata;

    @Inject
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @Inject
    public void setCountryDao(CountryDaoService countryDao) {
        this.countryDao = countryDao;
    }

    @Inject
    public void setCountryConfig(CountryConfig countryConfig) {
        this.countryConfig = countryConfig;
    }

    @Authenticated
    @EventListener(AppContextStartedEvent.class)
    @Order(Events.LOWEST_PLATFORM_PRECEDENCE + 100)
    public void fillDb() {
        Country defaultCountry = getDefaultCountry();

        if (countryDao.findByName(defaultCountry.getName()) == null)
            countryDao.create(defaultCountry);

    }

    private Country getDefaultCountry() {
        Country country = metadata.create(Country.class);

        country.setName(countryConfig.getDefaultCountryName());
        country.setCode(countryConfig.getDefaultCountryCode());

        return country;
    }
}
