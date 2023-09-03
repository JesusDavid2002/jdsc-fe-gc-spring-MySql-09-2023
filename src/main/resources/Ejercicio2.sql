CREATE DATABASE SpringEjercicio2;
USE SpringEjercicio2;

DROP TABLE IF EXISTS `cientificos`;
CREATE TABLE cientificos(
	DNI varchar(8),
    nom_apels varchar(225),
    PRIMARY KEY (DNI)
);

DROP TABLE IF EXISTS `proyectos`;
CREATE TABLE proyectos(
	id char(4),
    nombre varchar(225) unique,
    horas int,
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS `asignado_a`;
CREATE TABLE asignado_a(
	id int NOT NULL AUTO_INCREMENT,
	dni_cientifico varchar(8),
    id_proyecto char(4),
    PRIMARY KEY (id),
    FOREIGN KEY (dni_cientifico) REFERENCES cientificos (DNI)
    ON DELETE cascade
    ON UPDATE cascade,
    FOREIGN KEY (id_proyecto) REFERENCES proyectos (id)
    ON DELETE cascade
    ON UPDATE cascade
);