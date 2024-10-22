package orm.billig.database_first_orm;

import jakarta.persistence.*;

@Entity
@Table(name = "`usuario_endereço`")
public class UsuarioEndereço {
    @Id
    @Column(name = "`Id_endereço`", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "`Id_endereço`", nullable = false)
    private Endereço endereços;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_cliente")
    private Usuario idCliente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Endereço getEndereços() {
        return endereços;
    }

    public void setEndereços(Endereço endereços) {
        this.endereços = endereços;
    }

    public Usuario getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Usuario idCliente) {
        this.idCliente = idCliente;
    }

}