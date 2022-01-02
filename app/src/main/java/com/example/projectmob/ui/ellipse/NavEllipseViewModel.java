package com.example.projectmob.ui.ellipse;

import static java.lang.Float.parseFloat;

import androidx.lifecycle.ViewModel;

public class NavEllipseViewModel extends ViewModel {
    public String calculate(String x,String y){
        Double xd = Double.valueOf(x);
        Double yd = Double.valueOf(y);
        Double result = xd*yd*3.14;
        return String.valueOf(result);
    }
}