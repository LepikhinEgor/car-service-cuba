package com.egorl.car_service.web.screens.carequipment;

import com.egorl.car_service.entity.CarMake;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.egorl.car_service.entity.CarEquipment;

import javax.inject.Inject;

@UiController("carservice_CarEquipment.edit")
@UiDescriptor("car-equipment-edit.xml")
@EditedEntityContainer("carEquipmentDc")
@LoadDataBeforeShow
public class CarEquipmentEdit extends StandardEditor<CarEquipment> {

//    @Inject
//    private CollectionLoader<CarMake> carMakesDl;
//
//    @Subscribe
//    protected void onBeforeShow(BeforeShowEvent event) {
//        carMakesDl.setParameter("carEquip", getEditedEntity());
//        getScreenData().loadAll();
//    }
}