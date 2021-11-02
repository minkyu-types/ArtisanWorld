package com.architecture.artisanworld.ui.maker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.architecture.artisanworld.R;

public class MakerFragment extends Fragment {

    private MakerViewModel makerViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        makerViewModel =
                new ViewModelProvider(this).get(MakerViewModel.class);
        View root = inflater.inflate(R.layout.fragment_maker, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        makerViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}