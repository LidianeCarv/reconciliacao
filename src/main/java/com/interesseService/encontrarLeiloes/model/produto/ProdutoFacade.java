package com.interesseService.encontrarLeiloes.model.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoFacade {
    @Autowired
    public ProdutoRepository repository;
    public ProdutoDTO criar(ProdutoDTO produtoDTO){
        Produto produto = new Produto();
       //roduto.setDescricao(produtoDTO.getDescricao());
       //roduto.setTítulo(produtoDTO.getTitulo());

       //rodutoDTO.setId(produto.getId());
        return produtoDTO;
    }
    public ProdutoDTO atualizar (ProdutoDTO produtoDTO, Long produtoId){
        Produto produtoDatabase = repository.getOne(produtoId);
       //rodutoDatabase.setTitulo(produtoDTO.getTitulo());
       //rodutoDatabase.setDescricao(produtoDTO.getTitulo());
        return produtoDTO;
    }
    public ProdutoDTO converter (Produto produto){
        ProdutoDTO result = new ProdutoDTO();
      //result.setIdProduto(produto.getIdProduto());
      //result.setDescricao(produto.getDescricao());
        return result;
    }
    public List<ProdutoDTO> getAll () {
        return repository
                .findAll()
                .stream()
                .map(this::converter).collect(Collectors.toList());
    }
    public String delete (Long produtoId){
        repository.deleteById(produtoId);
        return "DELETED";
    }
}