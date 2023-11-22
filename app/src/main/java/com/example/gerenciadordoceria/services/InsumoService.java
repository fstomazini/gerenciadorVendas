package com.example.gerenciadordoceria.services;
//Servico temporario apenas para efeitos de teste

import com.example.gerenciadordoceria.data.model.Insumo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class InsumoService {
    public InsumoService() {
    }

    public List<Insumo> getTestDataInsumo(){
        Insumo insumo1 = new Insumo("Açucar", 3);
        Insumo insumo2 = new Insumo("Farinha", 2);
        Insumo insumo3 = new Insumo("granulado", 1);
        Insumo[] lista = {insumo1, insumo2, insumo3} ;
        return Arrays.asList(lista);
    }
}
