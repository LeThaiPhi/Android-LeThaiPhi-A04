package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;

public class YoutubeActivity extends AppCompatActivity {
    WebView youtube;
    ImageButton btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);
        youtube =findViewById(R.id.youtube);
        btn_back = findViewById(R.id.btn_back);
        String url = "https://www.youtube.com/";
        youtube.loadUrl(url);


        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(YoutubeActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}