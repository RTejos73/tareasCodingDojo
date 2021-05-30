CREATE DATABASE IF NOT EXISTS user_dashboard;
USE user_dashboard;

CREATE TABLE IF NOT EXISTS user (
  id_user INT NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(45) NULL,
  last_name VARCHAR(45) NULL,
  email VARCHAR(100) NULL,
  pass VARCHAR(100) NULL,
  type_use TINYINT(1) NULL,
  description TEXT NULL,
  created_at DATETIME NULL,
  updated_at DATETIME NULL,
  PRIMARY KEY (id_user)
);

CREATE TABLE IF NOT EXISTS messag (
  id_messag INT NOT NULL AUTO_INCREMENT,
  id_user INT NOT NULL,
  content TEXT NULL,
  created_at DATETIME NULL,
  updated_at DATETIME NULL,
  PRIMARY KEY (id_messag),
  FOREIGN KEY (id_user)  REFERENCES user (id_user)
);

CREATE TABLE IF NOT EXISTS comment (
  id_comment INT NOT NULL AUTO_INCREMENT,
  id_user INT NOT NULL,
  id_messag INT NOT NULL,
  context TEXT NULL,
  content_at DATETIME NULL,
  updated_at DATETIME NULL,
  PRIMARY KEY (id_comment),
  FOREIGN KEY (id_user) REFERENCES user (id_user),
  FOREIGN KEY (id_messag) REFERENCES messag (id_messag)
);