package com.example.projectmob.ui.circle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.projectmob.databinding.NavCircleFragmentBinding;

public class nav_circle extends Fragment {

    private NavCircleViewModel navCircleViewModel;
    private NavCircleFragmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        navCircleViewModel =
                new ViewModelProvider(this).get(NavCircleViewModel.class);

        binding = NavCircleFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        final Button button = binding.button;
        final TextView radius = binding.radiustxt;
        final  TextView result = binding.result;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final  String radiustr=  radius.getText().toString();
                String hllo = radiustr;
                result.setText(navCircleViewModel.calculate(radiustr));
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