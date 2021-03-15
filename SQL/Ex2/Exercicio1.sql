create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(
idClasse bigint auto_increment,
classe varchar(15),
habilidade varchar(25),
passiva varchar(25),
primary key(idClasse)
);

create table tb_personagem(
id bigint auto_increment,
nomePersonagem varchar(20) not null,
poderDeAtaque float not null,
poderDeDefesa float not null,
vida int not null,
sexo varchar(1) not null,
idClasse_fk bigint,
primary key(id),
foreign key (idClasse_fk)  references tb_classe(idClasse)
);

insert into tb_classe (classe,habilidade,passiva) values ("Arqueiro","Chuva de Flechas","Criar Flechas");
insert into tb_classe (classe,habilidade,passiva) values ("Guerreiro","Espada do Céu","Armadura de Espinhos");
insert into tb_classe (classe,habilidade,passiva) values ("Mago","Nevasca","Regeneração de Mana");
insert into tb_classe (classe,habilidade,passiva) values ("Bruxo","Ilusão","Dibre");
insert into tb_classe (classe,habilidade,passiva) values ("Curandeiro","Cura Divina","Auto Cura");


insert into tb_personagem (nomePersonagem,poderDeAtaque,poderDeDefesa,vida,sexo) values ("Ronaldinho",8000,3500,9999,"M");
insert into tb_personagem (nomePersonagem,poderDeAtaque,poderDeDefesa,vida,sexo) values ("Cristiano",9000,2500,7500,"M");
insert into tb_personagem (nomePersonagem,poderDeAtaque,poderDeDefesa,vida,sexo) values ("Marta",15000,1500,10000,"F");
insert into tb_personagem (nomePersonagem,poderDeAtaque,poderDeDefesa,vida,sexo) values ("Theresklovania",300,950,200,"F");
insert into tb_personagem (nomePersonagem,poderDeAtaque,poderDeDefesa,vida,sexo) values ("Garen",2500,12000,15000,"M");
insert into tb_personagem (nomePersonagem,poderDeAtaque,poderDeDefesa,vida,sexo) values ("Gutts",9500,8500,99999,"M");
insert into tb_personagem (nomePersonagem,poderDeAtaque,poderDeDefesa,vida,sexo) values ("Chuck Norris",8000,3500,9999,"M");
insert into tb_personagem (nomePersonagem,poderDeAtaque,poderDeDefesa,vida,sexo) values ("Kuririn",250,250,1,"M");

select * from tb_personagem where poderDeAtaque  > 1000;

select * from tb_personagem where poderDeDefesa  > 1000 and poderDeDefesa < 2000;

select * from tb_personagem where nomePersonagem like '%c%';

select * from tb_classe cl inner join tb_personagem pe on pe.id = cl.idClasse;

select * from tb_classe cl inner join tb_personagem pe on pe.id = cl.idClasse where cl.classe = "Arqueiro";


