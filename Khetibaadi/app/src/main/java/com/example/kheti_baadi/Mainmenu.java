package com.example.kheti_baadi;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.os.Bundle;

public class Mainmenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
    }

    public void openques (View view) {
            Intent intent = new Intent(Mainmenu.this, question_ans.class);
            startActivity(intent);
    }

    public void opencba(View view) {
        Intent intent = new Intent(Mainmenu.this, CBA.class);
        startActivity(intent);
    }

    public void opencrop(View view) {
        Intent intent = new Intent(Mainmenu.this, crops.class);
        startActivity(intent);
    }

    public void openzbnf(View view) {
        Uri uri = Uri.parse("http://apzbnf.in/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
