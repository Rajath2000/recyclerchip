package com.example.recyclerchip;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.chip.Chip;

public class myadapter extends RecyclerView.Adapter<myadapter.holder>
{

    String data[];

    public myadapter(String[] data)
    {
        this.data = data;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.single_chip,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
       holder.chip.setText(data[position]);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }


    class holder extends RecyclerView.ViewHolder {
        Chip chip;
        public holder(@NonNull View itemView) {
            super(itemView);
            chip=(Chip)itemView.findViewById(R.id.chip4);
        }
    }
}
