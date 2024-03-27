package contas.model.reconciliacao;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name= "reconciliacao", schema = "reconciliacao")
public class Reconciliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;
    LocalDate data;
    private String notas;

    @ManyToOne
    ExtratoBanco extratoBanco;

    @ManyToOne
    MovimentacaoReserva movimentacaoReserva;

    @ManyToOne
    MovimentacaoFinanceira movimentacaoFinanceira;
}
