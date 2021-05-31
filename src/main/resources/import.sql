INSERT INTO tb_cliente (nome,telefone) VALUES ('Bob','75981071197');

INSERT INTO tb_ordem_servico (descricao,preco,data_abertura,data_finalizacao,status_ordem_servico,cliente_id) VALUES ('Lavagem de carro',20.00,TIMESTAMP WITH TIME ZONE '2020-07-21T14:00:00Z',TIMESTAMP WITH TIME ZONE '2020-07-21T15:00:00Z',1,1);


INSERT INTO tb_comentario(descricao,ordem_servico_id) VALUES ('Trabalho muito bom !!',1);
 

