create database db_nome_minha_casa_mais_bonita;

use db_nome_minha_casa_mais_bonita;

create table tb_categoria(
idCategoria bigint auto_increment,
ambiente varchar(20) not null,
tipoCategoria varchar(20) not null,
descricao varchar(40) not null,
primary key(idCategoria)
);

create table tb_produto(
idProduto bigint auto_increment,
nomeProduto varchar(25) not null,
preco float not null,
quantidade int not null,
cor varchar(10) not null,
descricao varchar(40) not null,
idCategoria_fk bigint not null,
primary key(idProduto),
foreign key(idCategoria_fk) references tb_categoria(idCategoria)
);

create table usuario(
id bigint auto_increment,
nome varchar(15) not null,
sobrenome varchar(15) not null,
cpf varchar(15) not null,
endereco varchar(25) not null,
telefone varchar(15) not null,
primary key(id)
);

insert into tb_categoria (ambiente,tipoCategoria,descricao) values ('Sala','Moveis','Puro Conforto');
insert into tb_categoria (ambiente,tipoCategoria,descricao) values ('Cozinha','Moveis','Puro Conforto');
insert into tb_categoria (ambiente,tipoCategoria,descricao) values ('Quarto','Moveis','Puro Conforto');
insert into tb_categoria (ambiente,tipoCategoria,descricao) values ('Sala','Decoração','Puro Style');
insert into tb_categoria (ambiente,tipoCategoria,descricao) values ('Cozinha','Decoração','Puro Style');

insert into tb_produto (nomeProduto,preco,quantidade,cor,descricao,idCategoria_fk) values ("Sofá", 150.99,20,"Azul","Senta ai",1);
insert into tb_produto (nomeProduto,preco,quantidade,cor,descricao,idCategoria_fk) values ("Cama", 250.99,20,"Preto","Deita ai",3);
insert into tb_produto (nomeProduto,preco,quantidade,cor,descricao,idCategoria_fk) values ("Quadro", 75.99,20,"Marrom","Olha ai",4);
insert into tb_produto (nomeProduto,preco,quantidade,cor,descricao,idCategoria_fk) values ("Mesa", 300.99,20,"Cinza","Come ai",2);
insert into tb_produto (nomeProduto,preco,quantidade,cor,descricao,idCategoria_fk) values ("Armário de Cozinha", 115.99,20,"Branco","Guarda ai",2);
insert into tb_produto (nomeProduto,preco,quantidade,cor,descricao,idCategoria_fk) values ("Armário", 200.99,20,"Preto","Guarda ai",3);
insert into tb_produto (nomeProduto,preco,quantidade,cor,descricao,idCategoria_fk) values ("Criado-Mudo", 75.99,20,"Marrom","Guarda ai",3);
insert into tb_produto (nomeProduto,preco,quantidade,cor,descricao,idCategoria_fk) values ("Frutas Artificiais", 50.99,20,"Todas","Se Ilude ai",5);


insert into usuario (nome,sobrenome,cpf,endereco,telefone) values ('Cris','Junior','255177229-25',"Rua Magda",'1192559-2501');
insert into usuario (nome,sobrenome,cpf,endereco,telefone) values ('El','Zedon','775.147.821-25',"Rua Crispim",'1192758-3504');
insert into usuario (nome,sobrenome,cpf,endereco,telefone) values ('Agata','Inutil','155.177.229-XX',"Rua Mexilhãozinho",'1198599-2250');
insert into usuario (nome,sobrenome,cpf,endereco,telefone) values ('Kagome','Murakama','268.289.148-45',"Rua Bendita",'119785-7821');
insert into usuario (nome,sobrenome,cpf,endereco,telefone) values ('Kripinier','Guedson','448.299.289-04',"Rua Augusta",'1198461-1278');

select * from tb_produto where preco > 50;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where nomeProduto like 'B%';

select * from tb_produto where nomeProduto like 'C%';

select * from tb_categoria Ca inner join tb_produto Pr on Ca.idCategoria = Pr.idCategoria_fk;

select avg(preco) from tb_produto;

select sum(preco) from tb_produto;

select count(idProduto) from tb_produto;




