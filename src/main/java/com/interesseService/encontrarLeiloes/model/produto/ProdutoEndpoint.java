
package com.interesseService.encontrarLeiloes.model.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produto", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProdutoEndpoint {
    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    @ResponseBody
    public ResponseEntity<Void> criar(@RequestBody ProdutoDTO produtoDTO) {
        if (produtoDTO.getId() != null ){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        produtoService.criar(produtoDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/{produtoId}")
    @ResponseBody
    public void atualizar(@PathVariable("produtoId") Long produtoId,   //PUT
                                @RequestBody ProdutoDTO produtoDTO) {
        produtoDTO.setId(produtoId);
        produtoService.atualizar(produtoDTO);
    }

    @GetMapping
    @ResponseBody
    public List<ProdutoDTO> getAll() {
        return produtoService.getAll();
    }    //GET

    @DeleteMapping("/{produtoId}")
    @ResponseBody
    public void excluir(@PathVariable("produtoId") Long produtoId){
        produtoService.excluir(produtoId);
    }   //DELETE
}
