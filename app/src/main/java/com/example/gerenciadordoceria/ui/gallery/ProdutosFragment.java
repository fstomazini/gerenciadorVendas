package com.example.gerenciadordoceria.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gerenciadordoceria.R;
import com.example.gerenciadordoceria.data.model.ProdutoQuant;
import com.example.gerenciadordoceria.databinding.FragmentProdutosBinding;
import com.example.gerenciadordoceria.services.ProdutosService;
import com.example.gerenciadordoceria.ui.adapter.ProdutoPageCardAdapter;
import com.example.gerenciadordoceria.ui.adapter.ProdutosRecyclerPageAdapter;


import java.util.Arrays;
import java.util.List;

public class ProdutosFragment extends Fragment {

    private FragmentProdutosBinding binding;

    private final String[] list = {"Cakes", "Cupcakes", "Cookies", "Barras", "trufas"};

    private ProdutosRecyclerPageAdapter arrayAdapter;

    private RecyclerView.LayoutManager layoutManager;

    private RecyclerView recyclerView;

    private ProdutoPageCardAdapter cardAdapter;

    private RecyclerView.LayoutManager cardManager;

    private RecyclerView cardRecyclerView;

    private List<ProdutoQuant> listaDeProdutos;

    private ProdutosService produtosService  = new ProdutosService();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        produtosViewModel produtosViewModel =
                new ViewModelProvider(this).get(produtosViewModel.class);

        binding = FragmentProdutosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        recyclerView = root.findViewById(R.id.opcoes_categoria);
        layoutManager = new LinearLayoutManager(container.getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        arrayAdapter = new ProdutosRecyclerPageAdapter(Arrays.asList(list));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(arrayAdapter);

        cardRecyclerView = root.findViewById(R.id.card_produto);
        cardManager = new LinearLayoutManager(container.getContext(), LinearLayoutManager.VERTICAL, false);
        cardRecyclerView.setLayoutManager(cardManager);
        listaDeProdutos = produtosService.getProdutoTestContent();
        cardAdapter = new ProdutoPageCardAdapter(listaDeProdutos);
        cardRecyclerView.setHasFixedSize(true);
        cardRecyclerView.setAdapter(cardAdapter);


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}