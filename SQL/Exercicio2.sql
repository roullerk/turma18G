create database E_Commerce;
use E_Commerce;

create table tb_produtos(
id bigint auto_increment,
nomeProduto varchar(30) not null,
tipoProduto varchar(20) not null,
valor float not null,
descricao varchar(20) not null,
quantidade int not null,
primary key(id)
);

insert into tb_produtos (nomeProduto, tipoProduto, valor, descricao, quantidade) values ("Tenis", "Calçados", 300, "Tenis bonito", 1);
insert into tb_produtos (nomeProduto, tipoProduto, valor, descricao, quantidade) values ("Tenis de corrida", "Calçados", 450,"Corra com conforto", 10);
insert into tb_produtos (nomeProduto, tipoProduto, valor, descricao, quantidade) values ("Motorola One", "Eletrônicos", 1500,"Dispositivo UltraHD", 20);
insert into tb_produtos (nomeProduto, tipoProduto, valor, descricao, quantidade) values ("Playstation 5", "Eletrônicos", 5000,"Nova geração", 10);
insert into tb_produtos (nomeProduto, tipoProduto, valor, descricao, quantidade) values ("Coca-cola", "Bebidas", 10,"Sinta o sabor", 200);
insert into tb_produtos (nomeProduto, tipoProduto, valor, descricao, quantidade) values ("Agua Bonafont", "Bebidas", 2.50,"Agua Pura", 15);
insert into tb_produtos (nomeProduto, tipoProduto, valor, descricao, quantidade) values ("Trakinas", "Alimento", 2.50,"Cada dia + Trakinas", 30);
insert into tb_produtos (nomeProduto, tipoProduto, valor, descricao, quantidade) values ("Ovo de Páscoa", "Alimento", 60,"Puro Chocolate", 15);


select * from tb_produtos;


select * from tb_produtos where valor >= 500;

select * from tb_produtos where valor < 500;


