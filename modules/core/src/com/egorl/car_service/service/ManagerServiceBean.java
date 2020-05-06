package com.egorl.car_service.service;

import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.TypedQuery;
import com.haulmont.cuba.security.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

@Service(ManagerService.NAME)
public class ManagerServiceBean implements ManagerService {

    @Inject
    private Persistence persistence;

    @Override
    @Transactional(isolation = Isolation.READ_UNCOMMITTED, readOnly = true)
    public Integer getPurchaseRequestsCount(User user) {
        EntityManager em = persistence.getEntityManager();
        // create and execute Query
        TypedQuery<Integer> query = em.createQuery(
                "select COUNT(pr) from carservice_PurchaseRequest pr where pr.manager = :manager", Integer.class);
        query.setParameter("manager", user);

        return query.getSingleResult();
    }
}