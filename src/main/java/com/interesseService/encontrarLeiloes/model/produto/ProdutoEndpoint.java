
package com.interesseService.encontrarLeiloes.model.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

        import java.awt.*;
        import java.util.List;

@RestController
@RequestMapping(value = "/produto", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProdutoEndpoint {
    @Autowired
    private ProdutoFacade produtoFacade;

    @PostMapping
    @ResponseBody
    public void criar(@RequestBody ProdutoDTO produtoDTO) {
        produtoFacade.criar(produtoDTO);
    }
    @PutMapping("/{produtoId}")
    @ResponseBody
    public void atualizar(@PathVariable("produtoId") Long produtoId,   //PUT
                                @RequestBody ProdutoDTO produtoDTO) {
        produtoDTO.setId(produtoId);
        produtoFacade.atualizar(produtoDTO);
    }

    @GetMapping
    @ResponseBody
    public List<ProdutoDTO> getAll() {
        return produtoFacade.getAll();
    }    //GET

    @DeleteMapping("/{produtoId}")
    @ResponseBody
    public void excluir(@PathVariable("produtoId") Long produtoId){
        produtoFacade.excluir(produtoId);
    }   //DELETE
}
