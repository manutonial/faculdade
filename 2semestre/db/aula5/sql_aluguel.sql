CREATE DATABASE locadora;
USE locadora;

CREATE TABLE cliente (
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(45),
    telefone VARCHAR(20),
    endereco VARCHAR(45),
    CEP VARCHAR(45),
    bairro VARCHAR(45)
);

CREATE TABLE carro (
	id INT PRIMARY KEY,
    placa VARCHAR(45),
	modelo VARCHAR(45),
    ano TIME,
    valorDiaria DOUBLE
);

INSERT INTO cliente VALUES
	(1, "Gabriel", "999999999", "Rua 123", "99999999", "Bairro 456"),
    (2, "Luciane", "88888888", "Rua 789", "88888888", "Bairro 1011"),
    (3, 'Maria Santos', '(31) 97777-5555', 'Rua da Paz, 789', '30123-456', 'Savassi'),
	(4, 'João Pereira', '(41) 96666-7890', 'Alameda Santos, 321', '80000-000', 'Centro'),
	(5, 'Fernanda Costa', '(48) 95555-2222', 'Rua das Palmeiras, 654', '88015-000', 'Trindade'),
	(6, 'Ricardo Almeida', '(51) 94444-3333', 'Avenida Protásio, 987', '90000-000', 'Boa Vista'),
	(7, 'Juliana Rodrigues', '(61) 93333-4444', 'Quadra 105, Conjunto B', '70000-000', 'Asa Sul'),
	(8, 'Pedro Mendes', '(71) 92222-6666', 'Rua do Comércio, 159', '40000-000', 'Comércio'),
	(9, 'Amanda Lima', '(81) 91111-7777', 'Avenida Boa Viagem, 753', '51000-000', 'Boa Viagem'),
	(10, 'Bruno Souza', '(85) 90000-8888', 'Rua Iracema, 258', '60000-000', 'Meireles'),
	(11, 'Patrícia Rocha', '(91) 98888-9999', 'Travessa Padre Eutíquio, 147', '66000-000', 'Nazaré'),
	(12, 'Marcos Ferreira', '(92) 97777-0000', 'Avenida Eduardo Ribeiro, 369', '69000-000', 'Centro');
    
INSERT INTO carro VALUES
	(1, 'ABC1234', 'Fiat Uno', '2018-01-01', 85.00),
	(2, 'DEF1234', 'Volkswagen Gol', '2020-01-01', 95.00),
	(3, 'GHIJKL1234', 'Chevrolet Onix', '2022-01-01', 120.00),
	(4, 'MNO0P12', 'Ford Ka', '2019-01-01', 90.00),
	(5, 'QRS3T45', 'Hyundai HB20', '2021-01-01', 110.00),
	(6, 'UVW6X78', 'Toyota Corolla', '2020-01-01', 180.00),
	(7, 'YZA9B01', 'Honda Civic', '2021-01-01', 190.00),
	(8, 'CDE2F34', 'Renault Kwid', '2019-01-01', 80.00),
	(9, 'GHI5J67', 'Jeep Renegade', '2022-01-01', 200.00),
	(10, 'KLM8N90', 'Fiat Toro', '2021-01-01', 220.00);
    
-- COMANDOS:

DELETE FROM cliente WHERE ID IN(11, 12);

SELECT * FROM cliente;
SELECT * FROM carro;

SELECT placa FROM carro WHERE placa LIKE "%1234";

SELECT modelo, valorDiaria FROM carro WHERE valorDiaria BETWEEN 80 AND 120;

SELECT nome FROM cliente WHERE nome NOT LIKE "%a";

UPDATE cliente 
	SET telefone = 1234567890 
    WHERE nome = "Gabriel";	

DROP TABLE cliente;
DROP TABLE carro;

