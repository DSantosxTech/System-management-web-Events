package com.eventosweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;

    private String nome;
    private String local;
    private String data;
    private String hora;

    // Método para obter o código do evento
    public Long getCodigo() {
        return codigo;
    }

    // Método para definir o código do evento
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    // Método para obter o nome do evento
    public String getNome() {
        return nome;
    }

    // Método para definir o nome do evento
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para obter o local do evento
    public String getLocal() {
        return local;
    }

    // Método para definir o local do evento
    public void setLocal(String local) {
        this.local = local;
    }

    // Método para obter a data do evento
    public String getData() {
        return data;
    }

    // Método para definir a data do evento
    public void setData(String data) {
        this.data = data;
    }

    // Método para obter a hora do evento
    public String getHora() {
        return hora;
    }

    // Método para definir a hora do evento
    public void setHora(String hora) {
        this.hora = hora;
    }
}
