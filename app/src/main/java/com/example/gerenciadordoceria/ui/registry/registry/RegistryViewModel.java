package com.example.gerenciadordoceria.ui.registry.registry;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RegistryViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public RegistryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home registry fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}