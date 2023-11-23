package com.example.gerenciadordoceria.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gerenciadordoceria.R;
import com.example.gerenciadordoceria.data.model.Venda;
import com.example.gerenciadordoceria.ui.viewholder.EstoqueRecyclerViewHolder;

import java.util.List;


public class EstoqueRecyclerAdapter extends RecyclerView.Adapter<EstoqueRecyclerViewHolder> {

    private List<Venda> list;

    public EstoqueRecyclerAdapter(List<Venda> list){
        this.list = list;
    }
    @NonNull
    @Override
    public EstoqueRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.text_view_layout, parent, false);
        return  new EstoqueRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EstoqueRecyclerViewHolder holder, int position) {
        holder.itemName.setText(list.get(position).getProduto().getNomeProduto());
        holder.itemQuant.setText(list.get(position).getQuantidade().toString());
        holder.itemvalor.setText(String.format("%.2f",list.get(position).getValorTotalVenda()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
