package com.example.gerenciadordoceria.data.model;

public class Insumo {
    private String name;
    private Integer quantidade;

    public Insumo(String name, Integer quantidade) {
        this.name = name;
        this.quantidade = quantidade;
    }
    public Insumo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
