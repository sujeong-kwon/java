create user 'too_much_talkers'@localhost identified by 'strong_typing_and_loud laughter';

create database noisyclass default character set utf8mb4;

grant all privileges on noisyclass.* to 'too_much_talkers'@localhost with grant option;

SELECT COUNT(m.id) FROM MenuItem m INNER JOIN MenuCategory c ON m.id = c.cateId WHERE c.cateId = ?;