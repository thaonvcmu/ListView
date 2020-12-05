package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listViewProduct;
    private Adapter productListViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewProduct = (ListView)findViewById(R.id.listProduct);
        listViewProduct.setAdapter(productListViewAdapter);
        adapter.notifyDataSetChanged();
    }
}
