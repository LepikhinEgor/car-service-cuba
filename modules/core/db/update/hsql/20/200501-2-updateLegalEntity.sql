update CARSERVICE_LEGAL_ENTITY set TELEPHONE = '' where TELEPHONE is null ;
alter table CARSERVICE_LEGAL_ENTITY alter column TELEPHONE set not null ;
