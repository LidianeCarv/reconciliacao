package com.interesseService.encontrarLeiloes;

import jakarta.persistence.Table;

//@Table(name = "tb_produto", schema = "leiloes_spring")
public class Produto {
    private int id_produto;
    private String titulo;
    private String descricao;
    private String link;
    private float preco;
}
