package com.example.ahmed.asd90.carrent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ShowCars extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_cars);
        Button addCar = (Button) findViewById(R.id.add1);
        addCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aintent = new Intent(ShowCars.this, addcars.class);
                startActivity(aintent);

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

    }
    public void print(){
        System.out.print("test");

    }
};












