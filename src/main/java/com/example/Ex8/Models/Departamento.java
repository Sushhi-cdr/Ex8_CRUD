package com.example.Ex8.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_departamento")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nomeDepartamento")
    private String departameto;

    @Column(name = "localizacaoDepartamento")
    private String localizacaoDepartamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartameto() {
        return departameto;
    }

    public void setDepartameto(String departameto) {
        this.departameto = departameto;
    }

    public String getLocalizacaoDepartamento() {
        return localizacaoDepartamento;
    }

    public void setLocalizacaoDepartamento(String localizacaoDepartamento) {
        this.localizacaoDepartamento = localizacaoDepartamento;
    }
}
