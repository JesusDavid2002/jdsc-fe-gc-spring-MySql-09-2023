CREATE DATABASE SpringEjercicio1;
USE SpringEjercicio1;

DROP TABLE IF EXISTS `piezas`;
CREATE TABLE piezas (
	codigo int NOT NULL AUTO_INCREMENT,
    nombre varchar(100),
    PRIMARY KEY (codigo)
);

DROP TABLE IF EXISTS `proveedores`;
CREATE TABLE proveedores (
	id char(4) ,
    nombre varchar(100),
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS `suministra`;
CREATE TABLE suministra (
	id int AUTO_INCREMENT,
    precio int,
    id_proveedor char(4),
    codigo_pieza int,
    PRIMARY KEY (id),
    FOREIGN KEY (id_proveedor) REFERENCES proveedores (id)
    ON DELETE cascade
    ON UPDATE cascade,
    FOREIGN KEY (codigo_pieza) REFERENCES piezas (codigo)
     ON DELETE cascade
    ON UPDATE cascade
);