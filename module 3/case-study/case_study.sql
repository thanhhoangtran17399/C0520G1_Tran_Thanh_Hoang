drop database if exists furama_resort_managetment;
create database furama_resort_managetment;
use furama_resort_managetment;
create table nhan_vien(
	id_nhan_vien int,
    ho_ten varchar(50),
    ngay_sinh date,
    so_cmnd varchar(50),
    luong varchar(50),
    so_dien_thoai varchar(50),
    email varchar(50),
    dia_chi varchar(50),
    id_vi_tri int,
    id_tring_do int,
    id_so_phan int
);
create table vi_tri();
create table trinh_do();
create table bo_phan();

create table khach_hang(
	id_khach_hang int,
    ho_ten varchar(50),
    ngay_sinh date,
    so_cmnd varchar(50),
	so_dien_thoai varchar(50),
    email varchar(50),
    dia_chi varchar(50),
    id_loai_khach int
);
create table loai_khach();

create table hop_dong(
	id_hop_dong int,
    ngay_lam_hop_dong date,
    ngay_ket_thuc date,
    tien_dat_coc int,
    tong_tien int
);
create table hop_dong_chi_tiet();
create table dich_vu_di_kem();
create table dich_vu(
	id_dich_vu int,
    ten_dich_vu varchar(50),
    dien_tich int,
    so_tang int,
    
    );
create table kieu_thue();
create table loai_dich_vu();