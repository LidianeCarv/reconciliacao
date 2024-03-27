package contas.model.reconciliacao;
public enum TipoMovimentacaoFinanceira {
    RETIRADA (-1),
    DESPESA (-1),
    RECEBIMENTO (1);

    private int entradaSaida;

    TipoMovimentacaoFinanceira(int entradaSaida) {
        this.entradaSaida = entradaSaida;
    }
    public int getValor(){
        return entradaSaida;
    }


}