package com.example.gerenciadordoceria.ui.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gerenciadordoceria.R;

public class ProdutosPageRecyclerHolder extends RecyclerView.ViewHolder {
    public TextView categoryName;
    public ProdutosPageRecyclerHolder(@NonNull View itemView) {
        super(itemView);
        this.categoryName = itemView.findViewById(R.id.viewTextCategoriaProduto);

    }
}
