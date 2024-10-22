package orm.billig.database_first_orm.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "metodos_pagamento")
public class MetodosPagamento {
    @Id
    @Column(name = "id_metodopagamento", nullable = false)
    private Integer id;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "cvv")
    private Integer cvv;

    @Column(name = "nome_titular")
    private String nomeTitular;

    @Column(name = "validade")
    private LocalDate validade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

}