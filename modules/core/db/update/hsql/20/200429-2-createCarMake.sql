alter table CARSERVICE_CAR_MAKE add constraint FK_CARSERVICE_CAR_MAKE_ON_CAR_DEALER foreign key (CAR_DEALER_ID) references CARSERVICE_CAR_DEALER(ID);
create index IDX_CARSERVICE_CAR_MAKE_ON_CAR_DEALER on CARSERVICE_CAR_MAKE (CAR_DEALER_ID);
