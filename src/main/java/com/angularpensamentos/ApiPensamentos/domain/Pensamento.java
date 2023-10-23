package com.angularpensamentos.ApiPensamentos.domain;


import jakarta.persistence.*;

@Entity
@Table(name = "Pensamento")
public class Pensamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String conteudo;
    private String autoria;

    private String modelo;

    public Pensamento(DadosCadastroPensamento dados) {
        this.conteudo = dados.conteudo();
        this.autoria = dados.autoria();
        this.modelo = dados.modelo();
    }
    public Pensamento(){}

    public String getConteudo() {
        return conteudo;
    }

    public void setPensamento(String pensamento) {
        this.conteudo = pensamento;
    }

    public String getAutoria() {
        return autoria;
    }

    public void setAutoria(String autoria) {
        this.autoria = autoria;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
