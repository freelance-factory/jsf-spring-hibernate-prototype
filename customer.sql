﻿DROP TABLE IF EXISTS CUSTOMER; 
CREATE TABLE CUSTOMER (
	CUSTOMER_ID	SERIAL8 NOT NULL,
	NAME		VARCHAR(45) NOT NULL,
	ADDRESS		VARCHAR(255) NOT NULL,
	CREATED_DATE	DATE NOT NULL
);


ALTER TABLE CUSTOMER ADD PRIMARY KEY (CUSTOMER_ID);

INSERT INTO CUSTOMER (CUSTOMER_ID, NAME, ADDRESS, CREATED_DATE) VALUES
	(1,'mkyong1','address1',now()),
	(2,'mkyong2','address2',now());