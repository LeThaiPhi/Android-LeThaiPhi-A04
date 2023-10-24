package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;

public class TruyenTranhActivity extends AppCompatActivity {
    WebView truyentranh;
    ImageButton btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truyen_tranh);
        truyentranh =findViewById(R.id.truyentranh);
        btn_back = findViewById(R.id.btn_back);
        String url = "https://goctruyentranhvui.com/trang-chu";
        truyentranh.loadUrl(url);


        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(TruyenTranhActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}