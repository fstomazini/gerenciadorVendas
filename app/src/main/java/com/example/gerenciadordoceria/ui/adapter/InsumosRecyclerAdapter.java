package com.example.gerenciadordoceria.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gerenciadordoceria.R;
import com.example.gerenciadordoceria.data.model.Insumo;
import com.example.gerenciadordoceria.ui.viewholder.InsumosRecyclerViewHolder;

import java.util.List;

public class InsumosRecyclerAdapter extends RecyclerView.Adapter<InsumosRecyclerViewHolder> {
    private List<Insumo> list;

    public InsumosRecyclerAdapter(List<Insumo> listaDeInsumos) {
        this.list = listaDeInsumos;
    }

    @NonNull
    @Override
    public InsumosRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.text_view_layout_insumos, parent, false);

        return  new InsumosRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InsumosRecyclerViewHolder holder, int position) {
        holder.itemName.setText(list.get(position).getName());
        holder.itemQuant.setText(list.get(position).getQuantidade().toString());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
