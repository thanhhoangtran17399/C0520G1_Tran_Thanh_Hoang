drop database if exists quan_li_hoc_sinh;
create database quan_li_hoc_sinh;
use quan_li_hoc_sinh;

create table hoc_sinh(
	id int ,
    ten varchar(50),
    tuoi int,
    khoa_hoc varchar(50),
    so_tien int
);
insert into hoc_sinh(id, ten, tuoi, khoa_hoc, so_tien)
value 	(1, 'Hoang', 21, 'CNTT', 400000),
		(2, 'Viet', 19, 'DTVT', 320000),
        (3, 'Thanh', 18, 'KTDN', 400000),
        (4, 'Nhan', 19, 'CK', 450000),
        (5, 'Huong', 20, 'TCNH', 500000),
        (5, 'Huong', 20, 'TCNH', 200000);
        
select * from hoc_sinh
where ten = 'Huong';

select ten, sum(so_tien)  as tong_tien from hoc_sinh
where ten = 'Huong';

select distinct ten from hoc_sinh;