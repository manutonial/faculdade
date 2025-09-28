CREATE DATABASE Aula3;
USE Aula3;

CREATE TABLE Cliente (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(45),
    telefone VARCHAR(20),
    endereco VARCHAR(45),
    CEP VARCHAR(45),
    bairro VARCHAR(45)
);

CREATE TABLE Carro (
	placa VARCHAR(45),
	modelo VARCHAR(45),
    ano YEAR
);

INSERT INTO cliente (nome, telefone, endereco, CEP, bairro) VALUES
	("Gabriel", "999999999", "Rua 123", "99999999", "Bairro 456"),
    ("Luciane", "88888888", "Rua 789", "88888888", "Bairro 1011");
    
    
-- ------------------------------------------------ ALTER TABLE --------------------------------------------------------

ALTER TABLE Carro
	ADD COLUMN id INT NOT NULL PRIMARY KEY AUTO_INCREMENT first;
            
ALTER TABLE Carro
	DROP COLUMN id;
    
-- ---------------------------
    
ALTER TABLE Carro
	CHANGE COLUMN modelo tipo VARCHAR(45); -- renomeia a coluna "modelo" para "tipo". Seria possível também mudar o tipo de dado da mesma
    
ALTER TABLE Cliente
	MODIFY COLUMN CEP varchar(11) AFTER bairro;
    
-- ---------------------------
    
ALTER TABLE Carro
	ADD COLUMN cor VARCHAR(20);
    
ALTER TABLE Cliente
	ADD COLUMN idade INT;
    
ALTER TABLE Cliente
	ADD COLUMN dataNasc DATE;
    
-- ------------------------------------------------------------ INSERINDO NOVAS COLUNAS  ---------------------------------------------------------

INSERT INTO Cliente (nome, telefone, endereco, CEP, bairro, idade, dataNasc) VALUES
	("Emanuel", "99799969939", "Rua tresdoisum", "99800900", "Bairro umdoistres", 18, '2006.12.11' );
    
INSERT INTO Carro (placa, tipo, ano, cor) VALUES
	("u6n7c41", "Fusca", '1979', "Azul");
    
-- -----------------------------------------------------------------------------------------------------------------------------------------------

-- -----------------------------------------------------------------------------------------------------------------------------------------------
    
SELECT * FROM Cliente;
SELECT * FROM Carro;    
    
DESC Cliente;
DESC Carro;

-- -----------------------------------------------------------------------------------------------------------------------------------------------

DROP TABLE Cliente;
DELETE FROM Carro;