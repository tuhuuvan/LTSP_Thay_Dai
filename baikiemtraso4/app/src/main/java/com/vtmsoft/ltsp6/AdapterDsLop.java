package com.vtmsoft.ltsp6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AdapterDsLop extends ArrayAdapter<DanhSachLop> {

    Context context;
    int res;
    ArrayList<DanhSachLop> danhsachlop;


    public AdapterDsLop(@NonNull Context context, int resource, @NonNull ArrayList<DanhSachLop> objects) {
        super(context, resource, objects);
        this.context = context;
        this.res = resource;
        this.danhsachlop = objects;

    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(context).inflate(R.layout.item_nhomlop, parent, false);
        TextView tenlop = convertView.findViewById(R.id.tenlop);
        TextView ca = convertView.findViewById(R.id.ca);
        ImageView hinhanh = convertView.findViewById(R.id.hinhanh);
        ImageButton nutnhan = convertView.findViewById(R.id.nutnhan);
        DanhSachLop dsl = danhsachlop.get(position);
        String cahs =dsl.getCa();
        ca.setText(cahs);
        String name = dsl.getTenlop();
        tenlop.setText(name);
        int logo = dsl.getHinhanh();
        hinhanh.setImageResource(logo);
        int button = dsl.getNutnhan();
        nutnhan.setImageResource(button);
        return convertView;
    }

}
