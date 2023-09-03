CREATE DATABASE SpringEjercicio4;
USE SpringEjercicio4;

DROP TABLE IF EXISTS `facultades`;
CREATE TABLE facultades(
	codigo int AUTO_INCREMENT,
    nombre varchar(100),
    PRIMARY KEY (codigo)
);

DROP TABLE IF EXISTS `investigadores`;
CREATE TABLE investigadores(
	DNI varchar(8),
    nom_apels varchar(255),
    facultad int,
    PRIMARY KEY (DNI),
    FOREIGN KEY (facultad) REFERENCES facultades (codigo)
    ON DELETE cascade
    ON UPDATE cascade
);

DROP TABLE IF EXISTS `equipos`;
CREATE TABLE equipos(
	num_serie char(4),
    nombre varchar(100),
    facultad int,
    PRIMARY KEY (num_serie),
    FOREIGN KEY (facultad) REFERENCES facultades (codigo) 
    ON DELETE cascade
    ON UPDATE cascade
);

DROP TABLE IF EXISTS `reservas`;
CREATE TABLE reservas (
	id int NOT NULL AUTO_INCREMENT,
	DNI varchar(8),
    num_serie char(4),
    comienzo datetime,
    fin datetime,
    PRIMARY KEY (id),
    FOREIGN KEY (DNI) REFERENCES investigadores (DNI) 
    ON DELETE cascade
    ON UPDATE cascade,
    FOREIGN KEY (num_serie) REFERENCES equipos (num_serie) 
    ON DELETE cascade
    ON UPDATE cascade
);