CREATE DATABASE ticketwizard_db;
USE ticketwizard_db;

#Crear tabla de durecciones eventos?
CREATE TABLE Eventos(
	codigo_evento INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    descripcion VARCHAR (300) NOT NULL,
    estado VARCHAR(20) NOT NULL,
    ciudad VARCHAR(50) NOT NULL,
    recinto VARCHAR(100) NOT NULL,
    fecha DATETIME NOT NULL
);

CREATE TABLE Direcciones_Personas(
	codigo_direccion BIGINT PRIMARY KEY AUTO_INCREMENT,
    numero INT NOT NULL,
    calle VARCHAR(50) NOT NULL,
    colonia VARCHAR(50) NOT NULL,
    ciudad VARCHAR(50) NOT NULL,
    estado VARCHAR(20) NOT NULL
);

CREATE TABLE Personas(
	codigo_persona BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombres VARCHAR(50) NOT NULL,
    apellido_paterno VARCHAR(50) NOT NULL,
    apellido_materno VARCHAR(50) NOT NULL,
    codigo_direccion BIGINT NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    correo_electronico VARCHAR(320) NOT NULL,
    saldo DECIMAL NOT NULL,
    FOREIGN KEY(codigo_direccion) REFERENCES Direcciones_Personas(codigo_direccion)
);

CREATE TABLE Boletos(
	numero_serie VARCHAR(8) PRIMARY KEY,
    numero_control VARCHAR(10) NOT NULL, 
    precio_original DECIMAL NOT NULL,
    fila VARCHAR(1) NOT NULL,         
    asiento INT NOT NULL,             
	codigo_evento INT NOT NULL,
    codigo_usuario BIGINT NULL,
	FOREIGN KEY(codigo_persona) REFERENCES Personas(codigo_usuario),
    FOREIGN KEY(codigo_evento) REFERENCES Eventos(codigo_evento)
);

CREATE TABLE Ventas(
	codigo_venta BIGINT PRIMARY KEY AUTO_INCREMENT,
    codigo_persona_compradora BIGINT NULL,
    fecha_hora DATEtime NOT NULL,
    fecha_limite DATE NOT NULL,
    numero_serie_boleto VARCHAR(8),
    codigo_reserva BIGINT NOT NULL,
    FOREIGN KEY(numero_serie_boleto) REFERENCES Boletos(numero_serie),
    FOREIGN KEY(codigo_reserva) REFERENCES Reservas(codigo_reserva),
	FOREIGN KEY(codigo_persona_compradora) REFERENCES Personas(codigo_persona)
);

CREATE TABLE Reservas(
	codigo_reserva BIGINT NOT NULL AUTO_INCREMENT,
    fecha_limite DATETIME NOT NULL
);





