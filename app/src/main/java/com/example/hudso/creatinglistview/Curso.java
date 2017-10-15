package com.example.hudso.creatinglistview;

public class Curso {

    private String nome;
    private String descricao;
    private EstadoAtual estado;

    public Curso(String nome, String descricao, EstadoAtual estado) {
        this.nome = nome;
        this.descricao = descricao;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Curso: " + nome +
                "\nDescrição: " + descricao +
                "\nEstado: " + estado;
    }
}
