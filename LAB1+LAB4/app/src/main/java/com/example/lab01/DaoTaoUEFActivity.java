package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;

public class DaoTaoUEFActivity extends AppCompatActivity {

    WebView daotao;
    ImageButton btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dao_tao_uefactivity);
        btn_back =findViewById(R.id.btn_back);
        daotao = findViewById(R.id.UEF);

        String url = "https://daotao.uef.edu.vn/default.aspx?page=gioithieu";
        daotao.loadUrl(url);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(DaoTaoUEFActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}