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
references loai_khach(id_loai_khach) on delete cascade 
on update cascade
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
references vi_tri(id_vi_tri) on delete cascade 
on update cascade,
foreign key(id_trinh_do) 
references trinh_do(id_trinh_do) on delete cascade 
on update cascade,
foreign key(id_bo_phan) 
references bo_phan(id_bo_phan) on delete cascade 
on update cascade
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
references kieu_thue(id_kieu_thue) on delete cascade 
on update cascade,
foreign key(id_loai_dich_vu) 
references loai_dich_vu(id_loai_dich_vu) on delete cascade 
on update cascade
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
foreign key (id_nhan_vien) references nhan_vien(id_nhan_vien) on delete cascade 
on update cascade,
foreign key (id_khach_hang) references khach_hang(id_khach_hang) on delete cascade 
on update cascade,
foreign key (id_dich_vu) references dich_vu(id_dich_vu) on delete cascade 
on update cascade
);

create table hop_dong_chi_tiet(
id_hop_dong_chi_tiet int primary key,
id_hop_dong int,
id_dich_vu_di_kem int,
so_luong int,
foreign key(id_hop_dong) 
references hop_dong(id_hop_dong) on delete cascade 
on update cascade,
foreign key (id_dich_vu_di_kem) 
references dich_vu_di_kem(id_dich_vu_di_kem) on delete cascade 
on update cascade
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
(3,1,'Messi','1988-10-01',12345672,'0912345673','bbvn@gmail.com','Quảng Ngãi'),
(4,3,'Maria ozawa','1995-10-05',12345673,'0912345674','qqeqwe@gmail.com','Nhật Bản'),
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
(1,1,1,1,'2019-10-01','2019-12-01',1000000,10000000),
(2,2,2,3,'2018-01-01','2018-03-01',1000000,10000000),
(3,5,1,2,'2019-01-01','2019-03-01',1000000,10000000),
(4,4,3,1,'2018-02-03','2018-04-03',1000000,10000000),
(5,3,5,1,'2015-01-10','2016-04-03',1000000,10000000);

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
join hop_dong on hop_dong.id_khach_hang = khach_hang.id_khach_hang
where khach_hang.id_loai_khach = 1
group by khach_hang.ho_ten
order by count(hop_dong.id_khach_hang);

-- task 5: Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien
--  (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) 
--  cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra)
select kh.id_khach_hang, kh.ho_ten, lk.ten_loai_khach, hd.id_hop_dong, hd.ngay_lam_hop_dong, hd.ngay_ket_thuc, dv.ten_dich_vu,
       (dv.chi_phi_thue + dvdk.don_vi * dvdk.gia) as 'tổng tiền'
from khach_hang kh
        join loai_khach lk on kh.id_loai_khach = lk.id_loai_khach
        left join hop_dong hd on kh.id_khach_hang = hd.id_khach_hang
        join dich_vu dv on kh.id_khach_hang = dv.id_dich_vu
        left join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
        left join dich_vu_di_kem dvdk on hdct.id_dich_vu_di_kem = dvdk.id_dich_vu_di_kem;

-- task 6: Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được Khách hàng 
-- thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).
select dv.id_dich_vu, dv.ten_dich_vu, dv.dien_tich, dv.chi_phi_thue, ldv.ten_loai_dich_vu
from dich_vu dv
join loai_dich_vu ldv on dv.id_loai_dich_vu = ldv.id_loai_dich_vu
where dv.id_dich_vu not in (
select dv.id_dich_vu
from dich_vu dv
join hop_dong hd on dv.id_dich_vu = hd.id_dich_vu
where (month(hd.ngay_lam_hop_dong) = 1 or month(hd.ngay_lam_hop_dong) = 2 or month(hd.ngay_lam_hop_dong) = 3) 
and year(hd.ngay_lam_hop_dong) = 2019
);

-- task 7: Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu
-- của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.
select dv.id_dich_vu, dv.ten_dich_vu, dv.dien_tich, dv.so_nguoi_toi_da, dv.chi_phi_thue, ldv.ten_loai_dich_vu
from dich_vu dv
join loai_dich_vu ldv on dv.id_loai_dich_vu = ldv.id_loai_dich_vu
join hop_dong hd on dv.id_dich_vu = hd.id_dich_vu
where year(hd.ngay_lam_hop_dong) = 2018 
and hd.id_dich_vu not in (
select id_dich_vu
from hop_dong 
where year(ngay_lam_hop_dong) = 2019
);

-- task 8: Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Cách 1:
select distinct kh.ho_ten
from khach_hang kh;

-- Cách 2:
select kh.ho_ten
from khach_hang kh
group by kh.ho_ten;

-- task 9: Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 
-- thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(ngay_lam_hop_dong) as 'thang',count(id_khach_hang) as 'so_luong_khach_dat_phong'
from hop_dong 
where year(ngay_lam_hop_dong) = 2019
group by ngay_lam_hop_dong;

-- task 10: Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong,
-- NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).
select hd.id_hop_dong, hd.ngay_lam_hop_dong, hd.ngay_ket_thuc, hd.tien_dat_coc, count(hdct.id_hop_dong_chi_tiet) as 'so_luong_dich_vu_di_kem'
from hop_dong hd
join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
group by id_hop_dong;

-- task 11:	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” và
-- có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
select kh.ho_ten, kh.dia_chi, lk.ten_loai_khach, dv.ten_dich_vu_di_kem
from khach_hang kh
join loai_khach lk on kh.id_loai_khach = lk.id_loai_khach
left join hop_dong hd on kh.id_khach_hang = hd.id_khach_hang
left join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
left join dich_vu_di_kem dv on hdct.id_dich_vu_di_kem = dv.id_dich_vu_di_kem 
where ten_loai_khach = 'Diamond' and (dia_chi = 'Vinh' or dia_chi = 'Quảng Ngãi')
group by ho_ten, ten_dich_vu_di_kem;

-- TAST 12: Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết),
-- TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
select hd.id_hop_dong, nv.ho_ten as 'ho_ten_nhan_vien', kh.ho_ten as 'ho_ten_khach_hang', kh.so_dien_thoai, dv.ten_dich_vu, sum(hdct.so_luong) as 'so_luong_dich_vu_di_kem', hd.tien_dat_coc
from hop_dong hd
join nhan_vien nv on hd.id_nhan_vien = nv.id_nhan_vien 
join khach_hang kh on hd.id_khach_hang = kh.id_khach_hang
join dich_vu dv on hd.id_dich_vu = dv.id_dich_vu
join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
where (month(hd.ngay_lam_hop_dong) > 9 
and hd.id_hop_dong not in(
select id_hop_dong
from hop_dong
where month(hd.ngay_lam_hop_dong) < 7))
and year(hd.ngay_lam_hop_dong) = 2019
group by id_hop_dong;
-- TAST 13:	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.
--  (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau)
select hd.id_hop_dong, ldv.ten_loai_dich_vu, dvdk.ten_dich_vu_di_kem, count(dvdk.id_dich_vu_di_kem)
as 'so_lan_su_dung'
from hop_dong hd
join dich_vu dv on hd.id_dich_vu = dv.id_dich_vu
join loai_dich_vu ldv on dv.id_loai_dich_vu = ldv.id_loai_dich_vu
join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
join dich_vu_di_kem dvdk on hdct.id_dich_vu_di_kem = dvdk.id_dich_vu_di_kem
group by dvdk.ten_dich_vu_di_kem
order by 'so_lan_su_dung' desc;

-- TAST 14:	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem,SoLanSuDung.
select hd.id_hop_dong, ldv.ten_loai_dich_vu, dvdk.ten_dich_vu_di_kem, count(dvdk.id_dich_vu_di_kem)
as 'so_lan_su_dung'
from hop_dong hd
join dich_vu dv on hd.id_dich_vu = dv.id_dich_vu
join loai_dich_vu ldv on dv.id_loai_dich_vu = ldv.id_loai_dich_vu
join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
join dich_vu_di_kem dvdk on hdct.id_dich_vu_di_kem = dvdk.id_dich_vu_di_kem
group by dvdk.ten_dich_vu_di_kem
having 'so_lan_su_dung' = 2;

-- TAST 15:	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi 
-- mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.
select nv.id_nhan_vien, nv.ho_ten, bp.ten_bo_phan, nv.so_dien_thoai, nv.dia_chi, count(hd.id_nhan_vien) as so_luong_hop_dong
from nhan_vien nv
join trinh_do td on nv.id_trinh_do = td.id_trinh_do
join bo_phan bp on nv.id_bo_phan = bp.id_bo_phan
join hop_dong hd on nv.id_nhan_vien = hd.id_nhan_vien
where year(hd.ngay_lam_hop_dong) between '2018' and '2019'
group by nv.id_nhan_vien
having  count(hd.id_nhan_vien) <= 3; 

-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.
 SET FOREIGN_KEY_CHECKS =  0 ;
 delete from nhan_vien where id_nhan_vien not in (
	select hd.id_nhan_vien
    from hop_dong hd
    where year(hd.ngay_lam_hop_dong) in (2017,2018,2019));
SET FOREIGN_KEY_CHECKS =  1 ;

-- 17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond,
-- chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.
update khach_hang set id_loai_khach = 1
where id_loai_khach in (

)