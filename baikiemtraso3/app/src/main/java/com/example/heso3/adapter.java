package com.example.heso3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class adapter extends ArrayAdapter<lich> {
    Context context;
    int res;
    ArrayList<lich> listlich;
    public adapter(@NonNull Context context, int resource, @NonNull ArrayList<lich> objects) {
        super(context, resource, objects);
        this.context = context;
        this.res = resource;
        this.listlich = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null)
            convertView = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        TextView lop = convertView.findViewById(R.id.lop);
        TextView ca = convertView.findViewById(R.id.ca);
        lich lich = listlich.get(position);

        lop.setText(lich.getLop());
        ca.setText(lich.getCa());




        return  convertView;

    }
}
