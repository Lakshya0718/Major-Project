package com.example.kheti_baadi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class question_ans extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_ans);
    }

    public void savedata(View view) {
        Toast.makeText(this,"Question has been sent to Expert! You will recieve a message with solution!", Toast.LENGTH_LONG).show();
    }
}
