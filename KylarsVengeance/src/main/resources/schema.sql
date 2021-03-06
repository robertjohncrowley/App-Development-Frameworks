CREATE TABLE equipment(
	item varchar(100) NOT NULL,
	protection int(3) NOT NULL,
	damage int(3) NOT NULL,
	durability int(3) NOT NULL,
	currentLevel int(1) NOT NULL,
	priceForUpgrade int(4) NOT NULL,
	beSold int(1) NOT NULL,
	salePrice int(3) NOT NULL,
	PRIMARY KEY (item));

CREATE TABLE shop(
	item varchar(100) NOT NULL,
	protection int(3) NOT NULL,
	damage int(3) NOT NULL,
	durability int(3) NOT NULL,
	currentLevel int(1) NOT NULL,
	priceForUpgrade int(4) NOT NULL,
	beSold int(1) NOT NULL,
	salePrice int(3) NOT NULL,
	stock int(1) NOT NULL,
	price int(3) NOT NULL,
	PRIMARY KEY (item));
	
CREATE TABLE player(
	firstName varchar(100) NOT NULL,
	lastName varchar(100) NOT NULL,
	ign varchar(100) NOT NULL,
	balance int(10) NOT NULL,
	health int(3) NOT NULL,
	PRIMARY KEY (ign));
	
	

