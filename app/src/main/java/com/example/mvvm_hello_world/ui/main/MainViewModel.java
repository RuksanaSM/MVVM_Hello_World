package com.example.mvvm_hello_world.ui.main;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends AndroidViewModel {
    private MutableLiveData<String> mutableLiveData=new MutableLiveData<String>();
    public MainViewModel(@NonNull Application application) {
        super(application);
        setMutableLiveData("Hello World!!!");
    }
    // TODO: Implement the ViewModel


    public MutableLiveData<String> getMutableLiveData() {
        return mutableLiveData;
    }

    public void setMutableLiveData(String text) {
        mutableLiveData.setValue(text);
    }


}