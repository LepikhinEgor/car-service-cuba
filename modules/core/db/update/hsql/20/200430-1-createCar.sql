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
    --
    primary key (ID)
);