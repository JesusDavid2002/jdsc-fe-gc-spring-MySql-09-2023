CREATE DATABASE SpringEjercicio3;
USE SpringEjercicio3;

DROP TABLE IF EXISTS `cajeros`;
CREATE TABLE cajeros(
	codigo int AUTO_INCREMENT,
    nom_apels varchar(225),
    PRIMARY KEY (codigo)
);

DROP TABLE IF EXISTS `productos`;
CREATE TABLE productos(
	codigo int AUTO_INCREMENT,
    nombre varchar(100),
    precio int,
    PRIMARY KEY (codigo)
);

DROP TABLE IF EXISTS `maquinas_registradas`;
CREATE TABLE maquinas_registradas(
	codigo int AUTO_INCREMENT,
    piso int,
    PRIMARY KEY (codigo)
);

DROP TABLE IF EXISTS `ventas`;
CREATE TABLE ventas(
	id int NOT NULL AUTO_INCREMENT,
	id_cajero int,
    id_maquina int,
    id_producto int,
    PRIMARY KEY (id),
    FOREIGN KEY (id_cajero) REFERENCES cajeros (codigo)
    ON DELETE cascade
    ON UPDATE cascade,
    FOREIGN KEY (id_producto) REFERENCES productos (codigo)
    ON DELETE cascade
    ON UPDATE cascade,
    FOREIGN KEY (id_maquina) REFERENCES maquinas_registradas (codigo)
    ON DELETE cascade
    ON UPDATE cascade
);