package com.egorl.car_service.service;

import com.egorl.car_service.CarserviceTestContainer;
import com.egorl.car_service.config.CountryConfig;
import com.egorl.car_service.entity.Country;
import com.egorl.car_service.entity.ExtUser;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.UserSessionSource;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.UUID;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@ExtendWith(MockitoExtension.class)
class CountryServiceBeanTest {


    @Mock
    CountryDaoService countryDao;

    @Mock
    ExtUserService extUserService;

    @Mock
    UserSessionSource sessionSource;

    @Mock
    CountryConfig countryConfig;

    @InjectMocks
    CountryService countryService = new CountryServiceBean();


    @Before
    public void createMocks() {
        MockitoAnnotations.initMocks(this);
    }

    private Country getUserCountry() {
        Country country = new Country();
        country.setName("Russia");
        country.setCode(8);

        return country;
    }

    private ExtUser getFilledExtUser() {
        ExtUser extUser = new ExtUser();
        extUser.setDefaultCountry(getUserCountry());

        return extUser;
    }

    private Country getPropsCountry() {
        Country country = new Country();
        country.setName("Germany");
        country.setCode(5);

        return country;
    }

    @Test
    void getDefaultUserCountry_UserHasDefaultCountry() {
        when(extUserService.getById(any())).thenReturn(getFilledExtUser());

        Country defaultCountry = countryService.getUserDefaultCountry();

        assertEquals(getUserCountry().getName(), defaultCountry.getName());
        assertEquals(getUserCountry().getCode(), defaultCountry.getCode());
    }

    @Test
    void getDefaultUserCountry_UserHasNotDefaultCountry() {
        when(extUserService.getById(any())).thenReturn(new ExtUser());
        when(countryDao.findByName(any())).thenReturn(getPropsCountry());

        Country defaultCountry = countryService.getUserDefaultCountry();

        assertEquals("Germany", defaultCountry.getName());
        assertEquals(Integer.valueOf(5), defaultCountry.getCode());
    }
}