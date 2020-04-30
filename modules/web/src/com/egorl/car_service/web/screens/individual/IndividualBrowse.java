package com.egorl.car_service.web.screens.individual;

import com.haulmont.cuba.gui.screen.*;
import com.egorl.car_service.entity.Individual;

@UiController("carservice_Individual.browse")
@UiDescriptor("individual-browse.xml")
@LookupComponent("individualsTable")
@LoadDataBeforeShow
public class IndividualBrowse extends StandardLookup<Individual> {
}