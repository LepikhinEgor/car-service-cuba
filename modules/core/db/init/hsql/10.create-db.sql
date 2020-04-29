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
    NAME varchar(255),
    PRICE integer,
    CAR_TYPE integer,
    NOTE varchar(255),
    CAR_MAKE_ID varchar(36),
    --
    primary key (ID)
)^
-- end CARSERVICE_CAR_EQUIPMENT
