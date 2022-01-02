package com.example.projectmob.ui.ellipse;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.projectmob.R;
import com.example.projectmob.databinding.NavCircleFragmentBinding;
import com.example.projectmob.databinding.NavEllipseFragmentBinding;
import com.example.projectmob.ui.circle.NavCircleViewModel;

public class nav_ellipse extends Fragment {

    private NavEllipseViewModel navEllipseViewModel;
    private NavEllipseFragmentBinding binding;
    public static nav_ellipse newInstance() {
        return new nav_ellipse();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        navEllipseViewModel =
                new ViewModelProvider(this).get(NavEllipseViewModel.class);

        binding = NavEllipseFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        final Button button = binding.button;
        final TextView a = binding.atxt;
        final TextView b = binding.btxt;
        final  TextView result = binding.result;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final  String astr=  a.getText().toString();
                final  String bstr=  b.getText().toString();
                result.setText(navEllipseViewModel.calculate(astr,bstr));
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