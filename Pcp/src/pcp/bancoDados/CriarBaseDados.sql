-- projeto tem por objetivo criar um forma simples de controlar 
-- o patrimonio da PixarHC 

create database if not exists pixarhc;
-- Tabelas 

create table if not exists pixarhc.pessoas
(
    idPessoa int unsigned not null auto_increment,
    nome varchar (30) not null,
    primary key (idPessoa)
);

create table if not exists pixarhc.doadores
(
    idDoador int unsigned not null,
    primary key(idDoador),
    foreign key (idDoador) references pixarhc.pessoas (idPessoa)

); 

create table if not exists pixarhc.equipamento
 (
    idEquipamento int unsigned not null auto_increment,
    codDoador int unsigned,
    quantidade int,
    nome varchar (50),
    descricao blob ,
    primary key (idEquipamento),
    foreign key (codDoador) references pixarhc.doadores(idDoador)
);
