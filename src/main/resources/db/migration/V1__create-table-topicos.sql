create table topico(
id bigint not null auto_increment,
titulo varchar(100) not null,
mensagem varchar(500) not null,
data date not null,
status tinyint not null,
autor varchar(50) not null,
curso varchar(100) not null,

primary key(id),
unique (titulo, mensagem)
);
