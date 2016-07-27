package com.android.application.pizza;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class personalInfo extends AppCompatActivity {

    String pizzaName, name, address, ph;
    EditText edname = (EditText) findViewById(R.id.name);
    EditText edph = (EditText) findViewById(R.id.phno);
    EditText edad = (EditText) findViewById(R.id.addr);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Enter your personal Information", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    protected void onHandleIntent(Intent intent) {
        //pizzaName = intent.getStringExtra("PizzaName");
    }

    public void order(View v)
    {
        name=edname.getText().toString();
        address=edad.getText().toString();
        ph=edph.getText().toString();

        Intent i=new Intent(this, summary.class);
        i.putExtra("PizzaName", pizzaName);
        i.putExtra("Name", name);
        i.putExtra("Address",address);
        i.putExtra("Phone",ph);

        Toast.makeText(this, "Order placed!!!",
                Toast.LENGTH_LONG).show();
        startActivity(i);
    }
}
