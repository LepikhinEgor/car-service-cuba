package com.egorl.car_service.web.screens.purchaserequest;

import com.haulmont.cuba.core.app.EntitySnapshotService;
import com.haulmont.cuba.core.entity.EntitySnapshot;
import com.haulmont.cuba.core.entity.diff.EntityDiff;
import com.haulmont.cuba.core.global.EntityStates;
import com.haulmont.cuba.gui.app.core.entitydiff.EntityDiffViewer;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.screen.*;
import com.egorl.car_service.entity.PurchaseRequest;

import javax.inject.Inject;
import java.util.Objects;

@UiController("carservice_PurchaseRequest.edit")
@UiDescriptor("purchase-request-edit.xml")
@EditedEntityContainer("purchaseRequestDc")
@LoadDataBeforeShow
public class PurchaseRequestEdit extends StandardEditor<PurchaseRequest> {

}