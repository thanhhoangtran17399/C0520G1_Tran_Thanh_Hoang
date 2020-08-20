drop database if exists product_managetment;
create database product_managetment;
use product_managetment;

CREATE TABLE products (
    id INT PRIMARY KEY,
    product_code VARCHAR(50),
    product_name VARCHAR(50),
    product_price FLOAT,
    product_amount INT,
    product_description VARCHAR(50),
    product_status VARCHAR(50)
);

insert into products(id, product_code, product_name, product_price, product_amount, product_description, product_status)
value 	(1, '1111', 'dien thoai', 1, 1, 'a', 'a'),
		(2, '2222', 'giay', 2, 2, 'b', 'b'),
		(3, '3333', 'ao', 3, 3, 'c', 'c'),
		(4, '4444', 'quan', 4, 4, 'd', 'd');

-- tạo unique index
CREATE UNIQUE INDEX index_product_code ON products (product_code);

-- tạo  Composite index
CREATE UNIQUE INDEX index_composite ON products (product_name, product_price);

-- sử dụng câu lệnh explain
EXPLAIN SELECT * FROM products WHERE product_code= '2222';

-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products 
CREATE VIEW products_views AS
SELECT product_code, product_name, product_price, product_status
FROM  products;
select * from products_views;

-- Tiến hành sửa đổi view
CREATE OR REPLACE VIEW products_views AS
SELECT product_code, product_name, product_price, product_status
FROM products 
WHERE product_name = 'ao';
select * from products_views;

-- Tiến hành xoá view
DROP VIEW products_views;

-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
DELIMITER //

CREATE PROCEDURE find_all_products()

BEGIN

  SELECT * FROM products;

END //

DELIMITER ;

call find_all_products();

-- Tạo store procedure thêm một sản phẩm mới
DELIMITER //
CREATE PROCEDURE add_new_products(
     id INT,
     product_code VARCHAR(50),
     product_name VARCHAR(50),
     product_price FLOAT,
     product_amount INT,
     product_description VARCHAR(50),
     product_status VARCHAR(50)
    )

BEGIN

  insert into products values(id, product_code, product_name, product_price, product_amount, product_description, product_status);

END //

DELIMITER ;

call add_new_products(6, '6666', 'may tinh ban', 6, 6, 'n', 'n');
select* from products;

-- tạo procedure sửa thông tin sản phẩm theo id 
DELIMITER //
CREATE PROCEDURE update_products(
     id_update INT
    )

BEGIN

  update products set product_name = 'tui xach' where id = id_update;

END //

DELIMITER ;

call update_products(2);
select* from products;

-- tạo procedure xóa thông tin sản phẩm theo id 
DELIMITER //
CREATE PROCEDURE delete_products(
     id_delete INT
    )

BEGIN

  delete from products where id = id_delete;

END //

DELIMITER ;

call delete_products(3);
select* from products;