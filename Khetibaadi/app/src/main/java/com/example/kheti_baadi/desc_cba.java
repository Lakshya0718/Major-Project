package com.example.kheti_baadi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class desc_cba extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater1, ViewGroup container1,
                             Bundle savedInstanceState1) {

        View view = inflater1.inflate(R.layout.fragment_desc_cba, container1, false);
        View view1 = view.findViewById(R.id.title123);
        View view3 = view.findViewById(R.id.img123);

        Bundle bundle1 = getArguments();
        int position12 = bundle1.getInt("itemPosition1");

        String Title1 = getTitle(position12);
        ((TextView)view1).setText(Title1);
        ((ImageView)view3).setImageResource(imageid1[position12]);


        return view;
    }

    private String getTitle(int position) {

        ArrayList<String> title1 = new ArrayList<>();
        title1.add("Cotton/कपास");
        title1.add("Mustard/सरसों");
        title1.add("Wheat/गेहूँ");
        title1.add("Millet/बाजरा");
        title1.add("Barley/जौ");
        title1.add("Sugarcane/गन्ना");

        String Title1 = title1.get(position);

        return Title1;
    }

    private Integer[] imageid1 ={
            R.drawable.cotton_cba,
            R.drawable.mustard_cba,
            R.drawable.wheat_cba,
            R.drawable.bajra_cba,
            R.drawable.barley_cba,
            R.drawable.sugarcane_cba
    };
}
