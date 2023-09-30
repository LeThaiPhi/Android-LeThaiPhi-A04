package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {

    TextInputEditText editTextUserName ;
    ImageButton signOut;
    private ImageButton btnPic ,btnCall,btnSMS,game_tictactoe,btn_youtube,btn_google,btn_truyen , btn_discord,btn_facebook , btn_messenger, btn_UEF;
    FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        signOut = findViewById(R.id.sign_out);
        btnPic =findViewById(R.id.btnPic);
        btnCall =findViewById(R.id.btnCall);
        btn_youtube = findViewById(R.id.btn_youtube);
        btn_google = findViewById(R.id.btn_google);
        btn_truyen = findViewById(R.id.btn_truyen);
        btn_UEF = findViewById(R.id.btn_UEF);
        btn_facebook = findViewById(R.id.btn_facebook);
        btn_messenger = findViewById(R.id.btn_messenger);
        btn_discord = findViewById(R.id.btn_discord);
        btnSMS =findViewById(R.id.btnSMS);
        game_tictactoe =findViewById(R.id.game_tictactoe);
        game_tictactoe.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(HomeActivity.this, Game_TicTacToe.class);
                startActivity(intent);
                finish();
            }

        });
        signOut.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }

        });
        btnCall.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HomeActivity.this , CallActivity.class);
                startActivity(intent1);
            }
        });

        btnSMS.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(HomeActivity.this , SMSActivity.class);
                startActivity(intent2);
            }
        });
        btnPic.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(HomeActivity.this , CaptureActivity.class);
                startActivity(intent3);
            }
        });
        btn_youtube.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(HomeActivity.this, YoutubeActivity.class);
                startActivity(intent);
                finish();
            }

        });
        btn_google.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(HomeActivity.this, GoogleActivity.class);
                startActivity(intent);
                finish();
            }

        });
        btn_truyen.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(HomeActivity.this, TruyenTranhActivity.class);
                startActivity(intent);
                finish();
            }

        });
        btn_discord.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(HomeActivity.this, DiscordActivity.class);
                startActivity(intent);
                finish();
            }

        });
        btn_facebook.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(HomeActivity.this, FacebookActivity.class);
                startActivity(intent);
                finish();
            }

        });
        btn_messenger.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(HomeActivity.this, MessengerActivity.class);
                startActivity(intent);
                finish();
            }

        });
        btn_UEF.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(HomeActivity.this, DaoTaoUEFActivity.class);
                startActivity(intent);
                finish();
            }

        });
    }


}
