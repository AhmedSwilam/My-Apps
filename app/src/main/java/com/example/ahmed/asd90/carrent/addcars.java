package com.example.ahmed.asd90.carrent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class addcars extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcars);
        final EditText name = (EditText) findViewById(R.id.nameet);
        final EditText model = (EditText) findViewById(R.id.mod);
        final CheckBox status = (CheckBox) findViewById(R.id.checkBox);
        Button AddCar = (Button) findViewById(R.id.add2);
        AddCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Car car = new Car();
                car.setId(1);
                car.setName(name.getText().toString());
                car.setModel(model.getText().toString());
                car.setStatus(status.isChecked());
                Toast.makeText(addcars.this, "Add car completed", Toast.LENGTH_SHORT).show();
                finish();


            }
        });


    }
}
