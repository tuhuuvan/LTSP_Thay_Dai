package com.example.baikiemtraso2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText;
    TextView textView;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.chuyendoi);
        textView=findViewById(R.id.amlich);
        editText=findViewById(R.id.duonglich);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String can []={"Canh","Tân","Nhâm","Quý","Giáp","Ất","Bỉnh","Đinh","Mậu","kỷ"};
                String chi[]={"Thân","Dậu","Tuất","Hợi","Tý","sửu","Dần","Mẹo","Thìn","Tỵ","Ngọ","Mùi"};
                String di = editText.getText().toString();
                int m = Integer.parseInt(di);
                String am= can[m%10] + " " +chi[m%10];
                textView.setText(am);
            }
        });
    }
}