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
create table service(
service_id int primary key,
service_name varchar(45),
service_area int,
service_code double,
service_max_people int,
rent_type_id int,
service_type_id int,
standard_room varchar(45),
description_other_convenionce varchar(45),
pool_area double,
number_of_floors int
);

create table employee(
employee_id int primary key,
employee_name varchar(45),
employee_birthday date,
employee_id_card varchar(45),
employee_salary double,
employee_phone varchar(45),
employee_email varchar(45),
employee_address varchar(45),
position_id int,
education_degree_id int,
division_id int,
username varchar(255)
);

create table contract(
contract_id int primary key,
contract_start_date date,
contract_end_date date,
contract_deposit double,
contract_total_money double,
employee_id int,
customer_id int,
service_id int
);

 create table contract_detail(
 contract_detail_id int primary key,
 contract_id int,
 attach_service_id int,
 quanlity int
 );
 
insert into employee(employee_id, employee_name, employee_birthday, employee_id_card, employee_salary, employee_phone, employee_email, employee_address, position_id, education_degree_id, division_id, username) values (1,1,'2019-10-10',"1",1,"1","1","1",1,1,1,"1");

insert into service(service_id, service_name, service_area, service_code, service_max_people, rent_type_id, service_type_id, standard_room, description_other_convenionce, pool_area, number_of_floors) 
values (1,"1",1,1,1,1,1,1,"1",1,1);

insert into customer(customer_id, customer_type_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address) 
values (1,1,'1','2019-10-10',1,'1','1','1','1'),
		(2,2,'2','2019-10-10',0,'2','2','2','2');
select*from customer;
select*from customer where customer_id = 2;
update customer set customer_type_id = 4, customer_name = "e", customer_birthday = "2019-10-10", customer_gender = 1, customer_id_card = "2", customer_phone = "3", customer_email = "z", customer_address = "4" where customer_id = 1;