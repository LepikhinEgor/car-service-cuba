package com.egorl.car_service.web.screens.individual;

import com.egorl.car_service.entity.Person;
import com.egorl.car_service.service.PersonService;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.screen.*;
import com.egorl.car_service.entity.Individual;

import javax.inject.Inject;

@UiController("carservice_Individual.browse")
@UiDescriptor("individual-browse.xml")
@LookupComponent("individualsTable")
@LoadDataBeforeShow
public class IndividualBrowse extends StandardLookup<Individual> {

    private PersonService personService;

    private UiComponents uiComponents;

    @Inject
    public void setUiComponents(UiComponents uiComponents) {
        this.uiComponents = uiComponents;
    }

    @Inject
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    public Component generateRequestsColumn(Person person) {
        Label<String> label = uiComponents.create(Label.NAME);
        int requestCount = (personService.getPurchaseRequests(person).size());
        label.setValue(Integer.toString(requestCount));

        return label;
    }
}