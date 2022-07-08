CREATE TABLE Sample10 (
	no 			INT(11)			DEFAULT NULL,
	name		VARCHAR(20) 	DEFAULT NULL,
	birthday	DATE			DEFAULT NULL,
	address		VARCHAR(40)		DEFAULT NULL
);

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

DELETE FROM Account WHERE accountNum = "777-77-777";

DROP TABLE Customer;

CREATE TABLE ACCOUNT(
	aid				BIGINT			PRIMARY KEY AUTO_INCREMENT,
	accountNum		VARCHAR(11)		NOT NULL,			-- 111-11-1111
	balance			DOUBLE			NOT NULL	DEFAULT 0.0,
	interestRate	DOUBLE			NOT NULL	DEFAULT 0.0,
	overdraft		DOUBLE			NOT NULL	DEFAULT 0.0,
	accountType		CHAR(1)			NOT NULL	DEFAULT 'S',
	customerId		BIGINT			NOT NULL,
	regDate			TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP,
	
	CONSTRAINT Account_customerId_FK FOREIGN KEY (customerId) REFERENCES Customer(cid)
)AUTO_INCREMENT = 3001;

SELECT * FROM ACCOUNT;

SELECT * FROM Customer;

INSERT INTO ACCOUNT (accountNum, balance, interestRate, overdraft, accountType, customerId) VALUES ('111-11-1111', 1000.0, 0.3, 2000.0, 'S', 1001);

INSERT INTO ACCOUNT (accountNum, balance, interestRate, overdraft, accountType, customerId) VALUES ('222-22-2222', 2000.0, 0.3, 3000.0, 'C', 1002);

SELECT * FROM Account, Customer 
WHERE Account.customerId = Customer.cid AND Customer.ssn = "901213-1234567";

SELECT * FROM Account a INNER JOIN Customer c ON a.customerId = c.cid

SELECT * FROM Account a INNER JOIN Customer c ON a.customerId = c.cid WHERE c.ssn = "901213-1234567";

SELECT a.aid, a.accountNum, a.balance, a.interestRate, a.overdraft, a.accountType, c.name, c.ssn, c.phone, a.regDate
				FROM Account a INNER JOIN Customer c ON a.customerId = c.cid
				WHERE c.ssn = "901213-1234567";
				
ALTER TABLE Customer CHANGE customerId userId VARCHAR(16) NOT NULL;

SELECT a.aid, a.accountNum, a.balance, a.interestRate, a.overdraft, a.accountType, c.name, c.ssn, c.phone, a.regDate FROM Account a INNER JOIN Customer c ON a.customerId = c.cid WHERE c.ssn = ?

show tables;

drop table User;

CREATE TABLE User (
	uid			BIGINT			PRIMARY KEY AUTO_INCREMENT,		
	userId		VARCHAR(16)		NOT NULL,
	passwd		VARCHAR(16)		NOT NULL,
	userName	VARCHAR(20)		NOT NULL,
	email		VARCHAR(20)		NOT NULL,
	ssn			VARCHAR(20)		NOT NULL,
	addr		VARCHAR(20)		NOT NULL,
	regDate		TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
) AUTO_INCREMENT = 1001;

select * from User;

INSERT INTO User (userId, passwd, userName, ssn, email, addr) VALUES ("example1", "abc1234", "길동", "991213-2222222", "exam@gmail.com", "비슬로 2141 공공빌라 102호");

SELECT * FROM User WHERE userId = "pcn2930" AND passwd = "22222";

UPDATE User SET userId = "hee", passwd = "1234", userName = "고양이", ssn = "12345455", email = "eexd124", addr = "dd동" WHERE uid = 1001;