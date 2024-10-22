package orm.billig.database_first_orm.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "produtos")
public class Produto {
    @Id
    @Column(name = "Id_produto", nullable = false)
    private Integer id;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "`Descricao`")
    private String descricao;

    @Column(name = "`Preco`")
    private Float preco;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`idUsuario`")
    private Usuario idUsuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

}