package com.example.n2_13_ptitplus2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DanhMucAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Danhmuc> danhmucList;

    public DanhMucAdapter(Context context, int layout, List<Danhmuc> danhmucList) {
        this.context = context;
        this.layout = layout;
        this.danhmucList = danhmucList;
    }

    @Override
    public int getCount() {
        //tra ve so dong
        return danhmucList.size();
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
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(layout, null);
        //anhxa view
        TextView txtTen = (TextView) convertView.findViewById(R.id.textviewTen);
        ImageView imgHinh = (ImageView) convertView.findViewById(R.id.imageviewHinh);

        //gan gia tri
        Danhmuc danhmuc = danhmucList.get(position);
        txtTen.setText(danhmuc.getTen());
        imgHinh.setImageResource(danhmuc.getHinh());

        return convertView;
    }
}
