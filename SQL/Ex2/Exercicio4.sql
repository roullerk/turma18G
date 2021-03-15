create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria(
id bigint auto_increment,
tipoCarne varchar(25) not null,
descricao varchar(40) not null,
ativo boolean not null,
primary key(id)
);

create table tb_produto(
id bigint auto_increment,
nomeCarne varchar(20) not null,
valor float not null,
quantidade int not null,
tipoCorte varchar(15) not null,
temperada boolean not null,
id_fk bigint not null,
primary key(id),
foreign key(id_fk) references tb_categoria(id)
);

insert into tb_categoria (tipoCarne,descricao,ativo) values ("Bovina","boi, vaca, vitelo/novilho (vitela)",true);
insert into tb_categoria (tipoCarne,descricao,ativo) values ("Ave"," frango, peru, pato, galinha",true);
insert into tb_categoria (tipoCarne,descricao,ativo) values ("Suína"," porco, leitão, leitoa",true);
insert into tb_categoria (tipoCarne,descricao,ativo) values ("Caprina","cabra, bode, cabrito",true);
insert into tb_categoria (tipoCarne,descricao,ativo) values ("Ovina","carneiro, ovelha, cordeiro",true);

insert into tb_produto (nomeCarne,valor,quantidade,tipoCorte,temperada,id_fk) values ("Acém",50.99,25,"Fino",true,1);
insert into tb_produto (nomeCarne,valor,quantidade,tipoCorte,temperada,id_fk) values ("Fraldinha",48.99,20,"Fatiado",true,1);
insert into tb_produto (nomeCarne,valor,quantidade,tipoCorte,temperada,id_fk) values ("Coxão-Duro",50.99,25,"Grosso",true,3);
insert into tb_produto (nomeCarne,valor,quantidade,tipoCorte,temperada,id_fk) values ("Bisteca",45.99,25,"Fino",true,3);
insert into tb_produto (nomeCarne,valor,quantidade,tipoCorte,temperada,id_fk) values ("Carré-Curto",70.99,25,"Grosso",true,5);
insert into tb_produto (nomeCarne,valor,quantidade,tipoCorte,temperada,id_fk) values ("Paleta",38.99,25,"Fino",true,4);
insert into tb_produto (nomeCarne,valor,quantidade,tipoCorte,temperada,id_fk) values ("Pernil",80.99,25,"Fino",true,2);
insert into tb_produto (nomeCarne,valor,quantidade,tipoCorte,temperada,id_fk) values ("Filé de Frango",28.99,25,"Grosso",true,2);

select * from tb_produto where valor > 50;

select * from tb_produto where valor between 3 and 60;

select * from tb_produto where nomeCarne like 'C%';

select * from  tb_categoria as Ca inner join tb_produto Pr on Ca.id = Pr.id_fk where tipoCarne = 'Bovina';
