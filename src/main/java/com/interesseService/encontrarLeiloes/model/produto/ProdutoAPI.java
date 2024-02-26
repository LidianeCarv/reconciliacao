package com.interesseService.encontrarLeiloes.model.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping(value = "/produtos", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProdutoAPI {
    @Autowired
    private ProdutoFacade produtoFacade;

    @PutMapping("/{produtoId}")
    @ResponseBody
    public ProdutoDTO atualizar(@PathVariable("produtoId") Long produtoId,
                                @RequestBody ProdutoDTO produtoDTO) {
        return produtoFacade.atualizar(produtoDTO, produtoId);
    }

    @GetMapping
    @ResponseBody
    public List<ProdutoDTO> getAll() {
        return produtoFacade.getAll();
    }

    @DeleteMapping("/{produtoId}")
    @ResponseBody
    public String deletar(@PathVariable("produtoId") Long produtoId){
        return produtoFacade.delete(produtoId);
    }
}
