package com.egorl.car_service.web.screens.carmake;

import com.haulmont.cuba.gui.screen.*;
import com.egorl.car_service.entity.CarMake;

@UiController("carservice_CarMake.browse")
@UiDescriptor("car-make-browse.xml")
@LookupComponent("carMakesTable")
@LoadDataBeforeShow
public class CarMakeBrowse extends StandardLookup<CarMake> {
}