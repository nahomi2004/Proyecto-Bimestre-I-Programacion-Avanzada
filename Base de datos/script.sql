-- Script para crear la base de datos y las tablas según las entidades JPA proporcionadas.

-- Crear la base de datos
CREATE DATABASE logistica;
USE logistica;

-- Crear la tabla Persona
CREATE TABLE Persona (
    cedula VARCHAR(255) NOT NULL,
    nombre VARCHAR(255),
    apellido VARCHAR(255),
    mail VARCHAR(255),
    PRIMARY KEY (cedula)
);

-- Crear la tabla Cliente que hereda de Persona
CREATE TABLE Cliente (
    cedula VARCHAR(255) NOT NULL,
    celular VARCHAR(255),
    PRIMARY KEY (cedula),
    FOREIGN KEY (cedula) REFERENCES Persona(cedula)
);

-- Crear la tabla Empleado que hereda de Persona
CREATE TABLE Empleado (
    cedula VARCHAR(255) NOT NULL,
    ciudad VARCHAR(255),
    PRIMARY KEY (cedula),
    FOREIGN KEY (cedula) REFERENCES Persona(cedula)
);

-- Crear la tabla Bodeguero que hereda de Empleado
CREATE TABLE Bodeguero (
    cedula VARCHAR(255) NOT NULL,
    local VARCHAR(255),
    PRIMARY KEY (cedula),
    FOREIGN KEY (cedula) REFERENCES Empleado(cedula)
);

-- Crear la tabla Repartidor que hereda de Empleado
CREATE TABLE Repartidor (
    cedula VARCHAR(255) NOT NULL,
    zona INT,
    PRIMARY KEY (cedula),
    FOREIGN KEY (cedula) REFERENCES Empleado(cedula)
);


-- Crear la tabla Entrega
CREATE TABLE Entrega (
    codigo VARCHAR(255) NOT NULL,
    fecha DATE,
    obs VARCHAR(255),
    cliente_cedula VARCHAR(255),
    repartidor_cedula VARCHAR(255),
    PRIMARY KEY (codigo),
    FOREIGN KEY (cliente_cedula) REFERENCES Cliente(cedula),
    FOREIGN KEY (repartidor_cedula) REFERENCES Repartidor(cedula)
);

-- Crear la tabla Paquete
CREATE TABLE Paquete (
    idPaquete INT NOT NULL,
    codigo VARCHAR(255),
    descrip VARCHAR(255),
    peso INT,
    alto INT,
    entrega_codigo VARCHAR(255),
    PRIMARY KEY (idPaquete),
    FOREIGN KEY (entrega_codigo) REFERENCES Entrega(codigo)
);

-- Crear la tabla Direccion
CREATE TABLE Direccion (
    codigo VARCHAR(255) NOT NULL,
    calle1 VARCHAR(255),
    calle2 VARCHAR(255),
    referencia VARCHAR(255),
    actual INT,
    cliente_cedula VARCHAR(255),
    PRIMARY KEY (codigo),
    FOREIGN KEY (cliente_cedula) REFERENCES Cliente(cedula)
);

-- Crear la tabla Estado
CREATE TABLE Estado (
    tipo INT NOT NULL,
    estado VARCHAR(255),
    fecha DATE,
    observacion VARCHAR(255),
    paquete_idPaquete INT,
    PRIMARY KEY (tipo),
    FOREIGN KEY (paquete_idPaquete) REFERENCES Paquete(idPaquete)
);


