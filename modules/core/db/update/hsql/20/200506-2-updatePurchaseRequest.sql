alter table CARSERVICE_PURCHASE_REQUEST alter column INDIVIDUAL_ID rename to INDIVIDUAL_ID__U96135 ^
alter table CARSERVICE_PURCHASE_REQUEST drop constraint FK_CARSERVICE_PURCHASE_REQUEST_ON_INDIVIDUAL ;
drop index IDX_CARSERVICE_PURCHASE_REQUEST_ON_INDIVIDUAL ;