package orm.billig.database_first_orm.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario_metodopagamento")
public class UsuarioMetodopagamento {
    @Id
    @Column(name = "id_metodopagamento", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_metodopagamento", nullable = false)
    private MetodosPagamento metodosPagamento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_cliente")
    private Usuario idCliente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MetodosPagamento getMetodosPagamento() {
        return metodosPagamento;
    }

    public void setMetodosPagamento(MetodosPagamento metodosPagamento) {
        this.metodosPagamento = metodosPagamento;
    }

    public Usuario getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Usuario idCliente) {
        this.idCliente = idCliente;
    }

}