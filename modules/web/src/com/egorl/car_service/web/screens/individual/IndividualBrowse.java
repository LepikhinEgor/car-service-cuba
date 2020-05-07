package com.egorl.car_service.web.screens.individual;

import com.egorl.car_service.entity.Person;
import com.egorl.car_service.service.PersonService;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.GroupTable;
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

    private GroupTable<Individual> individualsTable;

    @Inject
    public void setIndividualsTable(GroupTable<Individual> individualsTable) {
        this.individualsTable = individualsTable;
    }

    @Inject
    public void setUiComponents(UiComponents uiComponents) {
        this.uiComponents = uiComponents;
    }

    @Inject
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        individualsTable.addPrintable("requestsCount",
                this::getRequestsCountStr);
    }

    public Component generateRequestsColumn(Person person) {
        Label<String> label = uiComponents.create(Label.NAME);
        label.setValue(getRequestsCountStr(person));

        return label;
    }

    private String getRequestsCountStr(Person person) {
        int requestCount = (personService.getPurchaseRequests(person).size());

        return  Integer.toString(requestCount);
    }
}