package com.example.gerenciadordoceria.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gerenciadordoceria.R;
import com.example.gerenciadordoceria.data.model.Venda;
import com.example.gerenciadordoceria.ui.viewholder.RecyclerViewHolder;

import java.util.List;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private List<Venda> list;

    public RecyclerAdapter(List<Venda> list){
        this.list = list;
    }
    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.text_view_layout, parent, false);

        return  new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.itemName.setText(list.get(position).getProduto().getNomeProduto());
        holder.itemQuant.setText(list.get(position).getQuantidade().toString());
        holder.itemvalor.setText(list.get(position).getValorTotalVenda().toString());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
