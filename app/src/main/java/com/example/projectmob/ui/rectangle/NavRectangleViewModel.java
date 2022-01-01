package com.example.projectmob.ui.rectangle;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NavRectangleViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NavRectangleViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is rectangle fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}