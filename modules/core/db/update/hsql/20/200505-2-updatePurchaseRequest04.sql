alter table CARSERVICE_PURCHASE_REQUEST add constraint FK_CARSERVICE_PURCHASE_REQUEST_ON_INDIVIDUAL foreign key (INDIVIDUAL_ID) references CARSERVICE_PERSON(ID);
create index IDX_CARSERVICE_PURCHASE_REQUEST_ON_INDIVIDUAL on CARSERVICE_PURCHASE_REQUEST (INDIVIDUAL_ID);