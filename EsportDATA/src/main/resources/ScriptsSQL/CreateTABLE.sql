CREATE TABLE joueur(
playerid INT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
address VARCHAR(255),
birth_date DATE,
first_name VARCHAR(255),
last_name VARCHAR(255),
phone VARCHAR(255),
pseudo VARCHAR(255),
country VARCHAR(255),
prize_list VARCHAR(255),
salary DOUBLE,
Game VARCHAR(255),
FOREIGN KEY (userid) REFERENCES utilisateur(userid)
);



)