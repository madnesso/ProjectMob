package com.example.projectmob.ui.rectangle;

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

import com.example.projectmob.databinding.NavRectangleBinding;

public class nav_rectangle extends Fragment {

    private NavRectangleViewModel navRectangleViewModel;
    private NavRectangleBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        navRectangleViewModel =
                new ViewModelProvider(this).get(NavRectangleViewModel.class);

        binding = NavRectangleBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final Button button = binding.button;
        final TextView a = binding.langrtxt;
        final TextView b = binding.longtxt;
        final TextView result = binding.result;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String astr = a.getText().toString();
                final String bstr = b.getText().toString();
                result.setText(navRectangleViewModel.calculate(astr, bstr));
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