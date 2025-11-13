package com.app.meezanbank.ui.loginscreen;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LoginScreenViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LoginScreenViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Welcome to Login Screen");
    }

    public LiveData<String> getText() {
        return mText;
    }
}





