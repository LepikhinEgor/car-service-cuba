package com.egorl.car_service.service;

import com.egorl.car_service.entity.CarMake;

import java.util.List;

public interface CarMakeService {
    String NAME = "carservice_CarMakeService";

    List<CarMake> getUnpaidCarMakes();
}