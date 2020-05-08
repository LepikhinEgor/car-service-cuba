package com.egorl.car_service.web.screens.managerrequests;

import com.egorl.car_service.entity.PurchaseRequest;
import com.haulmont.cuba.gui.components.LookupPickerField;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.security.entity.User;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@UiController("carservice_ManagerRequests")
@UiDescriptor("manager-requests.xml")
@LoadDataBeforeShow
public class ManagerRequests extends Screen {

    @Inject
    LookupPickerField<User> managerLookup;

    @Inject
    CollectionLoader<PurchaseRequest> requestsDl;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        requestsDl.setParameter("manager", null);
        managerLookup.addValueChangeListener(e-> managerChangedAction(e.getValue()));
    }

    private void managerChangedAction(User manager) {
        requestsDl.setParameter("manager", manager);
        requestsDl.load();
    }
}