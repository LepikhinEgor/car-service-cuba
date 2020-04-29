package com.egorl.car_service.web.screens.carequipment;

import com.haulmont.cuba.gui.screen.*;
import com.egorl.car_service.entity.CarEquipment;

@UiController("carservice_CarEquipment.browse")
@UiDescriptor("car-equipment-browse.xml")
@LookupComponent("carEquipmentsTable")
@LoadDataBeforeShow
public class CarEquipmentBrowse extends StandardLookup<CarEquipment> {
}