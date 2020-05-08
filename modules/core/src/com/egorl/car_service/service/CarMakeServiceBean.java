package com.egorl.car_service.service;

import com.egorl.car_service.entity.CarMake;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.TypedQuery;
import com.haulmont.cuba.core.global.View;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

@Service(CarMakeService.NAME)
public class CarMakeServiceBean implements CarMakeService {

    private Persistence persistence;

    @Inject
    public void setPersistence(Persistence persistence) {
        this.persistence = persistence;
    }

    @Override
    @Transactional
    public List<CarMake> getUnpaidCarMakes(View view) {
        EntityManager em = persistence.getEntityManager();

        TypedQuery<CarMake> query = em.createQuery(
                "select distinct c.carMake from carservice_Car c left join carservice_PurchaseRequest pr on pr.car = c where pr is null or c not in " +
                        "(select c1 from carservice_Car c1 inner join carservice_PurchaseRequest pr1 on pr1.car = c1 where pr1.wasPaid = true)", CarMake.class);

        query.setView(view);

        return query.getResultList();
    }
}