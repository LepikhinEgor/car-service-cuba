package com.egorl.car_service.service;

import com.egorl.car_service.entity.CarMake;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.TypedQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

@Service(CarMakeService.NAME)
public class CarMakeServiceBean implements CarMakeService {

    @Inject
    private Persistence persistence;

    @Override
    @Transactional
    public List<CarMake> getUnpaidCarMakes() {
        EntityManager em = persistence.getEntityManager();

        TypedQuery<CarMake> query = em.createQuery(
                "select distinct c.carMake from carservice_Car c left join carservice_PurchaseRequest pr on pr.car = cr", CarMake.class);

        return query.getResultList();
    }
}