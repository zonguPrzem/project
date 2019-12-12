# DROP DATABASE IF EXISTS board;
DROP DATABASE IF EXISTS dbrental;
DROP USER IF EXISTS rental_user;

USE mysql;
CREATE DATABASE rentaldb DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
CREATE USER 'rentaldb_user'@'%' IDENTIFIED BY 'pass';
GRANT ALL ON rentaldb.* TO 'rentaldb_user'@'%';
FLUSH PRIVILEGES;
