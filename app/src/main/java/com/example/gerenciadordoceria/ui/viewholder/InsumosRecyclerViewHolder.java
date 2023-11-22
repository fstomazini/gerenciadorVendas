package com.example.gerenciadordoceria.ui.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gerenciadordoceria.R;

public class InsumosRecyclerViewHolder extends RecyclerView.ViewHolder {
    public TextView itemName;
    public TextView itemQuant;
    public InsumosRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        this.itemName = itemView.findViewById(R.id.text_estoquue_nome);
        this.itemQuant = itemView.findViewById(R.id.text_estoquue_quantidade);

    }
}
