package com.example.gerenciadordoceria.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gerenciadordoceria.R;
import com.example.gerenciadordoceria.ui.viewholder.InsumosRecyclerViewHolder;
import com.example.gerenciadordoceria.ui.viewholder.ProdutosPageRecyclerHolder;

import java.util.List;

public class ProdutosRecyclerPageAdapter extends RecyclerView.Adapter<ProdutosPageRecyclerHolder> {
    private List<String> listaDeBotoes;
    public ProdutosRecyclerPageAdapter(List<String> listaDeBotoes){
       this.listaDeBotoes = listaDeBotoes;
    }
    @NonNull
    @Override
    public ProdutosPageRecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_categorias_produtos, parent, false);

        return  new ProdutosPageRecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProdutosPageRecyclerHolder holder, int position) {
        holder.categoryName.setText(listaDeBotoes.get(position));
    }

    @Override
    public int getItemCount() {
        return listaDeBotoes.size();
    }
}
