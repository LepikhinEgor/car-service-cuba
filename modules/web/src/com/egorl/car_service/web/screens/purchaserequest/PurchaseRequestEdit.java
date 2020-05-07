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

    @Inject
    protected EntitySnapshotService entitySnapshotService;

    @Inject
    private EntityStates entityStates;

    @Inject
    protected EntityDiffViewer diffFrame;

//    @Override
//    protected void commit(Action.ActionPerformedEvent event) {
//        super.commit(event);
//        entitySnapshotService.createSnapshot(getEditedEntity(), Objects.requireNonNull(getEditedEntityContainer().getView()));
//    }



    @Subscribe
    public void afterCommitEvent(AfterCommitChangesEvent event) {
        EntitySnapshot old = entitySnapshotService.getLastEntitySnapshot(getEditedEntity());
        EntitySnapshot newSnapshot = entitySnapshotService.createSnapshot(getEditedEntity(), Objects.requireNonNull(getEditedEntityContainer().getView()));
        EntityDiff diff = entitySnapshotService.getDifference(old, newSnapshot);
        String s = diff.toString();

        System.out.println();
    }

    @Subscribe
    public void onBeforeAction(BeforeShowEvent event) {
        if (!entityStates.isNew(getEditedEntity())) {
            diffFrame.loadVersions(getEditedEntity());
        }
    }
}