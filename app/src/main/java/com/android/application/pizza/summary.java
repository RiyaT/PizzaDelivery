package com.android.application.pizza;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class summary extends AppCompatActivity {
    String pizzaName, name, address, ph;
    TextView tv= (TextView) findViewById(R.id.orderSummary);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    protected void onHandleIntent(Intent intent) {
        pizzaName = intent.getStringExtra("PizzaName");
        name = intent.getStringExtra("Name");
        address = intent.getStringExtra("Address");
        ph = intent.getStringExtra("Phone");

        tv.setText("Name : " + name + "\nAddress : " + address + "\nPhone No. : " + ph + "\nPizza : " + pizzaName + "\nDelivered from : ");
    }

}
