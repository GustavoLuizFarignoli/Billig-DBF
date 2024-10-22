package orm.billig.database_first_orm.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "`usuario_endereco`")
public class UsuarioEnderco {
    @Id
    @Column(name = "`Id_endereco`", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "`Id_endereco`", nullable = false)
    private Endereco enderecos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_cliente")
    private Usuario idCliente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Endereco getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Endereco enderecos) {
        this.enderecos = enderecos;
    }

    public Usuario getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Usuario idCliente) {
        this.idCliente = idCliente;
    }

}