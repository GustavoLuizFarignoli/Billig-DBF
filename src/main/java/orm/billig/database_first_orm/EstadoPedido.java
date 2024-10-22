package orm.billig.database_first_orm;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estado_pedido")
public class EstadoPedido {
    @Id
    @Column(name = "Id_estado", nullable = false)
    private Integer id;

    @Column(name = "`descrição`")
    private String descrição;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

}