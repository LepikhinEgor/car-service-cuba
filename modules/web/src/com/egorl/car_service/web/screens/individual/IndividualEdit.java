package com.egorl.car_service.web.screens.individual;

import com.haulmont.cuba.gui.screen.*;
import com.egorl.car_service.entity.Individual;

@UiController("carservice_Individual.edit")
@UiDescriptor("individual-edit.xml")
@EditedEntityContainer("individualDc")
@LoadDataBeforeShow
public class IndividualEdit extends StandardEditor<Individual> {
}