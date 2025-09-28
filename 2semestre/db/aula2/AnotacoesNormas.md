# Anotações aula dia 26/08 - Banco de Dados



#### **1NF:** 



* Todos atributos tem que ter apenas um valor correspondente e devem ser singulares.



* Para se adequar a norma 1fn, deve identificar a chave primaria da tabela. Após, devemos reconhecer o grupo repetitivo e removê-lo da entidade. 

Em seguida, criamos uma nova tabela com a chave primária da tabela anterior e o grupo repetitivo.



* Um exemplo de bd que esta forma da norma **1FN,** seria um endereço que tem em uma unica célula vários elementos (bairro, rua, cidade)





#### **2NF:**



* É uma sequência da norma **1FN,** então deve-se adequar a norma anterior.



* Todos os atributos não-chave dependem completamente dachave primária.



* Violações comuns da 2NF ocorrem quando há atributos quedependem apenas de parte da chave primária.



* Buscando se adequar a norma **2FN**, Devemos localizar os valores que dependem parcialmente da chave primária e criar tabelas separadas para conjuntos

de valores que se aplicam a vários registros e relacionar estas tabelas com uma chave estrangeira.

#### 

#### **3NF:**



• A tabela está em 2NF.



• Nenhum atributo não-chave depende de outro atributo nãochave.



• Violações comuns da 3NF ocorrem quando há dependências funcionais transitivas entre atributos não-chave.



#### **4FN e 5FN:**



• As formas normais 4FN (Quarta Forma Normal) e 5FN (Quinta Forma Normal) são níveis avançados de

normalização em bancos de dados relacionais, utilizados para eliminar redundâncias e dependências complexas que

podem surgir em tabelas que já estão nas formas normais mais básicas (1FN, 2FN e 3FN).



#### **Desnormalização:**



• A desnormalização é o processo de intencionalmente violar

as regras de normalização para melhorar o desempenho de

um banco de dados.



• Ela deve ser usada com cuidado, pois pode comprometer a

integridade dos dados.









