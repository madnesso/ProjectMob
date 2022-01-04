package com.example.projectmob.ui.triangle;

import androidx.lifecycle.ViewModel;

public class NavTriangleViewModel extends ViewModel {
    public String calculate(String x,String y){
        Double xd = Double.valueOf(x);
        Double yd = Double.valueOf(y);
        Double result = xd*yd*0.5;
        return String.valueOf(result);
    }
}