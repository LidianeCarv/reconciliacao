package com.interesseService.encontrarLeiloes.model.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {
    @Autowired
    public ProdutoRepository repository;

    public Long criar(ProdutoDTO produtoDTO){
        Produto produto = produtoDTO.toProduto();
        repository.save(produto);
        return produto.getId();
    }

    public void atualizar (ProdutoDTO produtoDTO){
        if (produtoDTO.getId() == null){
            throw new RuntimeException("Para atualizar é necessário passar o id do produto!");
        }
        this.criar(produtoDTO);
    }

    public List<ProdutoDTO> getAll () {
        return repository
                .findAll()
                .stream()
                .map(ProdutoDTO::new).collect(Collectors.toList());
    }

    public void  excluir (Long produtoId){
        repository.deleteById(produtoId);
        //return null;
    }
}