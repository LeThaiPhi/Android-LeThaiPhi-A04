package com.example.lab01;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.Manifest;

import static android.provider.MediaStore.ACTION_IMAGE_CAPTURE;
public class CaptureActivity extends AppCompatActivity{
    private final int CAMERA_REQ_CODE = 100;
    ImageView pic_1;
    ImageButton btn_pic;
    Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capture);
        pic_1 = findViewById(R.id.pic_1);
        btn_pic = findViewById(R.id.btn_pic);
        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btn_pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ACTION_IMAGE_CAPTURE);
                if (ActivityCompat.checkSelfPermission(CaptureActivity.this,
                        Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(CaptureActivity.this, new
                            String[]{Manifest.permission.CAMERA}, 1);
                    return;
                }
                startActivityForResult(intent, 99);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable
    Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 99 && resultCode == CaptureActivity.RESULT_OK)
        {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            pic_1.setImageBitmap(photo);
        }
    }




}