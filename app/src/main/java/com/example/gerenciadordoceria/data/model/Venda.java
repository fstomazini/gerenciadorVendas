package com.example.gerenciadordoceria.data.model;

public class Venda {
    private Produto Produto;
    private Double valorTotalVenda;

    private Integer quantidade;

    public Venda(Produto Produto, Integer quantidade) {
        this.Produto = Produto;
        this.quantidade = quantidade;
        this.valorTotalVenda = Produto.getPrecoProduto() * quantidade;
    }

    public Venda() {

    }

    public com.example.gerenciadordoceria.data.model.Produto getProduto() {
        return Produto;
    }

    public void setProduto(com.example.gerenciadordoceria.data.model.Produto produto) {
        Produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorTotalVenda(){
        return valorTotalVenda;
    }
}
