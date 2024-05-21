-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS logistica;
USE logistica;

-- Crear la tabla Persona
CREATE TABLE Persona (
    cedula VARCHAR(20) PRIMARY KEY not null,
    apellidos VARCHAR(50),
    nombres VARCHAR(50),
    mail VARCHAR(50)
);

-- Crear la tabla Direccion
CREATE TABLE Direccion (
    codigo VARCHAR(20) PRIMARY KEY not null,
    calle1 VARCHAR(100),
    calle2 VARCHAR(100),
    referencia VARCHAR(200),
    actual BOOLEAN
);

-- Crear la tabla Cliente
CREATE TABLE Cliente (
    cedula VARCHAR(20) PRIMARY KEY not null,
    celular VARCHAR(20),
    codigo_direcc VARCHAR(20),
    FOREIGN KEY (cedula) REFERENCES Persona(cedula),
    FOREIGN KEY (codigo_direcc) REFERENCES Direccion(codigo)
);

-- Crear la tabla Paquete
CREATE TABLE Paquete (
    idpaq INT PRIMARY KEY AUTO_INCREMENT,
    codigo VARCHAR(20),
    descripcion VARCHAR(200),
    peso INT,
    alto INT
);

-- Crear la tabla Entrega
CREATE TABLE Entrega (
    codigo VARCHAR(20) PRIMARY KEY,
    fecha DATE,
    observacion VARCHAR(200),
    cliente_cedula VARCHAR(20),
    repartidor_cedula VARCHAR(20),
    FOREIGN KEY (cliente_cedula) REFERENCES Cliente(cedula),
    FOREIGN KEY (repartidor_cedula) REFERENCES Repartidor(cedula)
);

-- Crear la tabla Empleado
CREATE TABLE Empleado (
    cedula VARCHAR(20),
    ciudad VARCHAR(50),
    FOREIGN KEY (cedula) REFERENCES Persona(cedula)
);

-- Crear la tabla Repartidor
CREATE TABLE Repartidor (
    cedula VARCHAR(20),
    zona INT,
    FOREIGN KEY (cedula) REFERENCES Empleado(cedula)
);

-- Crear la tabla Bodeguero
CREATE TABLE Bodeguero (
    cedula VARCHAR(20),
    local_b VARCHAR(50),
    FOREIGN KEY (cedula) REFERENCES Empleado(cedula)
);

-- Crear la tabla Estado
CREATE TABLE Estado (
    id INT PRIMARY KEY AUTO_INCREMENT,
    tipo INT,
    estado VARCHAR(50),
    fecha DATE,
    observacion VARCHAR(200),
    paquete_id INT,
    FOREIGN KEY (paquete_id) REFERENCES Paquete(idpaq)
);

-- Crear la relación entre Cliente y Direccion
ALTER TABLE Direccion
ADD CONSTRAINT FK_ClienteDireccion FOREIGN KEY (cliente_cedula) REFERENCES Cliente(cedula);

-- Crear la relación entre Entrega y Cliente
ALTER TABLE Entrega
ADD CONSTRAINT FK_EntregaCliente FOREIGN KEY (cliente_cedula) REFERENCES Cliente(cedula);

-- Crear la relación entre Entrega y Repartidor
ALTER TABLE Entrega
ADD CONSTRAINT FK_EntregaRepartidor FOREIGN KEY (repartidor_cedula) REFERENCES Repartidor(cedula);

-- Crear la relación entre Paquete y Estado
ALTER TABLE Estado
ADD CONSTRAINT FK_PaqueteEstado FOREIGN KEY (paquete_id) REFERENCES Paquete(idpaq);