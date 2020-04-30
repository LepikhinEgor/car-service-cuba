update CARSERVICE_CAR_EQUIPMENT set NAME = '' where NAME is null ;
alter table CARSERVICE_CAR_EQUIPMENT alter column NAME set not null ;
update CARSERVICE_CAR_EQUIPMENT set PRICE = 0 where PRICE is null ;
alter table CARSERVICE_CAR_EQUIPMENT alter column PRICE set not null ;
update CARSERVICE_CAR_EQUIPMENT set CAR_TYPE = 0 where CAR_TYPE is null ;
alter table CARSERVICE_CAR_EQUIPMENT alter column CAR_TYPE set not null ;
update CARSERVICE_CAR_EQUIPMENT set NOTE = '' where NOTE is null ;
alter table CARSERVICE_CAR_EQUIPMENT alter column NOTE set not null ;
