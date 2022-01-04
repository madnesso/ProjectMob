package com.example.projectmob.ui.triangle;

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
import com.example.projectmob.databinding.NavRectangleBinding;
import com.example.projectmob.databinding.NavTriangleFragmentBinding;
import com.example.projectmob.ui.rectangle.NavRectangleViewModel;

public class nav_triangle extends Fragment {

    private NavTriangleViewModel navTriangleViewModel;
    private NavTriangleFragmentBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        navTriangleViewModel =
                new ViewModelProvider(this).get(NavTriangleViewModel.class);

        binding = NavTriangleFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final Button button = binding.button;
        final TextView a = binding.basetxt;
        final TextView b = binding.heighttxt;
        final TextView result = binding.result;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String astr = a.getText().toString();
                final String bstr = b.getText().toString();
                result.setText(navTriangleViewModel.calculate(astr, bstr));
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