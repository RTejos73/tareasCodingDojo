CREATE DATABASE IF NOT EXISTS dojosYninjas;
USE dojosYninjas;

CREATE TABLE IF NOT EXISTS dojo (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(255) NULL,
  ubicacion VARCHAR(45) NULL,
  created_at DATETIME NULL,
  updated_at DATETIME NULL,
  PRIMARY KEY (id));

CREATE TABLE IF NOT EXISTS ninja (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(255) NULL,
  habilidad VARCHAR(255) NULL,
  dojo_id INT NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (dojo_id)  REFERENCES dojo(id));

INSERT INTO DOJO VALUES(1,'Dojo Kun','Concepcion','2021-05-27 18:57:00','2021-05-27 18:57:00');
INSERT INTO DOJO VALUES(2,'Karate Soul','Hualpen','2021-05-27 18:57:00','2021-05-27 18:57:00');
INSERT INTO DOJO VALUES(3,'Nuevos Hajimes','Talcahuano','2021-05-27 18:57:00','2021-05-27 18:57:00');
INSERT INTO DOJO VALUES(4,'Los Karatekas','Concepcion','2021-05-27 18:57:00','2021-05-27 18:57:00');
INSERT INTO DOJO VALUES(5,'Cobra kai','Los Angeles','2021-05-27 18:57:00','2021-05-27 18:57:00');
INSERT INTO DOJO VALUES(6,'koryu Dojo','Concepcion','2021-05-27 18:57:00','2021-05-27 18:57:00');

INSERT INTO NINJA VALUES (1,'Naruto','Taijutsu',2);
INSERT INTO NINJA VALUES (2,'Hattori Hanzo','Kusarijutsu',1);
INSERT INTO NINJA VALUES (3,'Fujibayashi Nagato','Yarijutsu',5);
INSERT INTO NINJA VALUES (4,'Momochi Sandayu','Kyokuten',3);
INSERT INTO NINJA VALUES (5,'Ishikawa Goemon','Hanbojutsu',2);
INSERT INTO NINJA VALUES (6,'Hattori Hanzo','Juttejutsu',6);
INSERT INTO NINJA VALUES (7,'Mochizuki Chiyome','Bojutsu:',1);
INSERT INTO NINJA VALUES (8,'Fuma Kotaro','Iai Nuki ',4);
INSERT INTO NINJA VALUES (9,'Jinichi Kawakami','Shurikenjutsu:',5);
INSERT INTO NINJA VALUES (10,'Hatsumi Masaaki','Bojutsu:',1);

SELECT * FROM dojo;
select * from ninja;

SELECT n.nombre, n.habilidad, d.ubicacion FROM  ninja N 
	INNER JOIN DOJO D ON D.ID = N.ID;