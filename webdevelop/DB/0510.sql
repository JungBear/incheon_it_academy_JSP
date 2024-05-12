CREATE TABLE TBL_MEMBER(
	NAME VARCHAR2(30),
	AGE NUMBER
);

CREATE TABLE TBL_CAR(
	ID NUMBER,
	BRAND VARCHAR2(100),
	COLOR VARCHAR2(100),
	PRICE NUMBER,
	CONSTRAINT CAR_PK PRIMARY KEY(ID)
);

DROP TABLE TBL_CAR ;
DROP TABLE TBL_MEMBER ;

ALTER TABLE TBL_CAR DROP CONSTRAINT CAR_PK;

ALTER TABLE TBL_CAR ADD CONSTRAINT CAR_PK PRIMARY KEY(ID);

CREATE TABLE TBL_ANIMAL(
	ID NUMBER PRIMARY KEY,
	"TYPE" VARCHAR2(100),
	AGE NUMBER(2),
	FEED VARCHAR2(100)
);

