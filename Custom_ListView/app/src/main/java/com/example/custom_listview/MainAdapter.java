package com.example.custom_listview;

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
    private String discription;
    private String[] cost;
    private int[] images;

    public MainAdapter(Context c, String[] productname, String discription, String[] cost, int[] images) {
        context = c;
        this.productname = productname;
        this.discription = discription;
        this.cost = cost;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.length;
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
            convertView = inflater.inflate(R.layout.list_data, null);
        }

        ImageView imageView = convertView.findViewById(R.id.image_view);
        TextView name = convertView.findViewById(R.id.textview);
        TextView disc = convertView.findViewById(R.id.textview2);
        TextView cost1 = convertView.findViewById(R.id.textview3);

        imageView.setImageResource(images[position]);
        name.setText(productname[position]);
        disc.setText(discription);
        cost1.setText(cost[position]);
        return convertView;
    }
}
