package com.egorl.car_service.service;

import com.egorl.car_service.CarserviceTestContainer;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.global.AppBeans;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.junit.jupiter.api.Assertions.*;

class CountryServiceBeanTest {

    @RegisterExtension
    public static CarserviceTestContainer cont = CarserviceTestContainer.Common.INSTANCE;

    private static Persistence persistence;

    private CountryService countryService = AppBeans.get(CountryService.class);

    @BeforeAll
    public static void beforeAll() throws Exception {
        persistence = cont.persistence();
    }


    @Test
    @Ignore
    void getDefaultCountry() {
        System.out.println(countryService.getDefaultCountry().getName());
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}