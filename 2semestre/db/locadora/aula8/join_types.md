# Tipos de Join

## O que é um join?
 - É uma forma de juntar colunas de duas ou mais tabelas, usando o elemento em comum.

### INNER JOIN
```SQL
SELECT <select_list>
FROM Tabela A
INNER JOIN Tabela B
ON A.Key = B.Key
```
Compara cada linha da tabela A, com as linhas da tabela B para encontrar todos os pares semelhantes. Os valores que são iguais serão combinados em uma nova linha.

### LEFT JOIN
```SQL
SELECT <select_list>
FROM Tabela A
LEFT JOIN Tabela B
ON A.Key = B.Key
```
Para cada linha da tabela A, a consulta a compara com todas as linhas da tabela B. Se um par de linhas fizer com que a condição de junção seja avaliado como TRUE, os valores da coluna dessas linhas serão combinados para formar uma nova linha que será incluída no conjunto de resultados.

Se uma linha da tabela “esquerda” A não tiver nenhuma linha correspondente da tabela “direita” B, a consulta irá combinar os valores da coluna da linha da tabela “esquerda” A com NULL para cada valor da coluna da tabela da “direita” B que não satisfaça a condição de junto (FALSE).

### RIGHT JOIN
```SQL
SELECT <select_list>
FROM Tabela A
RIGHT JOIN Tabela B
ON A.Key = B.Key
```
A RIGHT JOIN combina dados de duas ou mais tabelas. A RIGHT JOIN começa a selecionar dados da tabela “direita” B e a corresponder às linhas da tabela “esquerda” A.

A RIGHT JOIN retorna um conjunto de resultados que inclui todas as linhas da tabela “direita” B, com ou sem linhas correspondentes na tabela “esquerda” A. Se uma linha na tabela direita B não tiver nenhuma linha correspondente da tabela “esquerda” A, a coluna da tabela “esquerda” A no conjunto de resultados será nula igualmente ao que acontece no LEFT JOIN.

### FULL JOIN
```SQL
SELECT <select_list>
FROM Tabela A
FULL JOIN Tabela B
ON A.Key = B.Key
```
A cláusula FULL JOIN retorna todas as linhas das tabelas unidas, correspondidas ou não, ou seja, você pode dizer que a FULL JOIN combina as funções da LEFT JOIN e da RIGHT JOIN. FULL JOIN é um tipo de junção externa, por isso também é chamada junção externa completa.

Quando não existem linhas correspondentes para a linha da tabela esquerda, as colunas da tabela direita serão nulas. Da mesma forma, quando não existem linhas correspondentes para a linha da tabela direita, a coluna da tabela esquerda será nula.

### CROSS JOIN
```SQL
SELECT <select_list>
FROM Tabela A
CROSS JOIN Tabela B
```
A cláusula CROSS JOIN retorna todas as linhas das tabelas por cruzamento, ou seja, para cada linha da tabela esquerda queremos todos os linhas da tabelas direita ou vice-versa. Ele também é chamado de produto cartesiano entre duas tabelas. Porém, para isso é preciso que ambas tenham o campo em comum, para que a ligação exista entre as duas tabelas.

Para entender melhor, pense que temos um banco de dado, onde temos uma tabela FUNCIONÁRIO e uma tabela CARGO, assim poderíamos ter vários cargos para um único FUNCIONÁRIO, e usando o CROSS JOIN podemos trazer todos os CARGOS de todos os FUNCIONÁRIOS.