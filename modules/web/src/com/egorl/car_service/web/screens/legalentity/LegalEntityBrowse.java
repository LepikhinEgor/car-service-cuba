package com.egorl.car_service.web.screens.legalentity;

import com.egorl.car_service.entity.Person;
import com.egorl.car_service.service.PersonService;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.screen.*;
import com.egorl.car_service.entity.LegalEntity;

import javax.inject.Inject;

@UiController("carservice_LegalEntity.browse")
@UiDescriptor("legal-entity-browse.xml")
@LookupComponent("legalEntitiesTable")
@LoadDataBeforeShow
public class LegalEntityBrowse extends StandardLookup<LegalEntity> {

    private PersonService personService;

    private UiComponents uiComponents;

    private GroupTable<LegalEntity> legalEntitiesTable;

    @Inject
    public void setLegalEntitiesTable(GroupTable<LegalEntity> legalEntitiesTable) {
        this.legalEntitiesTable = legalEntitiesTable;
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
        legalEntitiesTable.addPrintable("requestsCount",
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