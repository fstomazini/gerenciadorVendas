package com.example.gerenciadordoceria.ui.registry.registry;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import com.example.gerenciadordoceria.R;
import com.example.gerenciadordoceria.databinding.FragmentHomeBinding;
import com.example.gerenciadordoceria.databinding.FragmentRegistryBinding;
import com.example.gerenciadordoceria.ui.login.LoginFragment;

public class RegistryFragment extends Fragment {

    private FragmentRegistryBinding binding;

    private RegistryViewModel registryViewModel;



    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        final Button cadastrarButton = binding.cadastrarButton;
        cadastrarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(RegistryFragment.this)
                        .navigate(R.id.loginFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}