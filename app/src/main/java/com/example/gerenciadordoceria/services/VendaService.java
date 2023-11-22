package com.example.gerenciadordoceria.services;

import com.example.gerenciadordoceria.data.model.Produto;
import com.example.gerenciadordoceria.data.model.Venda;

import java.util.Arrays;
import java.util.List;

public class VendaService {

    public List<Venda> retornaListaVendasTeste(){
        Produto produto1 = new Produto("Chocolate", "Doce", 5.90);
        Produto produto2 = new Produto("Brownie", "Doce", 7.90);
        Produto produto3 = new Produto("Cookie", "Doce", 6.90);
        Venda venda1 = new Venda(produto1, 5);
        Venda venda2 = new Venda(produto2, 12);
        Venda venda3 = new Venda(produto3, 7);
        Venda[] vendas  = { venda1, venda2, venda3};

        return Arrays.asList(vendas);
    }
}
