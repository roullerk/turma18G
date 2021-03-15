create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
tipoPizza varchar(10) not null,
azeitona boolean not null,
bordaRecheada boolean not null,
primary key(id)
);

create table tb_pizza(
idPizza bigint auto_increment,
nomePizza varchar(20) not null,
tamanho varchar(7) not null,
preco float not null,
quantidade int not null,
espessura varchar(12) not null,
id_fk bigint not null,
primary key(idPizza),
foreign key(id_fk) references tb_categoria(id)
);

insert into tb_categoria (tipoPizza,azeitona,bordaRecheada) values ("Salgada",true,true);
insert into tb_categoria (tipoPizza,azeitona,bordaRecheada) values ("Doce",false,false);
insert into tb_categoria (tipoPizza,azeitona,bordaRecheada) values ("Salgada",false,true);
insert into tb_categoria (tipoPizza,azeitona,bordaRecheada) values ("Doce",false,true);
insert into tb_categoria (tipoPizza,azeitona,bordaRecheada) values ("Especial",true,true);

insert into tb_pizza (nomePizza,tamanho,preco,quantidade,espessura,id_fk) values ("Frango Com Catupiry","Grande",18.99,85,"Grossa",1);
insert into tb_pizza (nomePizza,tamanho,preco,quantidade,espessura,id_fk) values ("Chocolate","Broto",28.29,10,"Fina",2);
insert into tb_pizza (nomePizza,tamanho,preco,quantidade,espessura,id_fk) values ("Portuguesa","Pequena",22.19,50,"Grossa",3);
insert into tb_pizza (nomePizza,tamanho,preco,quantidade,espessura,id_fk) values ("Chocolate Branco","Media",29.99,15,"Fina",2);
insert into tb_pizza (nomePizza,tamanho,preco,quantidade,espessura,id_fk) values ("Frango Com Cheddar","Grande",75.99,85,"Grossa",5);
insert into tb_pizza (nomePizza,tamanho,preco,quantidade,espessura,id_fk) values ("Berinjela","Pequena",15.99,5,"Fina",1);
insert into tb_pizza (nomePizza,tamanho,preco,quantidade,espessura,id_fk) values ("Chocolate Amargo","Pequena",20.99,15,"Grossa",4);
insert into tb_pizza (nomePizza,tamanho,preco,quantidade,espessura,id_fk) values ("Calabresa","Grande",25.10,20,"Fina",3);

select * from tb_pizza where preco > 45;

select * from tb_pizza where preco between 29 and 60;

select * from tb_pizza where nomePizza like 'C%';

select tipoPizza, azeitona, bordaRecheada, nomePizza, tamanho, preco, quantidade, espessura from  tb_categoria as Ca inner join tb_pizza Pi on Ca.id = Pi.idPizza;

select * from  tb_categoria as Ca inner join tb_pizza Pi on Ca.id = Pi.id_fk where tipoPizza = 'Doce';

select * from tb_pizza;



