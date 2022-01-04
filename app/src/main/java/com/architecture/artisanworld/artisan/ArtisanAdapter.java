package com.architecture.artisanworld.artisan;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.architecture.artisanworld.R;
import com.architecture.artisanworld.databinding.FragmentArtisanBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ArtisanAdapter extends RecyclerView.Adapter<ArtisanAdapter.ArtisanViewHolder> {
    private ArrayList<String> maker_list = null;

    public static class ArtisanViewHolder extends RecyclerView.ViewHolder{
        TextView textView;

        ArtisanViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.maker_name);
        }
    }

    ArtisanAdapter(ArrayList<String> list){
        maker_list = list;
    }

    @NonNull
    @Override
    public ArtisanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.item_maker, parent, false);
        ArtisanAdapter.ArtisanViewHolder vh = new ArtisanAdapter.ArtisanViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ArtisanViewHolder holder, int position) {
        String name = maker_list.get(position);
        holder.textView.setText(name);
    }

    @Override
    public int getItemCount() {
        return maker_list.size();
    }


}
