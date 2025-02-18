#Crear Base de datos TicketWizard
CREATE DATABASE TicketWizard10am;
#Usar la base de datos TicketWizard
USE TcketWizard10am;

#Crear tabla eventos
CREATE TABLE eventos(
	  codigoEvento INT NOT NULL AUTO_INCREMENT, 
    ciudad VARCHAR(50) NOT NULL,
    estado VARCHAR(20) NOT NULL,
    descripcion VARCHAR(300) NOT NULL,
    fecha DATE NOT NULL,
    nombre VARCHAR(100) NOT NULL
);

#Crear tabla personas
CREATE TABLE personas(
	codigoPersona INT NOT NULL AUTO_INCREMENT,
    saldo DECIMAL NOT NULL,
    nombreCompleto VARCHAR(300) NOT NULL,
    fechaNacimiento DATE NOT NULL,
    
    correoElectronico VARCHAR(300) NOT NULL,
);
