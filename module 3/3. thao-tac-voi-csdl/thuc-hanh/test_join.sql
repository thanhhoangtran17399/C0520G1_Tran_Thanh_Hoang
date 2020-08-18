drop database if exists student_06; 
create database student_06;
use student_06;
CREATE TABLE student (
    id INT primary key,
    `name` VARCHAR(255),
    age INT
);

create table point_student(
	english_point int,
    math_point int,
    id int,
    foreign key (id) references student (id)
);
insert into student(id, `name`, age) value (1,'hoang',21),(2,'hai',19),(3,'nhat',20);
insert into point_student value (10,10,1),(0,0,2);

select * from student
 inner join point_student on student.id = point_student.id;
select * from student
 left join point_student on
 student.id = point_student.id;
select * from student
  right join point_student on student.id = point_student.id;
select * from point_student
 right join student on student.id = point_student.id;