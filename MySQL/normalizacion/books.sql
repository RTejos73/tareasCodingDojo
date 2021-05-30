CREATE DATABASE IF NOT EXISTS books;
USE books;

CREATE TABLE IF NOT EXISTS book (
	id_book INT NOT NULL AUTO_INCREMENT,
	nombre_libro VARCHAR(255) NULL,
	titulo VARCHAR(255) NULL,
	autor VARCHAR(255) NULL,
	create_at DATETIME NULL,
	update_at DATETIME NULL,
	PRIMARY KEY (id_book));

CREATE TABLE IF NOT EXISTS user (
	id_user INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(255) NULL,
	correo VARCHAR(255) NULL,
	pass VARCHAR(255) NULL,
	create_at DATETIME NULL,
	updated_at DATETIME NULL,
	PRIMARY KEY (id_user));

CREATE TABLE IF NOT EXISTS book_favorite (
	id_bf INT NOT NULL AUTO_INCREMENT,
	id_user INT NOT NULL,
	id_book INT NOT NULL,
	created_at DATETIME NULL,
	updated_at DATETIME NULL,
	PRIMARY KEY (id_bf),
	FOREIGN KEY (id_user) REFERENCES user (id_user),
    FOREIGN KEY (id_book) REFERENCES book (id_book)
);