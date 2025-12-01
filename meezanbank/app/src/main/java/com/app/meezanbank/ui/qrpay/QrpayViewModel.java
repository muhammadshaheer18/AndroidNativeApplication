package com.app.meezanbank.ui.qrpay;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class QrpayViewModel extends ViewModel {

    private static MutableLiveData<String> mText;

    public QrpayViewModel() {
        mText = new MutableLiveData<>();
    }

    public static LiveData<String> getText() {
        return mText;
    }
}