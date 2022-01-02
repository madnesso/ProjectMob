package com.example.projectmob.ui.circle;

import static java.lang.Float.parseFloat;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NavCircleViewModel extends ViewModel {
    public String calculate(String x){
        return Double.toString((Math.pow(parseFloat(x), 2) * 3.14));
    }
}