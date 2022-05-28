package com.example.kt6_huuvan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Country> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(new CustomListAdapter(this, image_details));

        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                Country country = (Country) o;
                Toast.makeText(MainActivity.this, "Selected :" + " " + country, Toast.LENGTH_LONG).show();
            }
        });
    }
    private class ItemLongClickRemove implements AdapterView.OnItemLongClickListener {
        @Override
        public boolean onItemLongClick(AdapterView parent, View view, final int position, long id) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder.setMessage("Bán có muốn xóa sản phẩm này!");
            alertDialogBuilder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            alertDialogBuilder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    //không làm gì
                }
            });
            alertDialogBuilder.show();
            return true;
        }
    }
    private  List<Country> getListData() {
        List<Country> list = new ArrayList<Country>();
        Country vietnam = new Country("Vietnam", "vn", 98000000);
        Country usa = new Country("United States", "us", 320000000);
        Country russia = new Country("Russia", "ru", 142000000);
        Country korea = new Country("Korea", "kr", 142000000);
        Country Japan = new Country("Japan", "jp", 142000000);
        Country vietnam2 = new Country("Vietnam", "vn", 98000000);
        Country usa2 = new Country("United States", "us", 320000000);
        Country russia2 = new Country("Russia", "ru", 142000000);
        Country korea2 = new Country("Korea", "kr", 142000000);
        Country Japan2 = new Country("Japan", "jp", 142000000);

        list.add(vietnam);
        list.add(usa);
        list.add(russia);
        list.add(korea);
        list.add(Japan);
        list.add(vietnam2);
        list.add(usa2);
        list.add(russia2);
        list.add(korea2);
        list.add(Japan2);

        return list;
    }

}