package com.example.projectmob.ui.rectangle;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NavRectangleViewModel extends ViewModel {

    public String calculate(String x,String y){
        Double xd = Double.valueOf(x);
        Double yd = Double.valueOf(y);
        Double result = xd*yd;
        return String.valueOf(result);
    }
}