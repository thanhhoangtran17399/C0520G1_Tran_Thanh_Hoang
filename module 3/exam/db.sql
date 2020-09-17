drop database if exists product_db;
create database product_db;
use product_db;

create table product(
	id int,
	name varchar(45),
	price double,
    quantity int,
    color varchar(45),
    description varchar(45),
    category varchar(45)
);

insert into product(id, name, price, quantity, color,description, category) value (1,"lg g7", 2, 2, "red", "smart phone", "phone");

select * from product;