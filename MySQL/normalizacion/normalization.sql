CREATE DATABASE IF NOT EXISTS normalization;
USE normalization;

CREATE TABLE IF NOT EXISTS dojo (
  id_dojo INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NULL,
  created_at DATETIME NULL,
  updated_at DATETIME NULL,
  PRIMARY KEY (id_dojo)
);

CREATE TABLE IF NOT EXISTS student (
  id_student INT NOT NULL AUTO_INCREMENT,
  id_dojo INT NOT NULL,
  name VARCHAR(255) NULL,
  created_at DATETIME NULL,
  updated_at DATETIME NULL,
  PRIMARY KEY (id_student),
  FOREIGN KEY (id_dojo) REFERENCES dojo (id_dojo)
);

CREATE TABLE IF NOT EXISTS adress (
  id_adress INT NOT NULL AUTO_INCREMENT,
  id_student INT NOT NULL,
  id_dojo INT NOT NULL,
  street VARCHAR(45) NULL,
  number VARCHAR(45) NULL,
  city VARCHAR(45) NULL,
  state VARCHAR(45) NULL,
  PRIMARY KEY (id_adress),
  FOREIGN KEY (id_student) REFERENCES student (id_student),
  FOREIGN KEY (id_dojo) REFERENCES dojo (id_dojo)
);

CREATE TABLE IF NOT EXISTS interest (
  id_interest INT NOT NULL AUTO_INCREMENT,
  id_dojo INT NOT NULL,
  name VARCHAR(45) NULL,
  content TEXT NULL,
  created_at DATETIME NULL,
  updated_at DATETIME NULL,
  PRIMARY KEY (id_interest),
  FOREIGN KEY (id_dojo) REFERENCES dojo (id_dojo)
);

CREATE TABLE IF NOT EXISTS student_interest (
  id_st INT NOT NULL AUTO_INCREMENT,
  id_student INT NOT NULL,
  id_interest INT NOT NULL,
  created_at DATETIME NULL,
  updated_at DATETIME NULL,
  PRIMARY KEY (id_st),
  FOREIGN KEY (id_student) REFERENCES student (id_student),
  FOREIGN KEY (id_interest) REFERENCES interest (id_interest)
);
