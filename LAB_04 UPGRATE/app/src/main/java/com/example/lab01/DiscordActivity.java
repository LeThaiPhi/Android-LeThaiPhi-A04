package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;

public class DiscordActivity extends AppCompatActivity {
    WebView discord;
    ImageButton btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discord);
        discord =findViewById(R.id.discord);
        btn_back =findViewById(R.id.btn_back);
        String url = "https://discord.com/";
        discord.loadUrl(url);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(DiscordActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}