package com.example.recyclerchip;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.chip.Chip;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
public class myadapter extends RecyclerView.Adapter<myadapter.holder>
{
  
    ArrayList<String> favratious=new ArrayList<>();
    public ArrayList<String> Userselected=new ArrayList<>();


    public myadapter(ArrayList<String> favratious) {
        this.favratious = favratious;
    }

    public ArrayList<String> UserSelectedDetails()
    {
        return Userselected;
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
       holder.chip.setText(favratious.get(position));
       Userselected.add("");

       holder.chip.setOnClickListener(new View.OnClickListener() {
           private static final String TAG = "adapter";

           @Override
           public void onClick(View v) {
               if(holder.chip.isChecked())
               {
                   Log.d(TAG, "onClick: checked");
                   Userselected.set(position,favratious.get(position));

               }
               else
               {
                   Userselected.set(position,"");
                   Log.d(TAG, "onClick: not checked");

               }

               for(String arrayList:Userselected)
               {
                   Log.d(TAG, "onClick: "+arrayList);
               }
           }
       });


    }

    @Override
    public int getItemCount() {
        return favratious.size();
    }


    class holder extends RecyclerView.ViewHolder {
        Chip chip;
        FloatingActionButton floatbutton;
        public holder(@NonNull View itemView) {
            super(itemView);
            chip=(Chip)itemView.findViewById(R.id.chip4);

        }
    }
}
