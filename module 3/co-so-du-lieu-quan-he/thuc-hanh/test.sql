drop database if exists student_05; 
create database student_05;
use student_05;
CREATE TABLE student (
    id INT,
    `name` VARCHAR(255),
    age INT
);
insert into student(id, `name`, age) value (1,'hoang',1),(2,'hoan',2),(3,'hoa',3);
DELETE FROM student 
WHERE
    id = 2;