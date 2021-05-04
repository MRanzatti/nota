package br.com.projetosonner.springbackendmysql.model;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "notaitem")
public class NotaFiscalItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_nota")
    private NotaFiscal nota;

    @ManyToOne
    @JoinColumn(name="id_produto")
    private Produto produto;

    private BigDecimal quantidade;


    @Column(name="valorunitario")
    private BigDecimal valorUnitario;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NotaFiscal getNota() {
        return nota;
    }

    public void setNota(NotaFiscal nota) {
        this.nota = nota;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
