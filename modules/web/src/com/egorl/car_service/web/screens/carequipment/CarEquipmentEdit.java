package com.egorl.car_service.web.screens.carequipment;

import com.haulmont.cuba.gui.screen.*;
import com.egorl.car_service.entity.CarEquipment;

@UiController("carservice_CarEquipment.edit")
@UiDescriptor("car-equipment-edit.xml")
@EditedEntityContainer("carEquipmentDc")
@LoadDataBeforeShow
public class CarEquipmentEdit extends StandardEditor<CarEquipment> {
}