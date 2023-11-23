package com.example.gerenciadordoceria.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gerenciadordoceria.R;
import com.example.gerenciadordoceria.data.model.ProdutoQuant;
import com.example.gerenciadordoceria.ui.viewholder.EstoqueRecyclerViewHolder;
import com.example.gerenciadordoceria.ui.viewholder.ProdutoPageCardRecyclerHolder;

import java.util.List;

public class ProdutoPageCardAdapter extends RecyclerView.Adapter<ProdutoPageCardRecyclerHolder> {
    private List<ProdutoQuant> list;

    public ProdutoPageCardAdapter(List<ProdutoQuant> list){
        this.list = list;
    }
    @NonNull
    @Override
    public ProdutoPageCardRecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_card_produto, parent, false);
        return  new ProdutoPageCardRecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProdutoPageCardRecyclerHolder holder, int position) {
        holder.itemName.setText(list.get(position).getNomeProduto());
        holder.itemEstoque.setText("" + list.get(position).getQuantidade().toString() + " em estoque");
        holder.itemPreco.setText("R$: "+ String.format("%.2f",list.get(position).getPrecoProduto()));
        holder.itemCategoria.setText(list.get(position).getTipoProduto());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
