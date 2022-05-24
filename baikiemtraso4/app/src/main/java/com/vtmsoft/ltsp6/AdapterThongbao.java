package com.vtmsoft.ltsp6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AdapterThongbao extends ArrayAdapter<Thongbao> {
    Context context;
    int res;
    ArrayList<Thongbao> listthongbao;

    public AdapterThongbao(@NonNull Context context, int resource, @NonNull ArrayList<Thongbao> objects) {
        super(context, resource, objects);
        this.context =context;
        this.res=resource;
        this.listthongbao=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null)
            convertView= LayoutInflater.from(context).inflate(R.layout.item_thongbao,parent,false);
        ImageView anh=convertView.findViewById(R.id.anh);
        TextView ngay=convertView.findViewById(R.id.ngay);
        TextView thongbao=convertView.findViewById(R.id.thongbao);
        Thongbao tb =listthongbao.get(position);
        int anhtb=tb.getAnh();
        anh.setImageResource(anhtb);
        String ngaytb=tb.getNgay();
        ngay.setText(ngaytb);
        String ndung=tb.getTieude();
        thongbao.setText(ndung);
        return convertView;
    }
}
