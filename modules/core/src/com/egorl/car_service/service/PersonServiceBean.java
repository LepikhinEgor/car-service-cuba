package com.egorl.car_service.service;

import com.egorl.car_service.entity.Person;
import com.egorl.car_service.entity.PurchaseRequest;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.TypedQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

@Service(PersonService.NAME)
public class PersonServiceBean implements PersonService {

    private Persistence persistence;

    @Inject
    public void setPersistence(Persistence persistence) {
        this.persistence = persistence;
    }

    @Override
    @Transactional
    public List<PurchaseRequest> getPurchaseRequests(Person person) {
        EntityManager entityManager = persistence.getEntityManager();

        TypedQuery<PurchaseRequest> query = entityManager.createQuery(
                "select pr from carservice_PurchaseRequest pr where pr.buyer = :buyer", PurchaseRequest.class);
        query.setParameter("buyer", person);

        return query.getResultList();
    }
}