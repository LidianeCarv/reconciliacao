package contas.model.produto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProdutoDTO {
    private Long id;
    private String titulo;
    private String descricao;
    private String link;
    private Float preco;
    public Produto toProduto(){
        Produto produto = new Produto();
        produto.setDescricao(this.getDescricao());
        produto.setTitulo(this.getTitulo());
        produto.setId(this.getId());
        produto.setLink(this.getLink());
        produto.setPreco(this.getPreco());
        return produto;
    }
    public ProdutoDTO (Produto produto){
        this.id = produto.getId();
        this.titulo = produto.getTitulo();
        this.descricao = produto.getDescricao();
        this.link = produto.getLink();
        this.preco = produto.getPreco();

    }
}
