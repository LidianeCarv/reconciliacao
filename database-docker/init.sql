CREATE DATABASE postgres;

CREATE TABLE reconciliacao.produto (
	id bigserial NOT NULL,
	titulo varchar(200) NULL,
	descricao varchar(500) NULL,
	link varchar(500) NULL,
	preco float4 NULL,
	CONSTRAINT pk_produto PRIMARY KEY (id)
);