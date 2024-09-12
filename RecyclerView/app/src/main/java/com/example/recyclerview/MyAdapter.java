package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Myholder> {
    Context c;
    String mycountries[];

    public MyAdapter(Context context, String countries[])
    {
        c= context;
        mycountries = countries;
    }

    @NonNull
    @Override
    public MyAdapter.Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(c);
        View v = layoutInflater.inflate(R.layout.items,parent,false);
        return new Myholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.Myholder holder, int position) {
        holder.textView.setText(mycountries[position]);
    }

    @Override
    public int getItemCount() {
        return mycountries.length;
    }

    public class Myholder extends RecyclerView.ViewHolder{
        TextView textView;

        public Myholder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
