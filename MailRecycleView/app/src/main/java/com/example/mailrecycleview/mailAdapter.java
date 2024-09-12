package com.example.mailrecycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class mailAdapter extends RecyclerView.Adapter<mailAdapter.MailHolder> {
    ArrayList<object_data> data;

    public mailAdapter(ArrayList<object_data> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MailHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,null,false);
        return new MailHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MailHolder holder, int position) {
        holder.content.setText(data.get(position).getText());
        holder.subject.setText(data.get(position).getText());
        holder.name.setText(data.get(position).getText());
        holder.imageView.setImageResource(data.get(position).getResId());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MailHolder extends RecyclerView.ViewHolder {
        TextView name,subject,content;
        ImageView imageView;
        public MailHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tvSender);
            subject = itemView.findViewById(R.id.tvSubject);
            content = itemView.findViewById(R.id.tvContent);
            imageView = itemView.findViewById(R.id.iv);
        }
    }
}
