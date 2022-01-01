package com.example.projectmob.ui.circle;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NavCircleViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NavCircleViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is circle fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}