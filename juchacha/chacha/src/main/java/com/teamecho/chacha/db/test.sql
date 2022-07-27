SELECT v.vtype, v.buyTime, vu.useTime, vu.vuse, vu.regDate
FROM Voucher_use vu INNER JOIN Voucher v ON vu.vid = v.vid 
WHERE vu.uid = 4
;


SELECT v.vtype, v.buyTime, vu.useTime, vu.vuse, vu.regDate
	      		FROM Voucher_use vu INNER JOIN Voucher v ON vu.vid = v.vid
	      		WHERE vu.uid = 4
	      		;