package com.example.gerenciadordoceria.services;

import com.example.gerenciadordoceria.data.model.Produto;
import com.example.gerenciadordoceria.data.model.ProdutoQuant;

import java.util.Arrays;
import java.util.List;

public class ProdutosService {
    private Produto produto;
    private ProdutoQuant produtoQuant;

    public List<ProdutoQuant> getProdutoTestContent(){
        ProdutoQuant produto1 = new ProdutoQuant("Cookie de Nutella","cookie" , 8.00 , 10 );
        ProdutoQuant produto2 = new ProdutoQuant("Bolo de Chocolate","Bolo" , 25.00 , 23 );
        ProdutoQuant produto3 = new ProdutoQuant("Brownie de Esticadinho","Brownie" , 12.00 , 53 );
        ProdutoQuant[] produtos = {produto1, produto2, produto3};
        return Arrays.asList(produtos);
    }
}
