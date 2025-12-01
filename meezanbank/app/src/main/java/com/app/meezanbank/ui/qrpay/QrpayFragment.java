package com.app.meezanbank.ui.qrpay;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.app.meezanbank.databinding.FragmentQrpayBinding;

public class QrpayFragment extends Fragment {

    private FragmentQrpayBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        QrpayViewModel profileViewModel =
                new ViewModelProvider(this).get(QrpayViewModel.class);

        binding = FragmentQrpayBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}