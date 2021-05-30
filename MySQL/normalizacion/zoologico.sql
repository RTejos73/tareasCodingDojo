CREATE DATABASE IF NOT EXISTS zoologico;
USE zoologico;

CREATE TABLE IF NOT EXISTS continente(
	id_continente INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45),
    PRIMARY KEY (id_continente)
);

CREATE TABLE IF NOT EXISTS pais (
	id_pais INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(45),
	id_continente INT NOT NULL,
    PRIMARY KEY (id_pais),
    FOREIGN KEY (id_continente) REFERENCES  continente(id_continente)
);

CREATE TABLE IF NOT EXISTS zoologico (
	id_zoologico INT NOT NULL,
    nombre VARCHAR(45) NULL,
	ciudad VARCHAR(45) NULL,
	tamano VARCHAR(45) NULL,
	ppto_anual VARCHAR(45) NULL,
	id_pais INT NOT NULL,
	PRIMARY KEY (id_zoologico),
    FOREIGN KEY (id_pais) REFERENCES pais(id_pais)
);

CREATE TABLE IF NOT EXISTS especie (
	id_especie INT NOT NULL,
	nom_vulgar VARCHAR(45) NULL,
	nom_cientifico VARCHAR(45) NULL,
	fmailia VARCHAR(45) NULL,
	en_extincion VARCHAR(45) NULL,
	PRIMARY KEY (id_especie)
    );

CREATE TABLE IF NOT EXISTS animal (
	id_animal INT NOT NULL,
	num_identificacion VARCHAR(45) NULL,
	nom_vulgar VARCHAR(45) NULL,
	sexo VARCHAR(45) NULL,
	ano_nacimiento VARCHAR(4) NULL,
	id_zoologico INT NOT NULL,
	id_especie INT NOT NULL,
    id_pais INT NOT NULL,
	PRIMARY KEY (id_animal),
    FOREIGN KEY (id_zoologico) REFERENCES zoologico(id_zoologico),
    FOREIGN KEY (id_especie) REFERENCES especie(id_especie)
);

select * from pais where id_continente = 4 ;



INSERT INTO continente VALUES(1,'America');
INSERT INTO continente VALUES(2,'Africa');
INSERT INTO continente VALUES(3,'Asia');
INSERT INTO continente VALUES(4,'Europa');
INSERT INTO continente VALUES(5,'Oceania');

INSERT INTO pais VALUES(1,'Chile',1);
INSERT INTO pais VALUES(2,'Estados Unidos',1);
INSERT INTO pais VALUES(3,'Brail',1);
INSERT INTO pais VALUES(4,'Mexico',1);
INSERT INTO pais VALUES(5,'Argentina',1);
INSERT INTO pais VALUES(6,'Colombia',1);
INSERT INTO pais VALUES(7,'Costa Rica',1);
INSERT INTO pais VALUES(8,'Cuba',1);
INSERT INTO pais VALUES(9,'Peru',1);
INSERT INTO pais VALUES(10,'Ecuador',1);
INSERT INTO pais VALUES(11,'Sudafrica',2);
INSERT INTO pais VALUES(12,'Nigeria',2);
INSERT INTO pais VALUES(13,'Ghana',2);
INSERT INTO pais VALUES(14,'Kenia',2);
INSERT INTO pais VALUES(15,'Tanzania',2);
INSERT INTO pais VALUES(16,'Etiopia',2);
INSERT INTO pais VALUES(17,'Marruecos',2);
INSERT INTO pais VALUES(18,'Senegal',2);
INSERT INTO pais VALUES(19,'Uganda',2);
INSERT INTO pais VALUES(20,'Congo',2);
INSERT INTO pais VALUES(21,'Japon',3);
INSERT INTO pais VALUES(22,'China',3);
INSERT INTO pais VALUES(23,'Indonesia',3);
INSERT INTO pais VALUES(24,'India',3);
INSERT INTO pais VALUES(25,'Tailandia',3);
INSERT INTO pais VALUES(26,'Corea del Sur',3);
INSERT INTO pais VALUES(27,'Filipinas',3);
INSERT INTO pais VALUES(28,'Singapur',3);
INSERT INTO pais VALUES(29,'Vietnam',3);
INSERT INTO pais VALUES(30,'Hong Kong',3);
INSERT INTO pais VALUES(31,'Alemania',4);
INSERT INTO pais VALUES(32,'Reino Unido',4);
INSERT INTO pais VALUES(33,'Francia',4);
INSERT INTO pais VALUES(34,'Italia',4);
INSERT INTO pais VALUES(35,'Suiza',4);
INSERT INTO pais VALUES(36,'Grecia',4);
INSERT INTO pais VALUES(37,'Polonia',4);
INSERT INTO pais VALUES(38,'Suecia',4);
INSERT INTO pais VALUES(39,'Belgica',4);
INSERT INTO pais VALUES(40,'Austria',4);
INSERT INTO pais VALUES(51,'Australia',5);
INSERT INTO pais VALUES(52,'Nueva Zelanda',5);
INSERT INTO pais VALUES(53,'Fiyi',5);
INSERT INTO pais VALUES(54,'Samoa',5);
INSERT INTO pais VALUES(55,'Vanuatu',5);
INSERT INTO pais VALUES(56,'Palaos',5);
INSERT INTO pais VALUES(57,'Tonga',5);
INSERT INTO pais VALUES(58,'Islas Salomon',5);
INSERT INTO pais VALUES(59,'Kiribati',5);
INSERT INTO pais VALUES(60,'Papua NUeva Guinea',5);

INSERT INTO zoologico VALUES(1,'nombre','ciudad','tamano','ppto','idpais');

INSERT INTO zoologico VALUES(1,'Artis','Amsterdan','5000','1000000',38);
INSERT INTO zoologico VALUES(2,'Frankfurt','Alemania','5000',1000000,31);
INSERT INTO zoologico VALUES(3,'London Zoo','Reino Unido','4000','80000000',32);
INSERT INTO zoologico VALUES(4,'Berlin','Alemania','8000','50000000', 31);
INSERT INTO zoologico VALUES(5,'Bronx','Nueva York','7500','45000654',2);
INSERT INTO zoologico VALUES(6,'San Diego Zoo','San Diego','7500','49632000',2);

select * from zoologico;
