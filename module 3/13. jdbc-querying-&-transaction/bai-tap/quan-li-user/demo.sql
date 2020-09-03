drop database if exists demo;
CREATE DATABASE demo;
USE demo;

create table users (
 id int(3) NOT NULL AUTO_INCREMENT,
 name varchar(120) NOT NULL,
 email varchar(220) NOT NULL,
 country varchar(120),
 PRIMARY KEY (id)
);

create table contract (
	id_contract int(3) primary key,
	id_user int(3),
    name_contract varchar(120),
    foreign key (id_user)
		references users(id)
);

insert into users(name, email, country) values('Minh','minh@codegym.vn','Viet Nam');
insert into users(name, email, country) values('Kante','kante@che.uk','Kenia');
insert into contract(id_contract, id_user, name_contract) values(1,1,'a');
DELIMITER $$

CREATE PROCEDURE get_user_by_id(IN user_id INT)

BEGIN

    SELECT users.name, users.email, users.country

    FROM users

    where users.id = user_id;

    END$$

DELIMITER ;

  

DELIMITER $$

CREATE PROCEDURE insert_user(

IN user_name varchar(50),

IN user_email varchar(50),

IN user_country varchar(50)

)

BEGIN

    INSERT INTO users(name, email, country) VALUES(user_name, user_email, user_country);

    END$$

DELIMITER ;

-- get all users
DELIMITER $$

CREATE PROCEDURE get_all_user()

BEGIN

    SELECT*FROM users;

    END$$

DELIMITER ;

-- update users
DELIMITER $$

CREATE PROCEDURE update_user(
    
    IN user_name varchar(50),

	IN user_email varchar(50),

	IN user_country varchar(50),
    
    IN user_id INT
    )

BEGIN
	update users set users.name = user_name, users.email= user_email, users.country = user_country where users.id = user_id;

    END$$

DELIMITER ;

-- delete users
DELIMITER $$

CREATE PROCEDURE delete_user(IN user_id INT)

BEGIN

 delete from users where users.id = user_id;

    END$$

DELIMITER ;
