package com.example.gerenciadordoceria.ui.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gerenciadordoceria.R;

public class ProdutoPageCardRecyclerHolder extends RecyclerView.ViewHolder {
    public TextView itemName;
    public TextView itemEstoque;
    public TextView itemPreco;
    public TextView itemCategoria;
    public ProdutoPageCardRecyclerHolder(@NonNull View itemView) {
        super(itemView);
        this.itemName = itemView.findViewById(R.id.textViewCardProdutoName);
        this.itemEstoque = itemView.findViewById(R.id.textViewCardProdutoEstoque);
        this.itemPreco = itemView.findViewById(R.id.textViewCardProdutoValor);
        this.itemCategoria = itemView.findViewById(R.id.textViewCardProdutoCategoria);
    }
}
