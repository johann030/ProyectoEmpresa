create database tienda;
use tienda;
create table clientes(
codigo_cliente VARCHAR(6) PRIMARY KEY NOT NULL,
nif VARCHAR(9) UNIQUE NOT NULL,
apellidos VARCHAR(35) NOT NULL,
nombre VARCHAR(15) NOT NULL,
domicilio VARCHAR(40) NOT NULL,
codigoPostal VARCHAR(5) NOT NULL,
localidad VARCHAR(20) NOT NULL,
telefono VARCHAR(9) NOT NULL,
movil VARCHAR(9) NOT NULL,
fax VARCHAR(9) NOT NULL,
mail VARCHAR(20) NOT NULL,
TotalVentas FLOAT
);

create table proveedores(
codigo_proveedor INTEGER PRIMARY KEY NOT NULL
);

create table articulos(
codigo_articulo INTEGER PRIMARY KEY NOT NULL
);