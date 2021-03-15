create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
id bigint auto_increment,
tipoProduto varchar(10) not null,
estoque boolean not null,
entrega boolean not null,
primary key(id)
);

create table produto(
id bigint auto_increment,
nomeProduto varchar(50) not null,
preco float not null,
quantidade int not null,
descricao varchar(30) not null,
receita varchar(1),
id_fk bigint not null,
primary key(id),
foreign key(id_fk) references tb_categoria(id)
);

insert into tb_categoria (tipoProduto,estoque,entrega) values ("Medicar",true,true);
insert into tb_categoria (tipoProduto,estoque,entrega) values ("Genericos",true,false);
insert into tb_categoria (tipoProduto,estoque,entrega) values ("Cosmeticos",true,true);
insert into tb_categoria (tipoProduto,estoque,entrega) values ("Medicar",true,false);
insert into tb_categoria (tipoProduto,estoque,entrega) values ("Genericos",true,true);

insert into produto (nomeProduto,preco,quantidade,descricao,receita,id_fk) values ("Pantogar",91.20,20,"Fortalece seus cabelos",'S',1);
insert into produto (nomeProduto,preco,quantidade,descricao,receita,id_fk) values ("Fluconazol",4.89,35,"Impede Fungos",'N',4);
insert into produto (nomeProduto,preco,quantidade,descricao,receita,id_fk) values ("Desodorante",16.99,40,"Ajuda na Recuperação",'N',3);
insert into produto (nomeProduto,preco,quantidade,descricao,receita,id_fk) values ("Hidratante",29.99,20,"Acaba com a oleosidade",'N',3);
insert into produto (nomeProduto,preco,quantidade,descricao,receita,id_fk) values ("Lumi",96.51,10,"Fortalece seus cabelos",'S',4);
insert into produto (nomeProduto,preco,quantidade,descricao,receita,id_fk) values ("Besilato",17.90,15,"Mais sangue e oxigenio",'N',1);
insert into produto (nomeProduto,preco,quantidade,descricao,receita,id_fk) values ("Dorflex",16.99,50,"Relaxante Muscular",'N',4);
insert into produto (nomeProduto,preco,quantidade,descricao,receita,id_fk) values ("Azelan",55.28,10,"Creme Para Acne",'N',3);

select * from produto where preco > 50;

select * from produto where preco between 3 and 60;

select * from produto where nomeProduto like 'b%';

select * from tb_categoria as Ca inner join produto as Pr on Ca.id = Pr.id_fk where tipoProduto = 'Cosmeticos';