package com.example.kheti_baadi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity
{
    private static int SPLASH_TIME_OUT=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable()
        {
            @Override
                public void run() {
                Intent homeIntent = new Intent(MainActivity.this, Mainmenu.class);
                startActivity(homeIntent);
                finish();
            }
            },SPLASH_TIME_OUT);
    }
}
