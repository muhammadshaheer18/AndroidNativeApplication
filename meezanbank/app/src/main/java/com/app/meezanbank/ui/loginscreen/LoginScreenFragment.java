package com.app.meezanbank.ui.loginscreen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.ui.NavigationUI;

import com.app.meezanbank.R;
import com.app.meezanbank.databinding.FragmentLoginscreenBinding;

public class LoginScreenFragment extends Fragment {

    private FragmentLoginscreenBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        LoginScreenViewModel loginScreenViewModel =
                new ViewModelProvider(this).get(LoginScreenViewModel.class);

        binding = FragmentLoginscreenBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Hard-coded credentials
        String usernameCheck = "Shaheer";
        String passwordCheck = "123abc";

        binding.loginButton.setOnClickListener(v -> {

            String enteredUsername = binding.username.getText().toString().trim();
            String enteredPassword = binding.password.getText().toString().trim();

            if (enteredUsername.equals(usernameCheck) && enteredPassword.equals(passwordCheck)) {

                Toast.makeText(getContext(), "Login Successful", Toast.LENGTH_SHORT).show();
                NavController navController = Navigation.findNavController(v);
                navController.navigate(R.id.action_navigation_login_to_navigation_home);

            } else {
                Toast.makeText(getContext(), "Invalid Credentials", Toast.LENGTH_SHORT).show();
            }
        });


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
