package contas.model.reconciliacao;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name= "movimentacao_financeira", schema = "reconciliacao")
public class MovimentacaoFinanceira {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    public int id;
    TipoMovimentacaoFinanceira tipo;
    public float valor;
    LocalDate data;
    public String descricao;

    public MovimentacaoFinanceira(int id, TipoMovimentacaoFinanceira tipo, float valor, LocalDate data, String descricao) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }
}
