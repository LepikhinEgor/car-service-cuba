-- begin CARSERVICE_COUNTRY
create table CARSERVICE_COUNTRY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(50) not null,
    CODE integer,
    --
    primary key (ID)
)^
-- end CARSERVICE_COUNTRY
-- begin CARSERVICE_CAR_DEALER
create table CARSERVICE_CAR_DEALER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    COUNTRY_ID varchar(36),
    CODE integer not null,
    --
    primary key (ID)
)^
-- end CARSERVICE_CAR_DEALER
-- begin CARSERVICE_COLOR
create table CARSERVICE_COLOR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    COLOR_CODE varchar(255) not null,
    --
    primary key (ID)
)^
-- end CARSERVICE_COLOR
-- begin CARSERVICE_CAR_MAKE
create table CARSERVICE_CAR_MAKE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    CAR_DEALER_ID varchar(36),
    --
    primary key (ID)
)^
-- end CARSERVICE_CAR_MAKE
-- begin CARSERVICE_CAR_EQUIPMENT
create table CARSERVICE_CAR_EQUIPMENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    PRICE integer not null,
    CAR_TYPE integer not null,
    NOTE varchar(255) not null,
    CAR_MAKE_ID varchar(36),
    --
    primary key (ID)
)^
-- end CARSERVICE_CAR_EQUIPMENT
-- begin CARSERVICE_CAR
create table CARSERVICE_CAR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CAR_DEALER_ID varchar(36),
    CAR_MAKE_ID varchar(36),
    EQUIPMENT_ID varchar(36),
    YEAR_OF_ISSUE integer,
    COST integer,
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end CARSERVICE_CAR
-- begin CARSERVICE_PERSON
create table CARSERVICE_PERSON (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    PERSON_TYPE varchar(31),
    --
    TELEPHONE varchar(255) not null,
    --
    -- from carservice_Individual
    NAME varchar(255),
    SURNAME varchar(255),
    --
    -- from carservice_LegalEntity
    INN varchar(255),
    LEGAL_NAME varchar(255),
    ADDRESS longvarchar,
    --
    primary key (ID)
)^
-- end CARSERVICE_PERSON
-- begin CARSERVICE_PURCHASE_REQUEST
create table CARSERVICE_PURCHASE_REQUEST (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CAR_ID varchar(36),
    BUYER_ID varchar(36),
    WAS_PAID boolean,
    PRICE integer,
    MANAGER_ID varchar(36),
    --
    primary key (ID)
)^
-- end CARSERVICE_PURCHASE_REQUEST
-- begin SEC_USER
alter table SEC_USER add column DEFAULT_COUNTRY varchar(255) ^
alter table SEC_USER add column DTYPE varchar(100) ^
update SEC_USER set DTYPE = 'carservice_ExtUser' where DTYPE is null ^
-- end SEC_USER
