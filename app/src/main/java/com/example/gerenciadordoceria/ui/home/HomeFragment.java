package com.example.gerenciadordoceria.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gerenciadordoceria.R;
import com.example.gerenciadordoceria.data.model.Insumo;
import com.example.gerenciadordoceria.data.model.Venda;
import com.example.gerenciadordoceria.databinding.FragmentHomeBinding;
import com.example.gerenciadordoceria.services.InsumoService;
import com.example.gerenciadordoceria.services.VendaService;
import com.example.gerenciadordoceria.ui.adapter.EstoqueRecyclerAdapter;
import com.example.gerenciadordoceria.ui.adapter.InsumosRecyclerAdapter;

import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    private AutoCompleteTextView autoCompleteTextView;

    private ArrayAdapter<String> adapterItems;

    private String[] item = {"Dia" , "Semana", "Mês"};


    private RecyclerView.LayoutManager layoutManager;

    private RecyclerView recyclerView;

    private List<Venda> listaDeProdutos;

    private EstoqueRecyclerAdapter adapter;

    private VendaService vendaService;

    private InsumoService insumoService;

    private InsumosRecyclerAdapter insumosRecyclerAdapter;

    private RecyclerView.LayoutManager insumoLayoutManager;

    private RecyclerView insumoRecyclerView;

    private List<Insumo> listaDeInsumos;

    private InsumosRecyclerAdapter insumoAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        vendaService = new VendaService();
        insumoService = new InsumoService();
        binding = FragmentHomeBinding.inflate(inflater, container, false);

        View root = binding.getRoot();
        autoCompleteTextView = root.findViewById(R.id.auto_complete_text);
        adapterItems = new ArrayAdapter<String>(container.getContext(), R.layout.list_items_home , item );
        autoCompleteTextView.setAdapter(adapterItems);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(container.getContext(), "Filtro Selecionado :" + item, Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView = root.findViewById(R.id.list_vendas);
        layoutManager = new LinearLayoutManager(container.getContext());
        recyclerView.setLayoutManager(layoutManager);
        listaDeProdutos = vendaService.retornaListaVendasTeste();
        adapter = new EstoqueRecyclerAdapter(listaDeProdutos);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

        insumoRecyclerView = root.findViewById(R.id.List_baixo_insumos);
        insumoLayoutManager = new LinearLayoutManager(container.getContext());
        insumoRecyclerView.setLayoutManager(insumoLayoutManager);
        listaDeInsumos = insumoService.getTestDataInsumo();
        insumoAdapter = new InsumosRecyclerAdapter(listaDeInsumos);
        insumoRecyclerView.setHasFixedSize(true);
        insumoRecyclerView.setAdapter(insumoAdapter);



        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}