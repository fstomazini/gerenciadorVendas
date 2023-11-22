package com.example.gerenciadordoceria.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.gerenciadordoceria.R;
import com.example.gerenciadordoceria.databinding.ActivityMainBinding;
import com.example.gerenciadordoceria.databinding.FragmentGalleryBinding;
import com.example.gerenciadordoceria.databinding.FragmentHomeBinding;
import com.example.gerenciadordoceria.ui.gallery.GalleryViewModel;
import com.google.android.material.textfield.TextInputLayout;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    AutoCompleteTextView autoCompleteTextView;

    ArrayAdapter<String> adapterItems;

    String[] item = {"Dia" , "Semana", "Mês"};


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

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
        final TextInputLayout textView = binding.selectedOption;
        //homeViewModel.getText().observe(getViewLifecycleOwner(), textView::sett);

        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}