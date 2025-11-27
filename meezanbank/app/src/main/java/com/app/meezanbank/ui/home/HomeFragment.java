package com.app.meezanbank.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.app.meezanbank.R;
import com.app.meezanbank.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Setup custom app bar
        setupAppBar();

        return root;
    }

    private void setupAppBar() {
        // Get references to the buttons from the included custom app bar
        View appBarView = binding.getRoot().findViewById(R.id.customAppBar);
        ImageButton btnNavigationDrawer = appBarView.findViewById(R.id.btnNavigationDrawer);
        ImageButton btnPower = appBarView.findViewById(R.id.btnPower);

        // Navigation Drawer Button Click Listener
        btnNavigationDrawer.setOnClickListener(v -> {
            Toast.makeText(requireContext(), "Navigation Drawer clicked", Toast.LENGTH_SHORT).show();
        });

        // Power Button Click Listener
        btnPower.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(v);
            navController.navigate(R.id.action_navigation_home_to_navigation_login);
            Toast.makeText(requireContext(), "Logging Out", Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}