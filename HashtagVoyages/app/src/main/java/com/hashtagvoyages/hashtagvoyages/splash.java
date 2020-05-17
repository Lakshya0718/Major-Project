package com.hashtagvoyages.hashtagvoyages;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class splash extends AppCompatActivity {

    private FirebaseAuth mAuth;

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        mAuth = FirebaseAuth.getInstance();

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                FirebaseUser currentUser = mAuth.getCurrentUser();
                if (currentUser != null) {
                    Intent intent = new Intent(splash.this, mainmenu.class);
                    startActivity(intent);
                    finish();
                } else {
                    Intent intent = new Intent(splash.this, Login.class);
                    startActivity(intent);
                    finish();
                }
            }
        }, 2000);

    }
}