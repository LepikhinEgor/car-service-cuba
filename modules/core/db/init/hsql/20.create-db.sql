-- begin CARSERVICE_COUNTRY
create unique index IDX_CARSERVICE_COUNTRY_UNIQ_NAME on CARSERVICE_COUNTRY (NAME) ^
-- end CARSERVICE_COUNTRY
-- begin CARSERVICE_CAR_DEALER
alter table CARSERVICE_CAR_DEALER add constraint FK_CARSERVICE_CAR_DEALER_ON_COUNTRY foreign key (COUNTRY_ID) references CARSERVICE_COUNTRY(ID)^
create unique index IDX_CARSERVICE_CAR_DEALER_UNIQ_NAME on CARSERVICE_CAR_DEALER (NAME) ^
create unique index IDX_CARSERVICE_CAR_DEALER_UNIQ_CODE on CARSERVICE_CAR_DEALER (CODE) ^
create index IDX_CARSERVICE_CAR_DEALER_ON_COUNTRY on CARSERVICE_CAR_DEALER (COUNTRY_ID)^
-- end CARSERVICE_CAR_DEALER
-- begin CARSERVICE_COLOR
create unique index IDX_CARSERVICE_COLOR_UNIQ_COLOR_CODE on CARSERVICE_COLOR (COLOR_CODE) ^
create unique index IDX_CARSERVICE_COLOR_UNIQ_NAME on CARSERVICE_COLOR (NAME) ^
-- end CARSERVICE_COLOR
-- begin CARSERVICE_CAR_MAKE
alter table CARSERVICE_CAR_MAKE add constraint FK_CARSERVICE_CAR_MAKE_ON_CAR_DEALER foreign key (CAR_DEALER_ID) references CARSERVICE_CAR_DEALER(ID)^
create index IDX_CARSERVICE_CAR_MAKE_ON_CAR_DEALER on CARSERVICE_CAR_MAKE (CAR_DEALER_ID)^
-- end CARSERVICE_CAR_MAKE
-- begin CARSERVICE_CAR_EQUIPMENT
alter table CARSERVICE_CAR_EQUIPMENT add constraint FK_CARSERVICE_CAR_EQUIPMENT_ON_CAR_MAKE foreign key (CAR_MAKE_ID) references CARSERVICE_CAR_MAKE(ID)^
create index IDX_CARSERVICE_CAR_EQUIPMENT_ON_CAR_MAKE on CARSERVICE_CAR_EQUIPMENT (CAR_MAKE_ID)^
-- end CARSERVICE_CAR_EQUIPMENT
-- begin CARSERVICE_CAR
alter table CARSERVICE_CAR add constraint FK_CARSERVICE_CAR_ON_CAR_DEALER foreign key (CAR_DEALER_ID) references CARSERVICE_CAR_DEALER(ID)^
alter table CARSERVICE_CAR add constraint FK_CARSERVICE_CAR_ON_CAR_MAKE foreign key (CAR_MAKE_ID) references CARSERVICE_CAR_MAKE(ID)^
alter table CARSERVICE_CAR add constraint FK_CARSERVICE_CAR_ON_EQUIPMENT foreign key (EQUIPMENT_ID) references CARSERVICE_CAR_EQUIPMENT(ID)^
create index IDX_CARSERVICE_CAR_ON_CAR_DEALER on CARSERVICE_CAR (CAR_DEALER_ID)^
create index IDX_CARSERVICE_CAR_ON_CAR_MAKE on CARSERVICE_CAR (CAR_MAKE_ID)^
create index IDX_CARSERVICE_CAR_ON_EQUIPMENT on CARSERVICE_CAR (EQUIPMENT_ID)^
-- end CARSERVICE_CAR
