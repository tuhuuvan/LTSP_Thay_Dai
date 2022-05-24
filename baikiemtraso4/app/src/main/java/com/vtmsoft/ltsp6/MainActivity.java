package com.vtmsoft.ltsp6;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    ListView listdanhsach;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("LỊCH HỌC");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);

        listdanhsach=findViewById(R.id.list_danh_ba);
        ArrayList<DanhSachLop> danhsach =new ArrayList<>();
        DanhSachLop danhsach1 = new DanhSachLop(R.drawable.logo_ct,"CĐ ĐTTT 20A","CA 1",R.drawable.ic_chevron_right_black_24dp);
        danhsach.add(danhsach1);
        DanhSachLop danhsach2 = new DanhSachLop(R.drawable.logo_ct,"CĐ ĐTTT 20B","CA 2",R.drawable.ic_chevron_right_black_24dp);
        danhsach.add(danhsach2);
        DanhSachLop danhsach3 = new DanhSachLop(R.drawable.logo_ct,"CĐ ĐTTT 21A","CA 1",R.drawable.ic_chevron_right_black_24dp);
        danhsach.add(danhsach3);
        DanhSachLop danhsach4 = new DanhSachLop(R.drawable.logo_ct,"CĐ ĐTTT 21B","CA 2",R.drawable.ic_chevron_right_black_24dp);
        danhsach.add(danhsach4);
        AdapterDsLop adapterDanhSach=new AdapterDsLop(MainActivity.this,R.layout.item_nhomlop,danhsach);
        listdanhsach.setAdapter(adapterDanhSach);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                //onBackPressed();
                Toast.makeText(this, "Bạn vừa bấm menu", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu1:
                //code xử lý khi bấm menu1
                openActivity1();
                break;
            case R.id.menu2:
                //code xử lý khi bấm menu2
                openActivity2();
                break;
            default:break;
        }

        return super.onOptionsItemSelected(item);
    }
    private void openActivity1() {
        intent = new Intent(this, Main1Activity.class);
        startActivity(intent);
    }

    private void openActivity2() {
        intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

}
