package com.example.gerenciadordoceria.data.model;

public class Produto {
    private String nomeProduto;
    private String tipoProduto;
    private Double precoProduto;

    public Produto(String nomeProduto, String tipoProduto, Double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.tipoProduto = tipoProduto;
        this.precoProduto = precoProduto;
    }

    public Produto() {
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }


    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
}
