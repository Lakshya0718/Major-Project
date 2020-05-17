package com.hashtagvoyages.hashtagvoyages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class mainmenu extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        mAuth = FirebaseAuth.getInstance();

    }

    public void openblog(View view) {
        Intent intent = new Intent(mainmenu.this, blogs.class);
        startActivity(intent);
    }

    public void openshop(View view) {
        Intent intent = new Intent(mainmenu.this, Shop.class);
        startActivity(intent);
    }

    public void openpackages(View view) {
        Intent intent = new Intent(mainmenu.this, Packages.class);
        startActivity(intent);
    }

    public void openabout(View view) {
        Intent intent = new Intent(mainmenu.this, About.class);
        startActivity(intent);
    }

    public void Signout(View view) {
        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(mainmenu.this, Login.class);
        startActivity(intent);
        finishActivity(0);
        finish();

    }

    public void openbillsplitter(View view) {

        Intent intent = new Intent(mainmenu.this, splitter_main.class);
        startActivity(intent);
    }

    public void opensurvey(View view) {

        Intent intent4 = new Intent(mainmenu.this, survey.class);
        startActivity(intent4);
    }

    public void openplaylist(View view) {

        Intent intent = new Intent(mainmenu.this, playlist.class);
        startActivity(intent);
    }

    private Boolean exit = false;

    public void onBackPressed() {
        if (exit) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
            System.exit(0);
        } else {
            Toast.makeText(this, "Press Back again to Exit",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);

        }

    }
}