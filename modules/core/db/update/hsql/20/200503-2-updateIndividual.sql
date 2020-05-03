alter table CARSERVICE_INDIVIDUAL alter column TELEPHONE rename to TELEPHONE__U12307 ^
alter table CARSERVICE_INDIVIDUAL alter column TELEPHONE__U12307 set null ;
alter table CARSERVICE_INDIVIDUAL alter column DELETED_BY rename to DELETED_BY__U80777 ^
alter table CARSERVICE_INDIVIDUAL alter column DELETE_TS rename to DELETE_TS__U88198 ^
alter table CARSERVICE_INDIVIDUAL alter column UPDATED_BY rename to UPDATED_BY__U03739 ^
alter table CARSERVICE_INDIVIDUAL alter column UPDATE_TS rename to UPDATE_TS__U64037 ^
alter table CARSERVICE_INDIVIDUAL alter column CREATED_BY rename to CREATED_BY__U21426 ^
alter table CARSERVICE_INDIVIDUAL alter column CREATE_TS rename to CREATE_TS__U48527 ^
alter table CARSERVICE_INDIVIDUAL alter column VERSION rename to VERSION__U38850 ^
alter table CARSERVICE_INDIVIDUAL alter column VERSION__U38850 set null ;
alter table CARSERVICE_INDIVIDUAL add column DELETED_BY varchar(50) ;
alter table CARSERVICE_INDIVIDUAL add column TELEPHONE varchar(255) ^
update CARSERVICE_INDIVIDUAL set TELEPHONE = '' where TELEPHONE is null ;
alter table CARSERVICE_INDIVIDUAL alter column TELEPHONE set not null ;
alter table CARSERVICE_INDIVIDUAL add column UPDATE_TS timestamp ;
alter table CARSERVICE_INDIVIDUAL add column DELETE_TS timestamp ;
alter table CARSERVICE_INDIVIDUAL add column UPDATED_BY varchar(50) ;
alter table CARSERVICE_INDIVIDUAL add column CREATED_BY varchar(50) ;
alter table CARSERVICE_INDIVIDUAL add column ID varchar(36) not null ^
update CARSERVICE_INDIVIDUAL set ID = '00000000-0000-0000-0000-000000000000' where ID is null ;
alter table CARSERVICE_INDIVIDUAL alter column ID set not null ;
alter table CARSERVICE_INDIVIDUAL add column CREATE_TS timestamp ;
alter table CARSERVICE_INDIVIDUAL add column VERSION integer ^
update CARSERVICE_INDIVIDUAL set VERSION = 0 where VERSION is null ;
alter table CARSERVICE_INDIVIDUAL alter column VERSION set not null ;
