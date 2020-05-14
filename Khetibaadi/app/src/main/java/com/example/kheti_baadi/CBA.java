package com.example.kheti_baadi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class CBA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cba);

        Bundle bundle1 = new Bundle();
        bundle1.putInt("itemPosition1", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        list_cba listFrag = new list_cba();
        desc_cba descFragment = new desc_cba();
        descFragment.setArguments(bundle1);

        fragmentTransaction.replace(R.id.listcontainer2, listFrag, "list_cba");
        fragmentTransaction.addToBackStack("list_cba");
        fragmentTransaction.commit();
    }
}
