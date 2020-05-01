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
);