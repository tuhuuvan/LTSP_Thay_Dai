package com.example.heso3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listlich;
    ArrayList<lich> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listlich =findViewById(R.id.list_item);

        arrayList =new ArrayList<>();
        arrayList =  lich.dulieu();
        adapter adapterlich = new adapter(MainActivity.this, R.layout.item, arrayList);
        listlich.setAdapter(adapterlich);

        listlich.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String ten;
                ten =arrayList.get(i).getLop();
                Toast.makeText(MainActivity.this, ten, Toast.LENGTH_LONG).show();
            }
        });

    }
}