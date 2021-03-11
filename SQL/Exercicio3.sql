create database Escola;

use Escola;

create table tb_alunos(
matricula bigint auto_increment,
nomeAluno varchar(30) not null,
serie varchar(3) not null,
idade int not null,
endereco varchar(30) not null,
nota float not null,
primary key(matricula)
);

insert into tb_alunos (nomeAluno, serie, idade, endereco, nota) values ("Noah Stevens", "8°A", 14, "Rua Patrulhando", 7.5);
insert into tb_alunos (nomeAluno, serie, idade, endereco, nota) values ("Miguel Falabeladson", "5°B", 10,"Av League of Draven", 8.0);
insert into tb_alunos (nomeAluno, serie, idade, endereco, nota) values ("Laura Martins", "2°M", 15,"Rua Lamina que Não se Vê", 5.0);
insert into tb_alunos (nomeAluno, serie, idade, endereco, nota) values ("Kátia Caxias", "3°M", 17,"Ilha das Sombras", 7.0);
insert into tb_alunos (nomeAluno, serie, idade, endereco, nota) values ("Jean Cloud Van Damme", "8°A", 14,"Demacia", 4.5);
insert into tb_alunos (nomeAluno, serie, idade, endereco, nota) values ("Chuck Norris", "7°C", 12,"Noxus", 10.0);
insert into tb_alunos (nomeAluno, serie, idade, endereco, nota) values ("Dante Devil", "8°D", 14,"Rua Devil May Cry", 3.5);
insert into tb_alunos (nomeAluno, serie, idade, endereco, nota) values ("Jinx Ed Jinx", "4°C", 10,"Rua Prédio ou pessoas", 2.0);

select * from tb_alunos;

select * from tb_alunos where nota >= 7 ;

select * from tb_alunos where nota < 7;


