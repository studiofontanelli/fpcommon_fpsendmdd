

DROP TABLE FPSEND_COUNTER CASCADE CONSTRAINTS ; 

CREATE TABLE FPSEND_COUNTER ( 
  MSGID         VARCHAR2 (500)  NOT NULL, 
  TARGETID      VARCHAR2 (100)  NOT NULL, 
  NUM_ATTEMPTS  NUMBER, 
  CONSTRAINT PRIMARY_KEY
  PRIMARY KEY ( MSGID, TARGETID ) 
 ); 

COMMIT;
