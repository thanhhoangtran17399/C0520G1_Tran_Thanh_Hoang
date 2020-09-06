drop database if exists test;
create database test;
use test;
create table customer(
customer_id int primary key,
customer_type_id int,
customer_name varchar(45),
customer_birthday date,
customer_gender bit(1),
customer_id_card varchar(45),
customer_phone varchar(45),
customer_email varchar(45),
customer_address varchar(45)
);
insert into customer(customer_id, customer_type_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address) 
values (1,1,'1','2019-10-10',1,'1','1','1','1');