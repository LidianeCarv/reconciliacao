package com.interesseService.encontrarLeiloes.model.produto;

import jakarta.persistence.*;

@Entity
@Table(name= "tb_produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;
    private String titulo;
    private String descricao;
    private String link;
    private Float preco;
}
