package com.example.baicuoiky;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class gridViewAdapter extends BaseAdapter {
    private Context context;
    private String[] tensp;
    private int[] hinhsp;
    private String[] gia;

    public gridViewAdapter(Context context, String[] tensp, int[] hinhsp, String[] gia) {
        this.context = context;
        this.tensp = tensp;
        this.hinhsp = hinhsp;
        this.gia = gia;
    }

    @Override
    public int getCount() {
        return tensp.length;

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
        LayoutInflater layoutInflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.row_gird,null);
        TextView textViewname= convertView.findViewById(R.id.namesp);
        TextView textViewgia= convertView.findViewById(R.id.gia);
        ImageView anh=convertView.findViewById(R.id.anhsp);

        textViewname.setText(tensp[position]);
        textViewgia.setText(gia[position]);
        anh.setImageResource(hinhsp[position]);


        return convertView;
    }
}
