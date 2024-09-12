package com.example.recycleviewmail;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ModelClass> userList;

    public Adapter (List<ModelClass>userList){
        this.userList = userList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int resource = userList.get(position).getImg1();
        String name = userList.get(position).getTxt1();
        String subject = userList.get(position).getTxt2();
        String context = userList.get(position).getTxt3();
        String time = userList.get(position).getTime();

        holder.setData(resource,name,subject,context,time);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView IV;
        private TextView TV1,TV2,TV3,TIME;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            IV=itemView.findViewById(R.id.imageView1);
            TV1=itemView.findViewById(R.id.textview);
            TV2=itemView.findViewById(R.id.textview2);
            TV3=itemView.findViewById(R.id.textview3);
            TIME=itemView.findViewById(R.id.textview4);
        }

        public void setData(int resource, String name, String subject, String context, String time)
        {
            IV.setImageResource(resource);
            TV1.setText(name);
            TV2.setText(subject);
            TV3.setText(context);
            TIME.setText(time);
        }
    }
}
