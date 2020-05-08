insert into CARSERVICE_COLOR(ID,VERSION,CREATE_TS,CREATED_BY,UPDATE_TS,UPDATED_BY,DELETE_TS,DELETED_BY,NAME,COLOR_CODE)
 values ('89a54ef8-8f9f-11ea-bc55-0242ac130003', 0, now(), 'admin', null, null, null, null, 'Red', 'ff0000')^
 insert into CARSERVICE_COLOR(ID,VERSION,CREATE_TS,CREATED_BY,UPDATE_TS,UPDATED_BY,DELETE_TS,DELETED_BY,NAME,COLOR_CODE)
 values ('1c77199e-8fa2-11ea-bc55-0242ac130003', 0, now(), 'admin', null, null, null, null, 'Green', '00ff00')^
 insert into CARSERVICE_COLOR(ID,VERSION,CREATE_TS,CREATED_BY,UPDATE_TS,UPDATED_BY,DELETE_TS,DELETED_BY,NAME,COLOR_CODE)
 values ('22772aaa-8fa2-11ea-bc55-0242ac130003', 0, now(), 'admin', null, null, null, null, 'Blue', '0000ff')^
 insert into CARSERVICE_COLOR(ID,VERSION,CREATE_TS,CREATED_BY,UPDATE_TS,UPDATED_BY,DELETE_TS,DELETED_BY,NAME,COLOR_CODE)
 values ('2ade42b4-8fa2-11ea-bc55-0242ac130003', 0, now(), 'admin', null, null, null, null, 'Black', '000000')^
 insert into CARSERVICE_COLOR(ID,VERSION,CREATE_TS,CREATED_BY,UPDATE_TS,UPDATED_BY,DELETE_TS,DELETED_BY,NAME,COLOR_CODE)
 values ('30fc2e68-8fa2-11ea-bc55-0242ac130003', 0, now(), 'admin', null, null, null, null, 'White', 'ffffff')^

 insert into SEC_LOGGED_ENTITY (ID, CREATE_TS, CREATED_BY, NAME, AUTO, MANUAL)
 values ('1733b700-9103-11ea-bb37-0242ac130002', now(), 'admin', 'carservice_PurchaseRequest', true, true)^
 insert into SEC_LOGGED_ATTR (ID, CREATE_TS, CREATED_BY, ENTITY_ID, NAME)
 values (newid(), now(), 'admin', '1733b700-9103-11ea-bb37-0242ac130002', 'car')^
 insert into SEC_LOGGED_ATTR (ID, CREATE_TS, CREATED_BY, ENTITY_ID, NAME)
 values (newid(), now(), 'admin', '1733b700-9103-11ea-bb37-0242ac130002', 'buyer')^
 insert into SEC_LOGGED_ATTR (ID, CREATE_TS, CREATED_BY, ENTITY_ID, NAME)
 values (newid(), now(), 'admin', '1733b700-9103-11ea-bb37-0242ac130002', 'wasPaid')^
 insert into SEC_LOGGED_ATTR (ID, CREATE_TS, CREATED_BY, ENTITY_ID, NAME)
 values (newid(), now(), 'admin', '1733b700-9103-11ea-bb37-0242ac130002', 'price')^
 insert into SEC_LOGGED_ATTR (ID, CREATE_TS, CREATED_BY, ENTITY_ID, NAME)
 values (newid(), now(), 'admin', '1733b700-9103-11ea-bb37-0242ac130002', 'manager')^

