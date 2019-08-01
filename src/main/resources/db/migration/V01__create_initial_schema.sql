CREATE TABLE ano_fiscal(
codigo SERIAL NOT NULL,
nome BIGINT NOT NULL,
PRIMARY KEY(codigo)
);

CREATE table mes_contabilistico(
id_mes SERIAL NOT NULL,
codigo VARCHAR(10) NOT NULL,
nome VARCHAR(20) NOT NULL,
PRIMARY KEY(id_mes)
);


CREATE TABLE documento(
codigo SERIAL NOT NULL,
nome VARCHAR(50) NOT NULL,
PRIMARY KEY(codigo)
);

CREATE TABLE diario(
codigo SERIAL NOT NULL,
designacao VARCHAR(30) NOT NULL,
codigo_ano INTEGER NOT NULL,
numero_proximo VARCHAR(50),
codigo_documento INTEGER,
credito_movimentado NUMERIC(19, 2),
debito_movimentado NUMERIC(19, 2),
PRIMARY KEY(codigo),
CONSTRAINT fk_diario_ano
  FOREIGN KEY(codigo_ano) REFERENCES ano_fiscal(codigo),
CONSTRAINT fk_diario_documento
  FOREIGN KEY(codigo_documento) REFERENCES documento(codigo)
);

CREATE TABLE plano_conta(
id_plano SERIAL NOT NULL,
codigo VARCHAR(30) NOT NULL,
descricao VARCHAR(50) NOT NULL,
tipo_movimento VARCHAR(50) NOT NULL,
codigo_ano INTEGER NOT NULL,
observacao TEXT,
PRIMARY KEY(id_plano),
CONSTRAINT fk_plano_ano
  FOREIGN KEY(codigo_ano) REFERENCES ano_fiscal(codigo)
);




