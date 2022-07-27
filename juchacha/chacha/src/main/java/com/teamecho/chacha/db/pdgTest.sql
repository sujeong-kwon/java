SELECT p.pid, p.parkingCode, p.parkingName, p.parkingAddr, p.parkingTel, p.timeCost, p.dayCost, p.monthCost, p.parkingSpace, p.pointX, p.pointY
FROM parkingLot p INNER JOIN parking_keyword pk ON p.pid = pk.pid
WHERE pk.keyword like '%반월당%'
GROUP BY p.pid;