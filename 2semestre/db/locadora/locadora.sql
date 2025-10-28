create database locadora;
use locadora;
create table cliente (
cpf bigint (20),
nome varchar (45),
telefone bigint (20),
rua varchar (45),
bairro varchar(45),
cep bigint (20),
cidade varchar (45)
);
create table carro (
placa varchar (45),
modelo varchar (45),
ano bigint (10),
marca varchar(45)
);
insert into cliente (cpf, nome, telefone, rua, bairro, cep, data_nascimento, codcidade) values (01451658640, 'Alessandra', 999893614, 'Alemanha', 'Centro', 99711000, '1996-02-12', 1);
select*from cliente;
insert into cliente (cpf, nome, telefone, rua, bairro, cep, data_nascimento, codcidade) values (01603406003, 'Ana', 999336925, 'Marcelino Ramos', 'Centro', 99711000, '1999-10-09', 1);
insert into cliente (cpf, nome, telefone, rua, bairro, cep, data_nascimento, codcidade) values (03361391080, 'Alissia', 999693619, 'Itália', 'Centro', 99711000, '1997-05-10', 1);
insert into cliente (cpf, nome, telefone, rua, bairro, cep, data_nascimento, codcidade) values (06639625812, 'Amanda', 999698732, 'Portugal', 'Centro', 99711000, '1998-26-12', 1);
insert into cliente (cpf, nome, telefone, rua, bairro, cep, data_nascimento, codcidade) values (09963285471, 'Bruna', 999567984, 'Paris', 'Centro', 99711011, '2000-02-12', 3);
insert into cliente (cpf, nome, telefone, rua, bairro, cep, data_nascimento, codcidade) values (89974126398, 'Maria', 999896574, 'Londres', 'Centro', 99711011, '2005-20-02', 3);
insert into cliente (cpf, nome, telefone, rua, bairro, cep, data_nascimento, codcidade) values (01496385274, 'João', 999749685, 'Brasil', 'Centro', 99711011, '2001-02-01', 3);
insert into cliente (cpf, nome, telefone, rua, bairro, cep, data_nascimento, codcidade) values (06675395186, 'Marcelo', 999326947, 'Branca', 'Centro', 99711040, '1996-23-07', 2);
insert into cliente (cpf, nome, telefone, rua, bairro, cep, data_nascimento, codcidade) values (08815975369, 'Carlos', 999123645, 'Amarela', 'Centro', 99711040, '1989-18-06', 2);
insert into cliente (cpf, nome, telefone, rua, bairro, cep, data_nascimento, codcidade) values (09978932163, 'Miguel', 999963746, 'Joaquim', 'Centro', 99711011, '2009-09-09', 3);
insert into cliente (cpf, nome, telefone, rua, bairro, cep, data_nascimento, codcidade) values (07756398710, 'Melissa', 999012639, 'Germanio', 'Centro', 99711000, '1995-06-02', 1);
insert into cliente (cpf, nome, telefone, rua, bairro, cep, data_nascimento, codcidade) values (01670904040, 'Júlia', 999895210, 'Natal', 'Santa Catarina', 99711000, '2000-05-04', 1);

update cliente set data_nascimento = '1999-04-04' where codcliente = '16';
update cliente set data_nascimento = '1999-09-09' where codcliente = '17';
update cliente set data_nascimento = '1998-08-08' where codcliente = '19';
update cliente set data_nascimento = '1991-01-01' where codcliente = '20';

alter table cliente drop column cidade;

update cliente set rua = 'Joaquim de Moura Faitão' where nome = 'Alessandra';
update cliente set cidade = 'Sertão' where nome = 'João';
update cliente set cep = '99711060' where nome = 'João';
update cliente set bairro = 'Espírito Santo' where nome = 'João';

delete from cliente where nome = 'Carlos';

select*from cliente where nome like 'A%';
select nome,rua from cliente where cidade = 'Gaurama';

insert into carro (placa, modelo, ano, cor, codmarca) values ('LSN4I49', 'Virtus', 2022, 'cinza', 1);
select*from carro;
insert into carro (placa, modelo, ano, cor, codmarca) values ('EFN4I49', 'Civic', 2021, 'preto', 2);
insert into carro (placa, modelo, ano, cor, codmarca) values ('FRL9P36', 'Corola', 2023, 'branco', 3);
insert into carro (placa, modelo, ano, cor, codmarca) values ('LMN5I36', 'Polo', 2024, 'prata', 1);

alter table carro drop column marca;

delete from carro where placa = 'LSN4I49';

insert into carro values ('LSN4I49', 'Virtus', 2022, 'Volkswagen');

select*from carro where modelo like 'V%';
select modelo from carro where marca = 'Volkswagen';

update carro set ano = '2022' where placa = 'EFN4I49';

alter table cliente add column codcliente int not null auto_increment primary key first;
alter table carro add column codcarro int not null auto_increment primary key first;

select*from cliente;

insert into cliente (CPF,Nome,Telefone,Rua,Bairro,Cep,Cidade)
 values (01670904040, 'Júlia', 999895210, 'Natal', 'Santa Catarina', 99711000, 'Erechim');

desc cliente;

create table cidade (
nome varchar (45),
estado varchar (45)
);

alter table cidade add column codcidade int not null auto_increment primary key first;

alter table cliente add column data_nascimento date after Cidade;
update cliente set data_nascimento = '9999.99.9';

alter table carro add column cor varchar(50) after Marca;

select*from carro;

update carro set cor = 'Vermelho' where codcarro = '1';
update carro set cor = 'Cinza' where codcarro = '2';
update carro set cor = 'Preto' where codcarro = '3';
update carro set cor = 'Chumbo' where codcarro = '4';

update cliente set data_nascimento = '1996-02-12' where codcliente = '1';
update cliente set data_nascimento = '1999-10-09' where codcliente = '2';
update cliente set data_nascimento = '1997-05-10' where codcliente = '3';
update cliente set data_nascimento = '1998-26-12' where codcliente = '4';
update cliente set data_nascimento = '2000-02-12' where codcliente = '5';
update cliente set data_nascimento = '2005-20-02' where codcliente = '6';
update cliente set data_nascimento = '2001-02-01' where codcliente = '7';
update cliente set data_nascimento = '1996-23-07' where codcliente = '8';
update cliente set data_nascimento = '1989-18-06' where codcliente = '9';
update cliente set data_nascimento = '2009-09-09' where codcliente = '10';
update cliente set data_nascimento = '1995-06-02' where codcliente = '11';
update cliente set data_nascimento = '1994-04-04' where codcliente = '12';

alter table cliente add column codcidade int not null, add CONSTRAINT cidade_codcidade_fk  FOREIGN KEY (codcidade) REFERENCES cidade (codcidade);

create table aluguel (
codaluguel int not null auto_increment primary key,
dataAluguel date not null,
dataDevolucao date not null,
codcliente int not null,
constraint cliente_codcliente_fk
foreign key (codcliente)
references cliente (codcliente),
codcarro int not null,
constraint carro_codcarro_fk
foreign key (codcarro)
references carro (codcarro)
);

select*from aluguel;

create table marca (
codmarca int not null auto_increment primary key,
nome varchar(45) not null
);

alter table carro add column codmarca int not null, add CONSTRAINT marca_codmarca_fk  FOREIGN KEY (codmarca) REFERENCES cidade (codmarca);

delete from carro;
delete from cliente; 

select*from cidade;

insert into marca values (1, 'Volkswagen');
insert into marca values (2, 'Honda');
insert into marca values (3, 'Toyota');

delete from marca where codmarca = 4;
delete from marca where codmarca = 5;
delete from cidade where codcidade = 1;

insert into cidade values (1, 'Erechim', 'Rio Grande do Sul');
insert into cidade values (2, 'Sertão', 'Rio Grande do Sul');
insert into cidade values (3, 'Gaurama', 'Rio Grande do Sul');

alter table cidade add column regiao varchar (20) not null;
alter table cidade add column UF varchar (10) after nome; 

update cidade set UF = 'RS' where estado = 'Rio Grande do Sul';
alter table cidade drop column estado;
alter table cidade drop column UF;
update cidade set UF = 'RS' where codcidade = 1;
update cidade set UF = 'RS' where codcidade = 2;
update cidade set UF = 'RS' where codcidade = 3;

update cidade set regiao = case when UF = ('RS') then 'SUL' when UF = ('SP') then 'SUDESTE' else 'NORTE' end;

insert into cidade (nome, UF) values ('São Paulo', 'SP');

select*from cidade order by nome desc;
select*from cliente order by nome;


