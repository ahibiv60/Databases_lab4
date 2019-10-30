CREATE DATABASE IF NOT EXISTS irrigation_system;
USE irrigation_system;


DROP TABLE IF EXISTS motor;
DROP TABLE IF EXISTS statistic_of_sensor;
DROP TABLE IF EXISTS nozzle;
DROP TABLE IF EXISTS pump;
DROP TABLE IF EXISTS sensor;
DROP TABLE IF EXISTS area;
DROP TABLE IF EXISTS irrigation_system;
DROP TABLE IF EXISTS password;
DROP TABLE IF EXISTS user;


CREATE TABLE user (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  email VARCHAR(45) NOT NULL,
  phone VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE TABLE password (
  password VARCHAR(45) NOT NULL,
  user_id INT NULL,
  foreign key (user_id) references user(id) on delete cascade)
ENGINE = InnoDB;

CREATE TABLE irrigation_system (
  id INT NOT NULL AUTO_INCREMENT,
  status SET("on","off") NOT NULL,
  time DATETIME(6) NOT NULL,
  user_id INT NOT NULL,
  foreign key (user_id) references user(id) on delete cascade,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE TABLE area (
  id INT NOT NULL AUTO_INCREMENT,
  location VARCHAR(45) NOT NULL,
  irrigation_system_id INT NOT NULL,
  foreign key (irrigation_system_id) references irrigation_system(id) on delete cascade,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE TABLE sensor (
  id INT NOT NULL AUTO_INCREMENT,
  status SET("on","off") NOT NULL,
  location VARCHAR(45) NOT NULL,
  area_id INT NOT NULL,
  foreign key (area_id) references area(id) on delete cascade,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE TABLE statistic_of_sensor (
  id INT NOT NULL AUTO_INCREMENT,
  time DATETIME(6) NOT NULL,
  temperature VARCHAR(45) NOT NULL,
  lighting VARCHAR(45) NOT NULL,
  humidity VARCHAR(45) NOT NULL,
  sensor_id INT NOT NULL,
  foreign key (sensor_id) references sensor(id) on delete cascade,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE TABLE nozzle (
  id INT NOT NULL AUTO_INCREMENT,
  status SET("on","off") NOT NULL,
  location VARCHAR(45) NOT NULL,
  max_water_consumption INT NOT NULL,
  area_id INT NOT NULL,
  foreign key (area_id) references area(id) on delete cascade,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE TABLE pump (
  id INT NOT NULL AUTO_INCREMENT,
  status SET("on","off") NOT NULL,
  amount_of_pumped_water INT NOT NULL,
  area_id INT NOT NULL,
  foreign key (area_id) references area(id) on delete cascade,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE TABLE motor (
  id INT NOT NULL AUTO_INCREMENT,
  status SET("on","off") NOT NULL,
  time DATETIME(6) NOT NULL,
  pump_id INT NOT NULL,
  foreign key (pump_id) references pump(id) on delete cascade,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


INSERT INTO user (id, name, email, phone) VALUES 
(1, 'Sergey', 'sergey.ser@gimail.com', '+380505386392'),
(2, 'Sergey', 'sergey.ser@gimail.com', '+380505386392'),
(3, 'Sergey', 'sergey.ser@gimail.com', '+380505386392'),
(4, 'Sergey', 'sergey.ser@gimail.com', '+380505386392'),
(5, 'Sergey', 'sergey.ser@gimail.com', '+380505386392'),
(6, 'Sergey', 'sergey.ser@gimail.com', '+380505386392'),
(7, 'Sergey', 'sergey.ser@gimail.com', '+380505386392'),
(8, 'Sergey', 'sergey.ser@gimail.com', '+380505386392'),
(9, 'Sergey', 'sergey.ser@gimail.com', '+380505386392'),
(10, 'Sergey', 'sergey.ser@gimail.com', '+380505386392');

INSERT INTO password (password, user_id) VALUES 
('qwerty', '1'),
('qwerty', '2'),
('qwerty', '3'),
('qwerty', '4'),
('qwerty', '5'),
('qwerty', '6'),
('qwerty', '7'),
('qwerty', '8'),
('qwerty', '9'),
('qwerty', '10');

INSERT INTO irrigation_system (id, status, time, user_id) VALUES 
(1, 'on', '2019/09/29 22:22:22', '1'),
(2, 'on', '2019/09/29 22:22:22', '2'),
(3, 'on', '2019/09/29 22:22:22', '3'),
(4, 'on', '2019/09/29 22:22:22', '4'),
(5, 'on', '2019/09/29 22:22:22', '5'),
(6, 'on', '2019/09/29 22:22:22', '6'),
(7, 'on', '2019/09/29 22:22:22', '7'),
(8, 'on', '2019/09/29 22:22:22', '8'),
(9, 'on', '2019/09/29 22:22:22', '9'),
(10, 'on', '2019/09/29 22:22:22', '10');

INSERT INTO area (id, location, irrigation_system_id) VALUES 
(1, '40.7143528,-74.0059731', '1'),
(2, '40.7143528,-74.0059731', '2'),
(3, '40.7143528,-74.0059731', '3'),
(4, '40.7143528,-74.0059731', '4'),
(5, '40.7143528,-74.0059731', '5'),
(6, '40.7143528,-74.0059731', '6'),
(7, '40.7143528,-74.0059731', '7'),
(8, '40.7143528,-74.0059731', '8'),
(9, '40.7143528,-74.0059731', '9'),
(10, '40.7143528,-74.0059731', '10');

INSERT INTO sensor (id, status, location, area_id) VALUES 
(1, 'on', '50.7143528,-74.0059731', '1'),
(2, 'on', '50.7143528,-74.0059731', '2'),
(3, 'on', '50.7143528,-74.0059731', '3'),
(4, 'on', '50.7143528,-74.0059731', '4'),
(5, 'on', '50.7143528,-74.0059731', '5'),
(6, 'on', '50.7143528,-74.0059731', '6'),
(7, 'on', '50.7143528,-74.0059731', '7'),
(8, 'on', '50.7143528,-74.0059731', '8'),
(9, 'on', '50.7143528,-74.0059731', '9'),
(10, 'on', '50.7143528,-74.0059731', '10');

INSERT INTO statistic_of_sensor (id, time, temperature, lighting, humidity, sensor_id) VALUES 
(1, '2019/09/29 22:22:22', '25C', '40%', '70%', '1'),
(2, '2019/09/29 22:22:22', '25C', '40%', '70%', '2'),
(3, '2019/09/29 22:22:22', '25C', '40%', '70%', '3'),
(4, '2019/09/29 22:22:22', '25C', '40%', '70%', '4'),
(5, '2019/09/29 22:22:22', '25C', '40%', '70%', '5'),
(6, '2019/09/29 22:22:22', '25C', '40%', '70%', '6'),
(7, '2019/09/29 22:22:22', '25C', '40%', '70%', '7'),
(8, '2019/09/29 22:22:22', '25C', '40%', '70%', '8'),
(9, '2019/09/29 22:22:22', '25C', '40%', '70%', '9'),
(10, '2019/09/29 22:22:22', '25C', '40%', '70%', '10');

INSERT INTO nozzle (id, status, location, max_water_consumption, area_id) VALUES 
(1, 'on', '50.7143528,-74.0059731', '500', '1'),
(2, 'on', '50.7143528,-74.0059731', '500', '2'),
(3, 'on', '50.7143528,-74.0059731', '500', '3'),
(4, 'on', '50.7143528,-74.0059731', '500', '4'),
(5, 'on', '50.7143528,-74.0059731', '500', '5'),
(6, 'on', '50.7143528,-74.0059731', '500', '6'),
(7, 'on', '50.7143528,-74.0059731', '500', '7'),
(8, 'on', '50.7143528,-74.0059731', '500', '8'),
(9, 'on', '50.7143528,-74.0059731', '500', '9'),
(10, 'on', '50.7143528,-74.0059731', '500', '10');

INSERT INTO pump (id, status, amount_of_pumped_water, area_id) VALUES 
(1, 'on', '300', '1'),
(2, 'on', '300', '2'),
(3, 'on', '300', '3'),
(4, 'on', '300', '4'),
(5, 'on', '300', '5'),
(6, 'on', '300', '6'),
(7, 'on', '300', '7'),
(8, 'on', '300', '8'),
(9, 'on', '300', '9'),
(10, 'on', '300', '10');

INSERT INTO motor (id, status, time, pump_id) VALUES 
(1, 'on', '2019/09/29 22:22:22', '1'),
(2, 'on', '2019/09/29 22:22:22', '2'),
(3, 'on', '2019/09/29 22:22:22', '3'),
(4, 'on', '2019/09/29 22:22:22', '4'),
(5, 'on', '2019/09/29 22:22:22', '5'),
(6, 'on', '2019/09/29 22:22:22', '6'),
(7, 'on', '2019/09/29 22:22:22', '7'),
(8, 'on', '2019/09/29 22:22:22', '8'),
(9, 'on', '2019/09/29 22:22:22', '9'),
(10, 'on', '2019/09/29 22:22:22', '10');