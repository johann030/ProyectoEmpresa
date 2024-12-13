create database tienda;
use tienda;
create table clientes(
codigo_cliente VARCHAR(6) PRIMARY KEY NOT NULL,
nif VARCHAR(9) UNIQUE,
apellidos VARCHAR(35),
nombre VARCHAR(15),
domicilio VARCHAR(40),
codigoPostal VARCHAR(5),
localidad VARCHAR(20,
telefono VARCHAR(9),
movil VARCHAR(9),
fax VARCHAR(9),
mail VARCHAR(20),
totalVentas FLOAT
);

create table proveedores(
codigo_proveedor VARCHAR(6) PRIMARY KEY NOT NULL
nif VARCHAR(9) UNIQUE,
apellidos VARCHAR(35),
nombre VARCHAR(15),
domicilio VARCHAR(40),
codigoPostal VARCHAR(5),
localidad VARCHAR(20,
telefono VARCHAR(9),
movil VARCHAR(9),
fax VARCHAR(9),
mail VARCHAR(20),
totalVentas FLOAT
);

create table articulos(
codigo_articulo VARCHAR(6 PRIMARY KEY NOT NULL
descripcion VARCHAR(25),
stock FLOAT,
stockMinimo FLOAT,
precioCompre FLOAT,
precioVenta FLOAT
);