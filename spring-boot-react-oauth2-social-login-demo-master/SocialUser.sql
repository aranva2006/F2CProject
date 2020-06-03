CREATE TABLE `UserConnection` (
	`Userid` VARCHAR(255) NOT NULL UNIQUE,
	`Providerid` VARCHAR(255) NOT NULL,
	`Provideruserid` VARCHAR(255) NOT NULL,
	`rank` INT NOT NULL,
	`Displayname` VARCHAR(255),
	`Profileurl` VARCHAR(512),
	`Imageurl` VARCHAR(512),
	`Accesstoken` VARCHAR(512),
	`Secret` VARCHAR(512),
	`Refreshtoken` VARCHAR(512),
	`Expiretime` LONG VARCHAR,
	 PRIMARY KEY (`Userid`,`Providerid`,`Provideruserid`)
);

