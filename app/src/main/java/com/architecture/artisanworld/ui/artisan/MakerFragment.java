package com.architecture.artisanworld.ui.artisan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.architecture.artisanworld.R;

public class MakerFragment extends Fragment {

    private ArtisanMakerViewModel makerViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        makerViewModel = new ViewModelProvider(this).get(ArtisanMakerViewModel.class);
        View root = inflater.inflate(R.layout.fragment_maker, container, false);

        return root;
    }
}