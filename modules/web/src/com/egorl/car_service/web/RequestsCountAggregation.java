package com.egorl.car_service.web;

import com.egorl.car_service.entity.PurchaseRequest;
import com.haulmont.cuba.gui.data.aggregation.AggregationStrategy;

import java.util.Collection;
import java.util.List;

public class RequestsCountAggregation implements AggregationStrategy<PurchaseRequest, Integer> {
    @Override
    public Integer aggregate(Collection<PurchaseRequest> propertyValues) {
        return propertyValues.size();
    }

    @Override
    public Class<Integer> getResultClass() {
        return Integer.class;
    }
}
