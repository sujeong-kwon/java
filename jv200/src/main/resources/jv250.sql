CREATE TABLE Sample10 (
	no 			INT(11)			DEFAULT NULL,
	name		VARCHAR(20) 	DEFAULT NULL,
	birthday	DATE			DEFAULT NULL,
	address		VARCHAR(40)		DEFAULT NULL
);

SELECT * FROM Customer;

INSERT INTO Sample10 VALUES (1, '유비', '1996-10-25', '대구 중구 반월당');

INSERT INTO Sample10 VALUES (2, '관우', '1996-08-21', '대구 달서구');

INSERT INTO Sample10 VALUES (3, '장비', '1993-05-12', '대구 동구');

INSERT INTO Sample10 VALUES (4, '장비''s', '1993-05-12', '대구 동구');

CREATE TABLE Customer (
	cid			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	name		VARCHAR(20)		NOT NULL,
	ssn			VARCHAR(14)		NOT NULL,
	phone		VARCHAR(14)		NOT NULL,
	customerId	VARCHAR(16)		NOT NULL,
	passwd		VARCHAR(16)		NOT NULL,
	regDate		TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP 
) AUTO_INCREMENT = 1001;

INSERT INTO Customer (name, ssn, phone, customerId, passwd) 
VALUES ('유비', '901213-1234567', '010-2323-2323', 'java', '1111'),
('장비', '910312-1234567', '010-3434-3434', 'javascript', '2222'),
('관우', '920416-1234567', '010-5656-5656', 'python', '3333');

INSERT INTO Customer (name, ssn, phone, customerId, passwd) VALUES ('장비', '910312-1234567', '010-3434-3434', 'javascript', '2222');

INSERT INTO Customer (name, ssn, phone, customerId, passwd) VALUES ('관우', '920416-1234567', '010-5656-5656', 'python', '3333');

UPDATE Customer SET ssn='901212-1234567', phone='010-8989-8989' WHERE cid = 1001;

DELETE FROM Customer WHERE cid = 1006;

DROP TABLE Sample10;
