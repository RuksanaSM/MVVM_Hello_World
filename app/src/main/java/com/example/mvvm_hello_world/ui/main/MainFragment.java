package com.example.mvvm_hello_world.ui.main;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvvm_hello_world.R;
import com.example.mvvm_hello_world.databinding.FragmentMainBinding;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;
    private FragmentMainBinding binding;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_main, container, false);
//        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_main,container,false);
        binding=FragmentMainBinding.inflate(inflater,container,false);
        binding.setLifecycleOwner(this);
        return  binding.getRoot();

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        // TODO: Use the ViewModel

        binding.setViewModel(mViewModel);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding=null;
    }
}