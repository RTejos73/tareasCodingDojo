CREATE DATABASE IF NOT EXISTS blogs;
USE blogs;

CREATE TABLE IF NOT EXISTS user (
  id_user INT NOT NULL AUTO_INCREMENT,
  last_name VARCHAR(45) NULL,
  first_name VARCHAR(45) NULL,
  email VARCHAR(45) NULL,
  pass VARCHAR(45) NULL,
  created_at DATETIME NULL,
  updated_at DATETIME NULL,
  PRIMARY KEY (id_user)
  );

CREATE TABLE IF NOT EXISTS blog (
  id_blog INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NULL,
  created_at DATETIME NULL,
  updated_at DATETIME NULL,
  PRIMARY KEY (id_blog)
  );

CREATE TABLE IF NOT EXISTS admin (
  id_admin INT NOT NULL AUTO_INCREMENT,
  id_user INT NOT NULL,
  id_blog INT NOT NULL,
  created_at DATETIME NULL,
  updated_at DATETIME NULL,
  PRIMARY KEY (id_admin),
  FOREIGN KEY (id_user) REFERENCES user (id_user),
  FOREIGN KEY (id_blog) REFERENCES blog (id_blog)
);

CREATE TABLE IF NOT EXISTS post (
  id_post INT NOT NULL AUTO_INCREMENT,
  id_admin INT NOT NULL,
  id_blog INT NOT NULL,
  title VARCHAR(45) NULL,
  content VARCHAR(45) NULL,
  created_at DATETIME NULL,
  updated_at DATETIME NULL,  
  PRIMARY KEY (id_post),
  FOREIGN KEY (id_admin) REFERENCES admin (id_admin),
  FOREIGN KEY (id_blog) REFERENCES blog (id_blog)
);

CREATE TABLE IF NOT EXISTS comment (
  id_comment INT NOT NULL AUTO_INCREMENT,
  id_post INT NOT NULL,
  id_user INT NOT NULL,
  title VARCHAR(45) NULL,
  content VARCHAR(45) NULL,
  created_at DATETIME NULL,
  updated_at DATETIME NULL,  
  PRIMARY KEY (id_comment),
  FOREIGN KEY (id_post) REFERENCES post (id_post),
  FOREIGN KEY (id_user) REFERENCES user (id_user)
);

CREATE TABLE IF NOT EXISTS file (
  id_file INT NOT NULL AUTO_INCREMENT,
  id_post INT NOT NULL,
  id_admin INT NOT NULL,
  file_path VARCHAR(255) NULL,
  created_at DATETIME NULL,
  updated_at DATETIME NULL,
  PRIMARY KEY (id_file),
  FOREIGN KEY (id_post) REFERENCES post (id_post),
  FOREIGN KEY (id_admin) REFERENCES admin (id_admin)
);

CREATE TABLE IF NOT EXISTS visit_web (
  id_visit_web INT NOT NULL AUTO_INCREMENT,
  id_user INT NOT NULL,
  id_blog INT NOT NULL,
  ip_adress VARCHAR(20) NULL,
  view_count DECIMAL NULL,
  created_at DATETIME NULL,
  updated_at DATETIME NULL,
  PRIMARY KEY (id_visit_web),
  FOREIGN KEY (id_user) REFERENCES user (id_user),
  FOREIGN KEY (id_blog) REFERENCES blog (id_blog)
);