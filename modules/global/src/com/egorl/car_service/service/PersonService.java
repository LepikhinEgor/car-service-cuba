package com.egorl.car_service.service;

import com.egorl.car_service.entity.Person;
import com.egorl.car_service.entity.PurchaseRequest;

import java.util.List;

public interface PersonService {
    String NAME = "carservice_PersonService";

    List<PurchaseRequest> getPurchaseRequests(Person person);
}