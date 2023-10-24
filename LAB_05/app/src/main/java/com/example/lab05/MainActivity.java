package com.example.lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtCounterAll;
    int counter;
    Button btn_count_water,btn_count_carrot,btn_count_lemon, btn_reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCounterAll = findViewById(R.id.txtCounterAll);
        btn_count_water = findViewById(R.id.btn_count_water);
        btn_count_carrot = findViewById(R.id.btn_count_carrot);
        btn_count_lemon = findViewById(R.id.btn_count_lemon);
        btn_reset = findViewById(R.id.btn_reset);
        counter=0;
        btn_count_water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              counter++;
                txtCounterAll.setText(""+ counter);
            }
        });
        btn_count_carrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter=counter+6;
                txtCounterAll.setText(""+ counter);
            }
        });
        btn_count_lemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter=counter+3;
                txtCounterAll.setText(""+ counter);
            }
        });
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter=0;
                txtCounterAll.setText(""+ counter);
            }
        });
    }
}