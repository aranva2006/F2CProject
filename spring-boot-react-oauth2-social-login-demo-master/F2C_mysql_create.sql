C:\Program Files\MySQL\MySQL Server 8.0\bin>mysqld

use f2c;
drop table Contact_Information;
drop table Customer_Orders;
drop table Product_stock;
drop table Stock_Status;
drop table Product;
drop table Product_Category;
drop table User_authentication;
drop table Users;
drop table Society_Details;
drop table Payment_Details;

CREATE TABLE `Users` (
	`phone_number` VARCHAR(255) NOT NULL UNIQUE,
	`firstname` VARCHAR(255) NOT NULL,
	`lastname` VARCHAR(255) NOT NULL,
	`usertype` VARCHAR(255) NOT NULL,
	`scoceity_id` INT NOT NULL,
	PRIMARY KEY (`phone_number`)
);

CREATE TABLE `Contact_Information` (
	`contact_id` INT NOT NULL AUTO_INCREMENT,
	`phone_number` VARCHAR(255) NOT NULL,
	`address_line1` VARCHAR(255) NOT NULL,
	`address_line2` VARCHAR(255),
	`email_id` VARCHAR(255),
	`alternate_phone` VARCHAR(255),
	`city` VARCHAR(255),
	`state` VARCHAR(255) NOT NULL,
	`country` VARCHAR(255) NOT NULL,
	`pin_code` VARCHAR(255) NOT NULL,
	PRIMARY KEY (`contact_id`)
);

CREATE TABLE `Product` (
	`product_id` INT NOT NULL AUTO_INCREMENT,
	`product_code` VARCHAR(255) NOT NULL UNIQUE,
	`product_desc` VARCHAR(255),
	`last_added` TIMESTAMP NOT NULL,
	`product_category_id` INT NOT NULL,
	PRIMARY KEY (`product_id`)
);

CREATE TABLE `Product_stock` (
	`product_stock_detail_id` INT NOT NULL AUTO_INCREMENT,
	`product_id` INT NOT NULL,
	`quantity` INT NOT NULL,
	`stock_status_id` INT NOT NULL,
	PRIMARY KEY (`product_stock_detail_id`)
);

CREATE TABLE `Product_Category` (
	`product_category_id` INT NOT NULL AUTO_INCREMENT,
	`product_category_code` VARCHAR(255) NOT NULL,
	`product_category_desc` VARCHAR(255) NOT NULL,
	PRIMARY KEY (`product_category_id`)
);

CREATE TABLE `Society_Details` (
	`scoceity_id` INT NOT NULL AUTO_INCREMENT,
	`society_name` VARCHAR(255) NOT NULL UNIQUE,
	`society_address_line1` VARCHAR(255) NOT NULL,
	`society_address_line2` VARCHAR(255),
	`society_city` VARCHAR(255) NOT NULL,
	`society_state` VARCHAR(255) NOT NULL,
	`society_country` VARCHAR(255) NOT NULL,
	`society_pincode` VARCHAR(255) NOT NULL,
	`society_contact` VARCHAR(255),
	PRIMARY KEY (`scoceity_id`)
);

CREATE TABLE `Stock_Status` (
	`stock_status_id` INT NOT NULL AUTO_INCREMENT,
	`stocks_open` INT NOT NULL,
	`stocks_closed` INT NOT NULL,
	PRIMARY KEY (`stock_status_id`)
);

CREATE TABLE `Customer_Orders` (
	`order_id` INT NOT NULL AUTO_INCREMENT,
	`phone_number` INT NOT NULL,
	`order_date` TIMESTAMP NOT NULL,
	`product_id` INT NOT NULL,
	`quantity` INT NOT NULL,
	`delivery_date` TIMESTAMP NOT NULL,
	`order_state` VARCHAR(255) NOT NULL,
	`order_amount` FLOAT NOT NULL,
	`delivery_status` VARCHAR(255) NOT NULL,
	`scociety_id` INT NOT NULL,
	`payment_detail_id` INT NOT NULL,
	PRIMARY KEY (`order_id`)
);

CREATE TABLE `User_authentication` (
	`user_id` VARCHAR(255) NOT NULL,
	`password` VARCHAR(255) NOT NULL
);

CREATE TABLE `Payment_Details` (
	`payment_detail_id` INT NOT NULL AUTO_INCREMENT,
	`payment_status` VARCHAR(255) NOT NULL,
	PRIMARY KEY (`payment_detail_id`)
);

ALTER TABLE `Users` ADD CONSTRAINT `Users_fk0` FOREIGN KEY (`scoceity_id`) REFERENCES `Society_Details`(`scoceity_id`);

ALTER TABLE `Product` ADD CONSTRAINT `Product_fk0` FOREIGN KEY (`product_category_id`) REFERENCES `Product_Category`(`product_category_id`);

ALTER TABLE `Contact_Information` ADD CONSTRAINT `Contact_Information_fk0` FOREIGN KEY (`phone_number`) REFERENCES `Users`(`phone_number`);

ALTER TABLE `Product_stock` ADD CONSTRAINT `Product_stock_fk0` FOREIGN KEY (`product_id`) REFERENCES `Product`(`product_id`);

ALTER TABLE `Product_stock` ADD CONSTRAINT `Product_stock_fk1` FOREIGN KEY (`stock_status_id`) REFERENCES `Stock_Status`(`stock_status_id`);

ALTER TABLE `Contact_Information` ADD UNIQUE `unique_index`(

INSERT INTO Product_Category VALUES(NULL,"PULSES","PULSES");
INSERT INTO Product_Category VALUES(NULL,"FRIUTS","FRIUTS");
INSERT INTO Product_Category VALUES(NULL,"VEGETABLES","VEGETABLES");
INSERT INTO Product_Category VALUES(NULL,"SPICES","SPICES");
INSERT INTO Product_Category VALUES(NULL,"NUTS","NUTS");

insert into Product values(NULL,"GN_500GM_A1","GROUND NUT 500 GM A1 QUALITY",CURRENT_TIME,1);
insert into Product values(NULL,"GN_500GM_A2","GROUND NUT 500 GM A2 QUALITY",CURRENT_TIME,1);
insert into Product values(NULL,"GN_500GM_A3","GROUND NUT 500 GM A3 QUALITY",CURRENT_TIME,1);
insert into Product values(NULL,"GN_500GM_A4","GROUND NUT 500 GM A4 QUALITY",CURRENT_TIME,1);
insert into Product values(NULL,"GN_500GM_A5","GROUND NUT 500 GM A5 QUALITY",CURRENT_TIME,1);
insert into Product values(NULL,"GN_500GM_A6","GROUND NUT 500 GM A6 QUALITY",CURRENT_TIME,1);
insert into Product values(NULL,"GN_500GM_A7","GROUND NUT 500 GM A7 QUALITY",CURRENT_TIME,1);
insert into Product values(NULL,"GN_500GM_A8","GROUND NUT 500 GM A8 QUALITY",CURRENT_TIME,1);
insert into Product values(NULL,"GN_500GM_A9","GROUND NUT 500 GM A9 QUALITY",CURRENT_TIME,1);

insert into Product values(NULL,"MANGO_1KG_A1","MANGO 1 KG A1 QUALITY",CURRENT_TIME,2);
insert into Product values(NULL,"MANGO_2KG_A2","MANGO 2 KG A2 QUALITY",CURRENT_TIME,2);
insert into Product values(NULL,"MANGO_3KG_A3","MANGO 3 KG A3 QUALITY",CURRENT_TIME,2);
insert into Product values(NULL,"MANGO_4KG_A4","MANGO 4 KG A4 QUALITY",CURRENT_TIME,2);
insert into Product values(NULL,"MANGO_5KG_A5","MANGO 5 KG A5 QUALITY",CURRENT_TIME,2);
insert into Product values(NULL,"MANGO_6KG_A6","MANGO 6 KG A6 QUALITY",CURRENT_TIME,2);
insert into Product values(NULL,"MANGO_7KG_A7","MANGO 7 KG A7 QUALITY",CURRENT_TIME,2);
insert into Product values(NULL,"MANGO_8KG_A8","MANGO 8 KG A8 QUALITY",CURRENT_TIME,2);
insert into Product values(NULL,"MANGO_9KG_A9","MANGO 9 KG A9 QUALITY",CURRENT_TIME,2);

insert into Product values(NULL,"RC_1KG_A1","RED CHILLI 1 KG A1 QUALITY",CURRENT_TIME,4);
insert into Product values(NULL,"RC_500GM_A1","RED CHILLI 500 GM A1 QUALITY",CURRENT_TIME,4);
insert into Product values(NULL,"RC_1KG_A2","RED CHILLI 1 KG A2 QUALITY",CURRENT_TIME,4);
insert into Product values(NULL,"RC_500GM_A2","RED CHILLI 500 GM A2 QUALITY",CURRENT_TIME,4);

insert into Product values(NULL,"CASHEW_1KG_A1","GROUND NUT 1 KG A1 QUALITY",CURRENT_TIME,5);
insert into Product values(NULL,"CASHEW_500GM_A1","GROUND NUT 500 GM A1 QUALITY",CURRENT_TIME,5);
insert into Product values(NULL,"CASHEW_1KG_A2","GROUND NUT 1 KG A2 QUALITY",CURRENT_TIME,5);
insert into Product values(NULL,"CASHEW_500GM_A2","GROUND NUT 500 GM A2 QUALITY",CURRENT_TIME,5);

insert into Stock_Status VALUES(NULL,200,0);
insert into Stock_Status VALUES(NULL,250,0);
insert into Stock_Status VALUES(NULL,150,0);
insert into Stock_Status VALUES(NULL,2500,0);
insert into Stock_Status VALUES(NULL,1500,0);
insert into Stock_Status VALUES(NULL,1000,0);
insert into Stock_Status VALUES(NULL,1500,0);
insert into Stock_Status VALUES(NULL,1500,0);
insert into Stock_Status VALUES(NULL,1500,0);
insert into Stock_Status VALUES(NULL,1000,0);
insert into Stock_Status VALUES(NULL,800,0);
insert into Stock_Status VALUES(NULL,700,0);
insert into Stock_Status VALUES(NULL,600,0);
insert into Stock_Status VALUES(NULL,200,0);
insert into Stock_Status VALUES(NULL,100,0);
insert into Stock_Status VALUES(NULL,50,0);

insert into Product_stock VALUES(NULL,1,200,1);
insert into Product_stock VALUES(NULL,2,250,2);
insert into Product_stock VALUES(NULL,3,150,3);
insert into Product_stock VALUES(NULL,4,2500,4);
insert into Product_stock VALUES(NULL,5,1500,5);
insert into Product_stock VALUES(NULL,6,1000,6);
insert into Product_stock VALUES(NULL,7,1500,7);
insert into Product_stock VALUES(NULL,8,1500,8);
insert into Product_stock VALUES(NULL,9,1500,9);
insert into Product_stock VALUES(NULL,10,1000,10);
insert into Product_stock VALUES(NULL,11,800,11);
insert into Product_stock VALUES(NULL,12,700,12);
insert into Product_stock VALUES(NULL,13,600,13);
insert into Product_stock VALUES(NULL,14,200,14);
insert into Product_stock VALUES(NULL,15,100,15);
insert into Product_stock VALUES(NULL,16,50,16);

INSERT INTO Society_Details VALUES(NULL,"SOBHA DREAM ACRES GATE1","BALEGERE ROAD , PANATHUR MAIN ROAD","VARTHUR","BANGALORE","KARNATAKA","INDIA","560087",NULL);
INSERT INTO Society_Details VALUES(NULL,"SOBHA DREAM ACRES GATE2","BALEGERE ROAD , PANATHUR MAIN ROAD","VARTHUR","BANGALORE","KARNATAKA","INDIA","560087",NULL);
INSERT INTO Society_Details VALUES(NULL,"DISHA PARK WEST","BALEGERE ROAD , PANATHUR MAIN ROAD","VARTHUR","BANGALORE","KARNATAKA","INDIA","560087",NULL);
INSERT INTO Society_Details VALUES(NULL,"DISHA CENTRAL PARK","BALEGERE ROAD , PANATHUR MAIN ROAD","VARTHUR","BANGALORE","KARNATAKA","INDIA","560087",NULL);

COMMIT;


