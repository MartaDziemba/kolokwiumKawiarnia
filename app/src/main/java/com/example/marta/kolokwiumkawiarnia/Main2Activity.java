package com.example.marta.kolokwiumkawiarnia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.recycler)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ButterKnife.bind(this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<Coffee> kawy = new ArrayList<>();
        kawy.add(new Coffee("Latte", "15.00 zł"));
        kawy.add(new Coffee("Cappuccino", "12.00 zł"));
        kawy.add(new Coffee("Americano", "10.00 zł"));
        kawy.add(new Coffee("Espresso", "10.00 zł"));
        kawy.add(new Coffee("Flat White", "12.00 zł"));

        CoffeeAdapter coffeeAdaper = new CoffeeAdapter(kawy);
        recyclerView.setAdapter(coffeeAdaper);
    }
}
