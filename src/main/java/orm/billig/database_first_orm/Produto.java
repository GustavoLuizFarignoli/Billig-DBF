package orm.billig.database_first_orm;

import jakarta.persistence.*;

@Entity
@Table(name = "produtos")
public class Produto {
    @Id
    @Column(name = "Id_produto", nullable = false)
    private Integer id;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "`Descrição`")
    private String descrição;

    @Column(name = "`Preço`")
    private Float preço;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`idUsuário`")
    private Usuario idUsuário;

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

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public Float getPreço() {
        return preço;
    }

    public void setPreço(Float preço) {
        this.preço = preço;
    }

    public Usuario getIdUsuário() {
        return idUsuário;
    }

    public void setIdUsuário(Usuario idUsuário) {
        this.idUsuário = idUsuário;
    }

}