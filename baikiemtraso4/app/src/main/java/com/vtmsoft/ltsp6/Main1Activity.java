package com.vtmsoft.ltsp6;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class Main1Activity extends AppCompatActivity {
    ListView list_thongbao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        list_thongbao =findViewById(R.id.list_thongbao);

        ArrayList<Thongbao> thongbaos= new ArrayList<>();
        Thongbao thongbao1 = new Thongbao(R.drawable.elearning_300x150,"1/3/2022","thông báo sẽ chuyển sang học online thay vì ofline như bình thường vì lí do tình hình dịch phức tạp...");
        thongbaos.add(thongbao1);
        Thongbao thongbao2 =new Thongbao(R.drawable.anh_icon_4,"1/4/2022","thông báo về lịch thi khóa 2022 kết thúc học kỳ 2");
        thongbaos.add(thongbao2);
        Thongbao thongbao3 =new Thongbao(R.drawable.anh_icon_2,"1/5/2022","thông báo lịch học của HK mới, Sinh viên toàn thể trường click vào để biết thêm chi tiết.");
        thongbaos.add(thongbao3);
        AdapterThongbao adapterThongbao =new AdapterThongbao(Main1Activity.this,R.layout.item_thongbao,thongbaos);
        list_thongbao.setAdapter(adapterThongbao);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("THÔNG BÁO");
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:break;
        }
        return super.onOptionsItemSelected(item);
    }
}
