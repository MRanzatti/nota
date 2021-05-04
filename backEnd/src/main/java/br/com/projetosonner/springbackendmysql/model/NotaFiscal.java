package br.com.projetosonner.springbackendmysql.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "nota")
public class NotaFiscal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date data;

    @Column(nullable = false)
    private String descricao;

    @ManyToOne
    @JoinColumn (name = "id_cliente")
    private Cliente cliente ;

    @OneToMany(mappedBy = "nota", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<NotaFiscalItem> itens;




    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<NotaFiscalItem> getItens() {
        return itens;
    }

    public void setItens(List<NotaFiscalItem> itens) {
        this.itens = itens;
    }
}
