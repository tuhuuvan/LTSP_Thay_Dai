package com.vtmsoft.sales;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.vtmsoft.sales.adapter.ProductAdapter;
import com.vtmsoft.sales.models.Product;
import com.vtmsoft.sales.models.SaleManager;

import java.util.AbstractList;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ProductAdapter adapter;
    private AbstractList<Product> Products;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lvProducts);

        SaleManager saleManager = SaleManager.get();
        saleManager.generateProducts();


        ArrayList products = saleManager.getProducts();
        adapter = new ProductAdapter(this, products);//khởi tạo adapter
        lv.setAdapter(adapter);//hiển lên listview
        lv.setOnItemLongClickListener(new ItemLongClickRemove());
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent intent = new Intent(MainActivity.this, ProductActivity.class);
                intent.putExtra(ProductActivity.EXTRA_POSITION, position);
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.btnAdd) {
            Toast.makeText(this, "Bạn vừa bấm vào dấu cộng", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, ProductActivity.class);

            intent.putExtra(ProductActivity.EXTRA_POSITION, -1);
            startActivity(intent);
            Products.add(new Product("Bánh mì gừng GingerBread 2", "Ổ", 15000));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private class ItemLongClickRemove implements AdapterView.OnItemLongClickListener {
        @Override
        public boolean onItemLongClick(AdapterView parent, View view, final int position, long id) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder.setMessage("Bán có muốn xóa sản phẩm này!");
            alertDialogBuilder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    SaleManager.get().getProducts().remove(position);

                    adapter.notifyDataSetChanged();

                }
            });
            alertDialogBuilder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            alertDialogBuilder.show();
            return true;
        }
    }
}
