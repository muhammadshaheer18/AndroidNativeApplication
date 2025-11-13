package com.app.meezanbank.ui.loginscreen;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.app.meezanbank.databinding.FragmentLoginscreenBinding;


public class LoginScreenFragment extends Fragment{

    private FragmentLoginscreenBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState){
        LoginScreenViewModel loginscreenviewmodel = new ViewModelProvider(this).get(LoginScreenViewModel.class);

        binding = FragmentLoginscreenBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
