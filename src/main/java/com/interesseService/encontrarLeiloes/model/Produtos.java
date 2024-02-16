package com.interesseService.encontrarLeiloes.model;

import jakarta.persistence.Table;

@Table(name= "tb_produto", schema = "encontrar_leiloes")
public class Produtos {
    private int id_produto;
    private String titulo;
    private String descricao;
    private String link;
    private float preco;
}
