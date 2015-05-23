-- projeto tem por objetivo criar um forma simples de controlar 
-- o patrimonio da PixarHC 

create database if not exists pixarhc;
use pixarhc;

-- Tabelas 
create table if not exists pessoas
(
    idPessoa int unsigned not null auto_increment,
    nome varchar (30) not null,
    primary key (idPessoa)
);

create table if not exists doadores
(
    idDoador int unsigned not null,
    primary key(idDoador),
    foreign key (idDoador) references pessoas (idPessoa)

); 

