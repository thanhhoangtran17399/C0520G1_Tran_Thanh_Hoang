drop database if exists furama_resort_management;
create database furama_resort_management;
use furama_resort_management;

create table vi_tri(
id_vi_tri int primary key,
ten_vi_tri varchar(45)
);

create table trinh_do(
id_trinh_do int primary key,
trinh_do varchar (45)
);

create table bo_phan(
id_bo_phan int primary key,
ten_bo_phan varchar (45)
);

create table dich_vu_di_kem(
id_dich_vu_di_kem int primary key,
ten_dich_vu_di_kem varchar(45),
gia double,
don_vi int,
trang_thai_kha_dung varchar(45)
);

create table loai_khach(
id_loai_khach int primary key,
ten_loai_khach varchar(45)
);

create table loai_dich_vu(
id_loai_dich_vu int primary key,
ten_loai_dich_vu varchar(45)
);

create table kieu_thue(
id_kieu_thue int primary key,
ten_kieu_thue varchar(45),
gia double
);

create table khach_hang(
id_khach_hang int primary key,
id_loai_khach int,
ho_ten varchar (45),
ngay_sinh date,
cmnd varchar(45),
so_dien_thoai varchar(45),
email varchar(45),
dia_chi varchar(45),
foreign key(id_loai_khach) 
references loai_khach(id_loai_khach) 
);

create table nhan_vien (
id_nhan_vien int primary key,
ho_ten varchar(45),
id_vi_tri int,
id_trinh_do int,
id_bo_phan int,
ngay_sinh date,
cmnd int,
luong double,
so_dien_thoai varchar(45),
email varchar(45),
dia_chi varchar(45),
foreign key(id_vi_tri) 
references vi_tri(id_vi_tri),
foreign key(id_trinh_do) 
references trinh_do(id_trinh_do),
foreign key(id_bo_phan) 
references bo_phan(id_bo_phan)
);

create table dich_vu(
id_dich_vu int primary key,
ten_dich_vu varchar(45),
dien_tich double,
so_tang int,
so_nguoi_toi_da int,
chi_phi_thue double,
id_kieu_thue int,
id_loai_dich_vu int,
trang_thai varchar(45),
foreign key(id_kieu_thue) 
references kieu_thue(id_kieu_thue),
foreign key(id_loai_dich_vu) 
references loai_dich_vu(id_loai_dich_vu)
);

create table hop_dong(
id_hop_dong int primary key,
id_nhan_vien int,
id_khach_hang int,
id_dich_vu int,
ngay_lam_hop_dong date,
ngay_ket_thuc date,
tien_dat_coc double,
tong_tien double,
foreign key (id_nhan_vien) references nhan_vien(id_nhan_vien),
foreign key (id_khach_hang) references khach_hang(id_khach_hang),
foreign key (id_dich_vu) references dich_vu(id_dich_vu)
);

create table hop_dong_chi_tiet(
id_hop_dong_chi_tiet int primary key,
id_hop_dong int,
id_dich_vu_di_kem int,
so_luong int,
foreign key(id_hop_dong) 
references hop_dong(id_hop_dong),
foreign key (id_dich_vu_di_kem) 
references dich_vu_di_kem(id_dich_vu_di_kem)
);

-- Nhập data
insert into vi_tri
values 
(1,'Lễ Tân'),
(2,'Phục Vụ'),
(3,'Chuyên Viên'),
(4,'Giám sát'),
(5,'Quản lý'),
(6,'Giám Đốc');

insert into trinh_do
values
(1,'Trung Cấp'),
(2,'Cao Đẳng'),
(3,'Đại Học'),
(4,'Sau Đại Học');

insert into bo_phan
values
(1,'Sale'),
(2,'Hành chính'),
(3,'Phục vụ'),
(4,'Quản lý');

insert into dich_vu_di_kem
values
(1,'Karaoke',200000,1,'khả dụng'),
(2,'Thức ăn',50000,1,'khả dụng'),
(3,'Massage',500000,1,'khả dụng'),
(4,'Nước uống',20000,1,'khả dụng'),
(5,'Thuê xe',100000,1,'khả dụng');

insert into loai_khach
values
(1,'Diamond'),
(2,'Platinium'),
(3,'Gold'),
(4,'Silver'),
(5,'Member');

insert into loai_dich_vu
values
(1,'Villa'),
(2,'House'),
(3,'Room');

insert into kieu_thue
values 
(1,'Ngày',500000),
(2,'Tuần',3500000),
(3,'Tháng',14000000);

insert into khach_hang 
values 
(1,1,'Hoàng','1999-03-17',12345678,'0912345678','eqwe@gmail.com','Đà Nẵng'),
(2,2,'Ronaldo','1985-10-15',12345671,'0912345672','zxc@gmail.com','Quảng Nam'),
(3,3,'Messi','1988-10-01',12345672,'0912345673','bbvn@gmail.com','Quảng Bình'),
(4,1,'Maria ozawa','1995-10-05',12345673,'0912345674','qqeqwe@gmail.com','Nhật Bản'),
(5,4,'Khá Bảnh','1900-10-28',12345676,'0912345675','hjkhj@gmail.com','Quảng Trị');

insert into nhan_vien
values
(1,'Hiên',1,2,1,'2002-12-10',12342343,2000000,'0985567004','zczx@gmail.com','Quảng Ngãi'),
(2,'Khánh',1,2,1,'2003-08-10',12342343,3000000,'09855678854','adasdf@gmail.com','Nghệ An'),
(3,'Nhật',1,2,1,'2004-07-10',12342343,4000000,'098556754','bvnbv@gmail.com','Campuchia'),
(4,'Hải',1,2,1,'2005-12-06',12342343,5000000,'0985567884','yiu@gmail.com','Lào'),
(5,'Trà',1,2,1,'2006-12-06',12342343,5000000,'0985567884','rtet@gmail.com','Đà Nẵng');

insert into dich_vu
values
(1,'Villa1',100,4,20,10000000,1,1,'Còn phòng'),
(2,'Villa2',100,4,20,10000000,1,2,'Còn phòng'),
(3,'House1',100,4,20,5000000,2,1,'Còn phòng'),
(4,'House2',100,4,20,5000000,2,2,'Còn phòng'),
(5,'Room1',100,4,20,3000000,3,1,'Còn phòng'),
(6,'Room2',100,4,20,3000000,3,2,'Còn phòng');

insert into hop_dong
values
(1,1,1,1,'2020-01-01','2020-03-01',1000000,10000000),
(2,2,2,3,'2020-01-01','2020-03-01',1000000,10000000),
(3,5,1,2,'2020-01-01','2020-03-01',1000000,10000000),
(4,4,4,1,'2020-02-03','2020-04-03',1000000,10000000),
(5,3,5,1,'2020-10-10','2020-04-03',1000000,10000000);

insert into hop_dong_chi_tiet
values 
(1,1,2,2),
(2,2,1,2),
(3,4,2,2),
(4,3,1,2);

-- task 2: Hiển thị thông tin nhân viên trong hệ thống có tên bắt đầu một trong các kí tự "H","T" hoặc "K"
select *
from nhan_vien
where (ho_ten like 'H%' or ho_ten like 'T%' or ho_ten like 'K%') and length(ho_ten) < 15;

-- task 3: Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”
select *,(year(curdate())-year(ngay_sinh)) as age
from khach_hang
having  (age > 18 and age < 50) and (dia_chi='Đà Nẵng' or dia_chi='Quảng Trị');

-- task 4: Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select khach_hang.ho_ten, count(hop_dong.id_khach_hang) as so_lan_dat_phong
from khach_hang 
inner join hop_dong on hop_dong.id_khach_hang = khach_hang.id_khach_hang
where khach_hang.id_loai_khach = 1
group by khach_hang.ho_ten
order by count(hop_dong.id_khach_hang);
