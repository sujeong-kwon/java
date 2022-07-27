 -- 로그인 정보
 INSERT INTO UserInfo (userId, passwd, userName, userPhone, addr, licenseNumber, userType)
 VALUES ('nh', '1212', "나나", "010-5248-5215", "대구시 중구 광개토대왕" , "111부 2203", "Y");

 INSERT INTO UserInfo (userId, passwd, userName, userPhone, addr, licenseNumber, userType)
 VALUES ('pdg88', '1q2w', "윤두준", "010-5148-5145", "대구시 중구 광개토대왕" , "288부 1234", "Y");

 INSERT INTO UserInfo (userId, passwd, userName, userPhone, addr, licenseNumber, userType)
 VALUES ('ssj', '98', "서수진", "010-8859-5122", "대구시 중구 광개토대왕" , "111러 4514", "Y");
 
 INSERT INTO UserInfo (userId, passwd, userName, userPhone, addr, licenseNumber, userType)
 VALUES ('hong12', '12345', "홍길동", "010-3213-3241", "대구시 달서구 진천동" , "131라 1244", "Y");
 
 INSERT INTO UserInfo (userId, passwd, userName, userPhone, addr, licenseNumber, userType)
 VALUES ('jin', '123', "관우", "010-2345-5432", "대구시 수성구 신매동" , "222나 1234", "Y");
 
 INSERT INTO UserInfo (userId, passwd, userName, userPhone, addr, licenseNumber, userType)
 VALUES ('kdh', '111', "김도진", "010-3121-2335", "대구광역시 중구 달구벌대로" , "98바 4455", "Y");
 
 -- 주차장 정보
INSERT INTO ParkingLot (parkingCode, parkingName, parkingAddr, parkingTel, timeCost, dayCost, monthCost, parkingSpace, pointX, pointY)
VALUES ('A0001', '제일유료주차장', '대구광역시 중구 남산동 912-1', '053-423-8537', 1500, 10000, 50000, 20, 35.8643177, 128.5944989);

INSERT INTO ParkingLot (parkingCode, parkingName, parkingAddr, parkingTel, timeCost, dayCost, monthCost, parkingSpace, pointX, pointY)
VALUES ('A0002', '시원유료주차장', '대구광역시 중구 덕산동 124-40', '053-425-8109', 1000, 12000, 40000, 15, 35.8665196, 128.5943343);

INSERT INTO ParkingLot (parkingCode, parkingName, parkingAddr, parkingTel, timeCost, dayCost, monthCost, parkingSpace, pointX, pointY)
VALUES ('A0003', '동아민영주차장', '대구광역시 중구 남산동 939-7', '000-000-0000', 1300, 9000, 30000, 30, 35.8648274, 128.5915409);
																		
INSERT INTO ParkingLot (parkingCode, parkingName, parkingAddr, parkingTel, timeCost, dayCost, monthCost, parkingSpace, pointX, pointY)
VALUES ('A0004', '대성주차장', '대구광역시 중구 삼덕동1가 39-26', '053-423-3360', 2000, 15000, 60000, 30, 35.86516, 128.5979299);

INSERT INTO ParkingLot (parkingCode, parkingName, parkingAddr, parkingTel, timeCost, dayCost, monthCost, parkingSpace, pointX, pointY)
VALUES ('A0005', '대구공영주차장', '대구광역시 중구 남산동 665번지 반월당삼정그린코아 101동 1205호', '053-241-4080', 1000, 5000, 50000, 30, 35.8636339, 128.5924309);

-- 주차장 현재 주차중인 상황
INSERT INTO Parkinglot_Use (useSpaces, pid)
VALUES(10, 1);

INSERT INTO Parkinglot_Use (useSpaces, pid)
VALUES(14, 2);

INSERT INTO Parkinglot_Use (useSpaces, pid)
VALUES(17, 3);

INSERT INTO Parkinglot_Use (useSpaces, pid)
VALUES(13, 4);

INSERT INTO Parkinglot_Use (useSpaces, pid)
VALUES(28, 5);

-- 리뷰데이터 강제 입력
INSERT INTO Review (uid, pid, content, star_rating) VALUES (1, 1, '여기 진짜 좋습니다', 5);
INSERT INTO Review (uid, pid, content, star_rating) VALUES (2, 1, '다음에 꼭 오도록 하겠습니다 !', 5);
INSERT INTO Review (uid, pid, content, star_rating) VALUES (3, 1, '리뷰보고 갔는데 실망했습니다.', 2);
INSERT INTO Review (uid, pid, content, star_rating) VALUES (4, 1, '잘 이용했습니다.', 4);
INSERT INTO Review (uid, pid, content, star_rating) VALUES (5, 1, '좋습니다', 4);
INSERT INTO Review (uid, pid, content, star_rating) VALUES (6, 1, '좋습니다', 4);

INSERT INTO Review (uid, pid, content, star_rating) VALUES (5, 2, '좋아요~', 4);
INSERT INTO Review (uid, pid, content, star_rating) VALUES (3, 2, '좋습니다', 4);
INSERT INTO Review (uid, pid, content, star_rating) VALUES (4, 2, '가격이 좋습니다', 4);
INSERT INTO Review (uid, pid, content, star_rating) VALUES (1, 2, '다음에 또 방문하겠습니다.', 5);
INSERT INTO Review (uid, pid, content, star_rating) VALUES (2, 2, '정말 좋아요 !!', 5);
INSERT INTO Review (uid, pid, content, star_rating) VALUES (6, 2, '가격이 좋습니다', 4);

INSERT INTO Review (uid, pid, content, star_rating) VALUES (5, 3, '굿굿굿!', 4);
INSERT INTO Review (uid, pid, content, star_rating) VALUES (3, 3, '좋은 곳 드디어 찾았습니다.', 5);
INSERT INTO Review (uid, pid, content, star_rating) VALUES (4, 3, '여기 괜찮네요 ^^', 4);
INSERT INTO Review (uid, pid, content, star_rating) VALUES (1, 3, '하하 괜찮은 곳 같습니다.', 4);
INSERT INTO Review (uid, pid, content, star_rating) VALUES (2, 3, '보통입니다.', 3);
INSERT INTO Review (uid, pid, content, star_rating) VALUES (6, 3, '보통입니다.', 3);

INSERT INTO Review (uid, pid, content, star_rating) VALUES (3, 4, '여기는 별로네요.', 2);
INSERT INTO Review (uid, pid, content, star_rating) VALUES (2, 4, '그닥입니다..', 2);
INSERT INTO Review (uid, pid, content, star_rating) VALUES (4, 4, '그냥저냥이네요 ..', 3);
INSERT INTO Review (uid, pid, content, star_rating) VALUES (5, 4, '최악입니다.', 1);
INSERT INTO Review (uid, pid, content, star_rating) VALUES (1, 4, '별로네요.', 2);

 -- 바우처 목록형성 
INSERT INTO Voucher(vType, buyTime)
VALUES('A', 1);
INSERT INTO Voucher(vType, buyTime)
VALUES('A', 3);
INSERT INTO Voucher(vType, buyTime)
VALUES('A', 5);
INSERT INTO Voucher(vType, buyTime)
VALUES('B', 0);
INSERT INTO Voucher(vType, buyTime)
VALUES('C', 0);

 -- 주차장 키워드
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("반월당", 1);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("반월당 주차장", 1);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("반월당주차장", 1);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("주차장", 1);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("제일주차장", 1);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("제일유료주차장", 1);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("제일", 1);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("중구 주차장", 1);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("중구주차장", 1);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("남산동", 1);

 -- 주차장 키워드
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("반월당", 2);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("반월당 주차장", 2);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("반월당주차장", 2);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("주차장", 2);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("시원주차장", 2);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("시원유료주차장", 2);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("시원", 2);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("덕산동", 2);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("중구 주차장", 2);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("중구주차장", 2);

 -- 주차장 키워드
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("반월당", 3);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("반월당 주차장", 3);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("반월당주차장", 3);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("주차장", 3);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("동아민영주차장", 3);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("동아민영", 3);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("동아", 3);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("남산동", 3);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("중구 주차장", 3);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("중구주차장", 3);


 -- 주차장 키워드
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("반월당", 4);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("반월당 주차장", 4);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("반월당주차장", 4);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("주차장", 4);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("대성주차장", 4);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("대성유료주차장", 4);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("대성", 4);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("삼덕동", 4);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("중구 주차장", 4);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("중구주차장", 4);

 -- 대구공영주차장
 -- 주차장 키워드
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("반월당", 5);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("반월당 주차장", 5);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("반월당주차장", 5);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("주차장", 5);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("대구공영주차장", 5);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("공영주차장", 5);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("공영", 5);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("남산동", 5);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("중구 주차장", 5);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("중구주차장", 5);
INSERT INTO Parking_Keyword (keyword, pid)
VALUE("삼정그린코아", 5);
