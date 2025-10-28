SELECT * FROM cliente WHERE rua = "Marcelino Ramos" ;

SELECT * FROM cliente WHERE data_nascimento BETWEEN "1996-02-12" and "2001-01-02";

SELECT * FROM cliente WHERE data_nascimento = "1996-02-12";

-- ---------------------------------------------------------------------------------

SELECT * FROM carro WHERE ano = "2022";

SELECT * FROM carro WHERE ano BETWEEN "2021" and "2023";

SELECT * FROM carro WHERE modelo LIKE "%C%";

-- -----------------------

SELECT * FROM aluguel WHERE codaluguel = "1";

SELECT * FROM aluguel WHERE dataDevolucao BETWEEN "2024-03-03" AND "2024-11-27";

SELECT * FROM aluguel WHERE codcliente= "5";

-- -----------------

SELECT * FROM cidade WHERE codcidade = "1";

SELECT * FROM cidade WHERE codcidade = "7";

SELECT * FROM cidade WHERE regiao = "Sul";

-- ----------

SELECT * FROM marca WHERE codmarca = "1";

SELECT * FROM marca WHERE codmarca = "7";

SELECT * FROM marca WHERE nome = "Volkswagen";




