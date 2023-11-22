package com.example.gerenciadordoceria.ui.viewholder;

import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gerenciadordoceria.R;

public class EstoqueRecyclerViewHolder extends RecyclerView.ViewHolder {
    public TextView itemName;
    public TextView itemQuant;
    public TextView itemvalor;

    public TableLayout tableLayout;
    public EstoqueRecyclerViewHolder(@NonNull TextView itemName, TextView itemQuant, TextView itemvalor) {
        super(itemName);
        this.itemName = itemName;
        this.itemQuant = itemQuant;
        this.itemvalor = itemvalor;
    }

    public EstoqueRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        this.itemName = itemView.findViewById(R.id.textTableName);
        this.itemQuant = itemView.findViewById(R.id.textTableQuant);
        this.itemvalor = itemView.findViewById(R.id.textTableValor);
    }
}
