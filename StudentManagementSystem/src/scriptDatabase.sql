create database if not exists IEFI;
use IEFI;
create table if not exists Students(
id_student int(15) NOT NULL AUTO_INCREMENT,
name varchar(50),
surname varchar(50),
dni int(12) unique,
PRIMARY KEY (id_student)
);