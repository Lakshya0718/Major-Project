package com.hashtagvoyages.hashtagvoyages;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class splitter_main extends Activity {


    Button btnt;
    Button btnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splitter_main);
        btnd=(Button)findViewById(R.id.btnday);
        btnt=(Button)findViewById(R.id.btntrip);
        OnClickButtonListener();
        OnButtonTransClicked();
    }


    //activity to add new trip
    public void OnClickButtonListener(){
        btnt.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent= new Intent(splitter_main.this, AddPlace.class);
                        startActivity(intent);
                        finish();
                    }
                }
        );
    }

    //function call for transactions with friends
    public void OnButtonTransClicked(){
        btnd.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(getApplicationContext(),Display_friend.class);
                        startActivity(intent);
                        finish();
                    }
                }
        );
    }

    //when back pressed to confirm whether accidently pressed or not
    private Boolean exit = false;
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(getApplicationContext(), mainmenu.class);
        startActivity(intent);
        finish();
    }
}

