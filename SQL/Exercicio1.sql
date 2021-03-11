create database Empresa_Rh;
use Empresa_RH;

create table tb_funcionarios(
id bigint auto_increment,
nome varchar(50) not null,
idade int not null,
salario float not null,
area varchar(20) not null,
primary key(id)
);

insert into tb_funcionarios (nome, idade, salario, area) values ("Douglas", 25, 2500,"Financas");
insert into tb_funcionarios (nome, idade, salario, area) values ("Giovani", 15, 900,"Estagiario");
insert into tb_funcionarios (nome, idade, salario, area) values ("Yuri", 26, 3800,"Desenvolvimento");
insert into tb_funcionarios (nome, idade, salario, area) values ("Carla", 24, 6300,"Administração");
insert into tb_funcionarios (nome, idade, salario, area) values ("Beatriz", 35, 900,"Estagiaria");

select * from tb_funcionarios;

select * from tb_funcionarios where salario >= 2500;

select * from tb_funcionarios where salario < 2500;

