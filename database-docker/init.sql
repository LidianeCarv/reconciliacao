CREATE DATABASE postgres;

CREATE TABLE reconciliacao.extrato_banco (
	id bigserial NOT NULL,
	datalancamento date NULL,
	historico varchar(200) NULL,
	descricao varchar(200) NULL,
	valor float4 NULL,
	saldo float4 NULL,
	data_lancamento date NULL,
	CONSTRAINT extrato_banco_pk PRIMARY KEY (id)
);

CREATE TABLE reconciliacao.movimentacao_reserva (
	id bigserial NOT NULL,
	tipo varchar(200) NULL,
	origem varchar(200) NULL,
	codigo_confirmacao varchar(200) NULL,
	data_inicio date NULL,
	anuncio varchar(200) NULL,
	valor float4 NULL,
	taxa_servico float4 NULL,
	taxa_limpeza float4 NULL,
	ganhos_brutos float4 NULL,
	noites int4 NULL,
	hospedes int4 NULL,
	CONSTRAINT movimentacao_reserva_pk PRIMARY KEY (id)
);

CREATE TABLE reconciliacao.movimentacao_financeira (
	id bigserial NOT NULL,
	valor float4 NULL,
	"data" date NULL,
	descricao varchar(200) NULL,
	CONSTRAINT movimentacao_financeira_pk PRIMARY KEY (id)
);

CREATE TABLE reconciliacao.reconciliacao (
	id bigserial NOT NULL,
	notas varchar(500) NULL,
	"data" date NULL,
	CONSTRAINT pk_reconciliacao PRIMARY KEY (id),
	CONSTRAINT reconciliacao_extrato_banco_fk FOREIGN KEY (id) REFERENCES reconciliacao.extrato_banco(id),
	CONSTRAINT reconciliacao_movimentacao_financeira_fk FOREIGN KEY (id) REFERENCES reconciliacao.movimentacao_financeira(id),
	CONSTRAINT reconciliacao_movimentacao_reserva_fk FOREIGN KEY (id) REFERENCES reconciliacao.movimentacao_reserva(id)
);





