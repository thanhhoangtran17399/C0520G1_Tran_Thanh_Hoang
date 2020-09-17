drop database if exists test;
create database test;
use test;

create table trang_thai(
	 id_trang_thai int primary key,
     ten_trang_thai varchar(250)
);

create table loai_mat_bang(
	id_loai_mat_bang int primary key,
    ten_loai_mat_bang varchar(250)
);

create table mat_bang(
	ma_mat_bang varchar(45) primary key,
    id_trang_thai int,
    dien_tich double,
    tang int,
    id_loai_mat_bang int,
    gia_tien double,
    ngay_bat_dau date,
     ngay_ket_thuc date,
    foreign key  (id_trang_thai) references trang_thai(id_trang_thai),
    foreign key  (id_loai_mat_bang) references loai_mat_bang(id_loai_mat_bang)
);
drop database test;

select mb.ma_mat_bang, tt.ten_trang_thai, mb.dien_tich, mb.tang, lmb.ten_loai_mat_bang, mb.gia_tien, mb.ngay_bat_dau, mb.ngay_ket_thuc
from mat_bang mb 
join trang_thai tt on mb.id_trang_thai = tt.id_trang_thai
join loai_mat_bang lmb on mb.id_loai_mat_bang = lmb.id_loai_mat_bang
where lmb.ten_loai_mat_bang like '%e%';
