update CARSERVICE_INDIVIDUAL set TELEPHONE = '' where TELEPHONE is null ;
alter table CARSERVICE_INDIVIDUAL alter column TELEPHONE set not null ;
