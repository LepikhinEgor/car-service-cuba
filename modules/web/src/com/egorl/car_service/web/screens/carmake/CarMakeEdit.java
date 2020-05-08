package com.egorl.car_service.web.screens.carmake;

import com.egorl.car_service.entity.CarEquipment;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.egorl.car_service.entity.CarMake;

import javax.inject.Inject;

@UiController("carservice_CarMake.edit")
@UiDescriptor("car-make-edit.xml")
@EditedEntityContainer("carMakeDc")
public class CarMakeEdit extends StandardEditor<CarMake> {

    @Inject
    private CollectionLoader<CarEquipment> carEquipmentsDl;

    @Subscribe
    protected void onBeforeShow(BeforeShowEvent event) {
        carEquipmentsDl.setParameter("carMake", getEditedEntity());
        getScreenData().loadAll();
    }
}