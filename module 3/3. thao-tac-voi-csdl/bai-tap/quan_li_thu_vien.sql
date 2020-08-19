drop database if exists library_management_application;
create database library_management_application;
use library_management_application;

-- bảng loại sách
create table category(
	id_category int primary key,
	name_category varchar(50)
);

-- bảng kiểm tra việc mượn trả sách
create table borrow_books(
	id_card int primary key,
	date_of_borrowing date,
    date_back date
   
    
);

create table library_card(
	id_card int primary key,
    student_name varchar(50),
    date_of_birth date,
    adress varchar(50),
    email varchar(50),
    phone_number varchar(10),
    image varchar(50),
    foreign key(id_card) references borrow_books(id_card)
);

create table book(
	book_id int primary key,
    book_name varchar(50),
    book_publisher varchar(50),
    author_name varchar(50),
    publishing_date date,
    number_of_publications int,
    price float,
    image varchar(50),
	id_category int,
    id_card int,
    foreign key(id_category) references category(id_category),
    foreign key(id_card) references library_card(id_card)
);