package com.example.kheti_baadi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;

public class crops extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crops);
        Bundle bundle = new Bundle();
        bundle.putInt("itemPosition", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        list listFrag = new list();
        descfrag descFragment = new descfrag();
        descFragment.setArguments(bundle);

            fragmentTransaction.replace(R.id.listcontainer, listFrag, "listFrag");
            fragmentTransaction.addToBackStack("listFrag");
            fragmentTransaction.commit();

    }


}
