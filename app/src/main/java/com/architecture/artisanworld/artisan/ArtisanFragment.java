package com.architecture.artisanworld.artisan;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.viewpager.widget.PagerAdapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.architecture.artisanworld.R;
import com.architecture.artisanworld.databinding.FragmentArtisanBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

public class ArtisanFragment extends Fragment {
    private ArtisanViewModel mViewModel;
    FragmentArtisanBinding artisanBinding;
    ArtisanAdapter artisanAdapter;
    TextView maker_name;
    private static FirebaseFirestore firestore;
    private static String TAG;

    public static ArtisanFragment newInstance() {
        return new ArtisanFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_artisan, container, false);

        artisanBinding.recyclerviewArtisan.setLayoutManager(new GridLayoutManager(getActivity(), GridLayoutManager.VERTICAL));
        artisanBinding.recyclerviewArtisan.setAdapter(artisanAdapter);

        // 파이어스토어 모든 collection 가져오기
        firestore.collection("Maker").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                if(task.isSuccessful()){
                    for(QueryDocumentSnapshot document : task.getResult()){
                        Log.d(TAG, document.getId() + " => " + document.getData());
                    }
                } else {
                    Log.d(TAG, "Error getting documents: ", task.getException());
                }
            }
        });

        return view;
    }
}