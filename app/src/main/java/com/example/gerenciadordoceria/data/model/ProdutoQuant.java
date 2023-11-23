package com.example.gerenciadordoceria.data.model;

public class ProdutoQuant extends Produto{
    private Integer quantidade;

    public ProdutoQuant(String nomeProduto, String tipoProduto, Double precoProduto, Integer quantidade) {
        super(nomeProduto, tipoProduto, precoProduto);
        this.quantidade = quantidade;
    }

    public ProdutoQuant() {

    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
