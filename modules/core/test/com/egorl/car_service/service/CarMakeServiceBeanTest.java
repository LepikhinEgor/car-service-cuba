package com.egorl.car_service.service;

import com.egorl.car_service.CarserviceTestContainer;
import com.egorl.car_service.entity.CarMake;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.Metadata;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarMakeServiceBeanTest {

    @RegisterExtension
    public static CarserviceTestContainer cont = CarserviceTestContainer.Common.INSTANCE;

    private static Metadata metadata;
    private static Persistence persistence;
    private static DataManager dataManager;

    private CarMakeService carMakeService = AppBeans.get(CarMakeService.class);

    @BeforeAll
    public static void beforeAll() throws Exception {
        metadata = cont.metadata();
        persistence = cont.persistence();
        dataManager = AppBeans.get(DataManager.class);
    }

    @Test
    @Ignore
    void getUnpaidCarMakes() {
        List<CarMake> unpaidMakes = carMakeService.getUnpaidCarMakes();
        unpaidMakes.forEach(cm -> System.out.println(cm.getName()));
    }
}