package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;

public class GoogleActivity extends AppCompatActivity {
    WebView google;
    ImageButton btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);
        google =findViewById(R.id.google);
        btn_back =findViewById(R.id.btn_back);
        String url = "https://www.google.com/search?q=google&sca_esv=569740195&hl=vi&sxsrf=AM9HkKlDxd7rcuWB08Sn4Wqgm3I4RyePWw%3A1696096267125&source=hp&ei=C2AYZfCpBcf01e8Ps5iAkAk&iflsig=AO6bgOgAAAAAZRhuG_juNV1xUfCR2NmNnFE_cgnudGnm&gs_ssp=eJzj4tTP1TcwMU02T1JgNGB0YPBiS8_PT89JBQBASQXT&oq=&gs_lp=Egdnd3Mtd2l6IgAqAggBMgcQIxjqAhgnMg0QLhjHARjRAxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnSO4LUABYAHABeACQAQCYAQCgAQCqAQC4AQHIAQCoAgo&sclient=gws-wiz";
        google.loadUrl(url);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(GoogleActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}