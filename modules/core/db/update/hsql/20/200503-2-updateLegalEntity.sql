alter table CARSERVICE_LEGAL_ENTITY alter column TELEPHONE rename to TELEPHONE__U99801 ^
alter table CARSERVICE_LEGAL_ENTITY alter column TELEPHONE__U99801 set null ;
alter table CARSERVICE_LEGAL_ENTITY alter column NAME rename to NAME__U98687 ^
alter table CARSERVICE_LEGAL_ENTITY alter column DELETED_BY rename to DELETED_BY__U10712 ^
alter table CARSERVICE_LEGAL_ENTITY alter column DELETE_TS rename to DELETE_TS__U80440 ^
alter table CARSERVICE_LEGAL_ENTITY alter column UPDATED_BY rename to UPDATED_BY__U36810 ^
alter table CARSERVICE_LEGAL_ENTITY alter column UPDATE_TS rename to UPDATE_TS__U28562 ^
alter table CARSERVICE_LEGAL_ENTITY alter column CREATED_BY rename to CREATED_BY__U17439 ^
alter table CARSERVICE_LEGAL_ENTITY alter column CREATE_TS rename to CREATE_TS__U00904 ^
alter table CARSERVICE_LEGAL_ENTITY alter column VERSION rename to VERSION__U02196 ^
alter table CARSERVICE_LEGAL_ENTITY alter column VERSION__U02196 set null ;
alter table CARSERVICE_LEGAL_ENTITY add column DELETED_BY varchar(50) ;
alter table CARSERVICE_LEGAL_ENTITY add column TELEPHONE varchar(255) ^
update CARSERVICE_LEGAL_ENTITY set TELEPHONE = '' where TELEPHONE is null ;
alter table CARSERVICE_LEGAL_ENTITY alter column TELEPHONE set not null ;
alter table CARSERVICE_LEGAL_ENTITY add column LEGAL_NAME varchar(255) ;
alter table CARSERVICE_LEGAL_ENTITY add column UPDATE_TS timestamp ;
alter table CARSERVICE_LEGAL_ENTITY add column DELETE_TS timestamp ;
alter table CARSERVICE_LEGAL_ENTITY add column UPDATED_BY varchar(50) ;
alter table CARSERVICE_LEGAL_ENTITY add column CREATED_BY varchar(50) ;
alter table CARSERVICE_LEGAL_ENTITY add column ID varchar(36) not null ^
update CARSERVICE_LEGAL_ENTITY set ID = '00000000-0000-0000-0000-000000000000' where ID is null ;
alter table CARSERVICE_LEGAL_ENTITY alter column ID set not null ;
alter table CARSERVICE_LEGAL_ENTITY add column CREATE_TS timestamp ;
alter table CARSERVICE_LEGAL_ENTITY add column VERSION integer ^
update CARSERVICE_LEGAL_ENTITY set VERSION = 0 where VERSION is null ;
alter table CARSERVICE_LEGAL_ENTITY alter column VERSION set not null ;
