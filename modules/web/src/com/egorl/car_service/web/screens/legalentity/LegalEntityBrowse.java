package com.egorl.car_service.web.screens.legalentity;

import com.haulmont.cuba.gui.screen.*;
import com.egorl.car_service.entity.LegalEntity;

@UiController("carservice_LegalEntity.browse")
@UiDescriptor("legal-entity-browse.xml")
@LookupComponent("legalEntitiesTable")
@LoadDataBeforeShow
public class LegalEntityBrowse extends StandardLookup<LegalEntity> {
}