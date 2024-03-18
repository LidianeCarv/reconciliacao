package contas.model.produto;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "produto", schema = "reconciliacao")
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
