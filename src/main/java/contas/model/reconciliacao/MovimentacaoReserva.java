package contas.model.reconciliacao;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name= "movimentacao_reserva", schema = "reconciliacao")
public class MovimentacaoReserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    public int id;
    public String tipo;
    public String origem;
    public String codigoConfirmacao;
    LocalDate dataInicio;
    public int noites;
    public int hospedes;
    public String anuncio;
    public float valor;
    public float taxaServico;
    public float taxaLimpeza;
    public float ganhosBrutos;

    public MovimentacaoReserva(int id, String tipo, String origem, String codigoConfirmacao, LocalDate dataInicio, int noites, int hospedes, String anuncio, float valor, float taxaServico, float taxaLimpeza, float ganhosBrutos) {
        this.id = id;
        this.tipo = tipo;
        this.origem = origem;
        this.codigoConfirmacao = codigoConfirmacao;
        this.dataInicio = dataInicio;
        this.noites = noites;
        this.hospedes = hospedes;
        this.anuncio = anuncio;
        this.valor = valor;
        this.taxaServico = taxaServico;
        this.taxaLimpeza = taxaLimpeza;
        this.ganhosBrutos = ganhosBrutos;
    }
}
