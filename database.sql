CREATE DATABASE travelmanagmentsystem;
show databases;
use travelmanagmentsystem;
create table account( username varchar(100),name varchar(20), password varchar(20), security varchar(100),answer varchar(50));
show tables;
select * from account;
create table customer (username varchar(20), id varchar(30), number varchar(30),name varchar(30),gender varchar(20),country varchar(30),address varchar(100),phone varchar(20),email varchar(40));
select*from customer;
delete from customer where username='ritika12';
create table bookpackage(username varchar(40),package varchar(40),persons varchar(30),number varchar(40),id varchar(30),phone varchar(40),price varchar(30));
desc customer;
create table hotel(name varchar(30),costperperson varchar(40),acroom varchar(40),foodincluded varchar(40));
insert into hotel values( "JW Marriott Hotel","45000","2000","5000");
create table bookhotel(username varchar(30),name varchar(40),person varchar(40), day varchar(40), ac varchar(10),food varchar(20),id varchar(20),number varchar(20), phone varchar(20), prize varchar(30));

select * from bookHotel;


