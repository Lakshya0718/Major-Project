package com.hashtagvoyages.hashtagvoyages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
    }

    public void openplaylist1(View view) {
        Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLW8HS7qvQ0pTRbU3nXqhjj0pKLt5PnYkL");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void openplaylist2(View view) {
        Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLW8HS7qvQ0pROO0qNtkgspYTr4cxFt2pa");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void openallplaylist(View view) {
        Uri uri = Uri.parse("https://www.youtube.com/channel/UCu0w5p-jgUXQFGF1ApZHeCA");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
