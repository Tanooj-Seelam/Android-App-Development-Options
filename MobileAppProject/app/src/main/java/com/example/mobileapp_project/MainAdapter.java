package com.example.mobileapp_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class  MainAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private String[] productname;
    private int images;

    public MainAdapter(Context c, String[] productname,int images) {
        context = c;
        this.productname = productname;
        this.images = images;
    }
    
    @Override
    public int getCount() {
        return productname.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.items, null);
        }

        ImageView imageView = convertView.findViewById(R.id.imageView2);
        TextView name = convertView.findViewById(R.id.textview);
        ImageView imageView1 = convertView.findViewById(R.id.imageView3);
        imageView.setImageResource(images);
        name.setText(productname[position]);
        return convertView;
    }
}
