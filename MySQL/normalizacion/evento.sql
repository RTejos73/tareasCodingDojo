CREATE DATABASE IF NOT EXISTS eventos;
USE eventos;

CREATE TABLE IF NOT EXISTS user (
  id_user INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NULL,
  adress VARCHAR(255) NULL,
  email VARCHAR(255) NULL,
  pass VARCHAR(100) NULL,
  created_at DATETIME NULL,
  updated_at DATETIME NULL,
  PRIMARY KEY (id_user));

CREATE TABLE IF NOT EXISTS evento (
  id_evento INT NOT NULL AUTO_INCREMENT,
  title VARCHAR(255) NULL,
  description VARCHAR(255) NULL,
  location VARCHAR(255) NULL,
  start_time DATETIME NULL,
  end_time DATETIME NULL,
  created_at DATETIME NULL,
  updated_at DATETIME NULL,
  PRIMARY KEY (id_evento));

CREATE TABLE IF NOT EXISTS schedule_event (
  id_se INT NOT NULL AUTO_INCREMENT,
  user_id INT NOT NULL,
  evento_id INT NOT NULL,
  created_at DATETIME NULL,
  updated_at DATETIME NULL,
  PRIMARY KEY (id_se),
  FOREIGN KEY (user_id) REFERENCES user (id_user),
  FOREIGN KEY (evento_id) REFERENCES evento (id_evento)
);