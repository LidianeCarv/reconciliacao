package contas.model.reconciliacao;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class ReconciliacaoDTO {
    private Long id;
    LocalDate data;
    private String notas;
    ExtratoBanco extratoBanco;
    MovimentacaoReserva movimentacaoReserva;
    MovimentacaoFinanceira movimentacaoFinanceira;
    public Reconciliacao toReconciliacao(){
        Reconciliacao reconciliacao = new Reconciliacao();
        reconciliacao.setId(this.getId());
        reconciliacao.setData(this.getData());
        reconciliacao.setNotas(this.getNotas());
        reconciliacao.setExtratoBanco(this.getExtratoBanco());
        reconciliacao.setMovimentacaoReserva(this.getMovimentacaoReserva());
        reconciliacao.setMovimentacaoFinanceira(this.getMovimentacaoFinanceira());
        return reconciliacao;
    }
    public ReconciliacaoDTO(Reconciliacao reconciliacao){
        this.id = reconciliacao.getId();
        this.data = reconciliacao.getData();
        this.notas= reconciliacao.getNotas();
        this.extratoBanco = reconciliacao.getExtratoBanco();
        this.movimentacaoReserva = reconciliacao.getMovimentacaoReserva();
        this.movimentacaoFinanceira = reconciliacao.movimentacaoFinanceira;

    }
}
