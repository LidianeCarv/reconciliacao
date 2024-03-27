package contas.model.reconciliacao;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

@Data
@Entity
@Table(name = "extrato_banco", schema = "reconciliacao")
public class ExtratoBanco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    public int id;
    LocalDate dataLancamento;
    public String historico;
    public String descricao;
    public float valor;
    public float saldo;

    public ExtratoBanco(int id, LocalDate dataLancamento, String historico, String descricao, float valor, float saldo) {
        this.id = id;
        this.dataLancamento = dataLancamento;
        this.historico = historico;
        this.descricao = descricao;
        this.valor = valor;
        this.saldo = saldo;
    }

}
