package com.example.kheti_baadi;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class list_cba extends ListFragment {

    private String[] dataArray = {"Cotton/कपास", "Mustard/सरसों", "Wheat/गेहूँ", "Millet/बाजरा", "Barley/जौ", "Sugarcane/गन्ना"};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState1) {
        super.onCreate(savedInstanceState1);
        ListAdapter listAdapter1 = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, dataArray);
        setListAdapter(listAdapter1);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater1, @Nullable ViewGroup container1, @Nullable Bundle savedInstanceState) {
        return inflater1.inflate(R.layout.fragment_list_cba, container1, false);
    }

    @Override
    public void onListItemClick(@NonNull ListView l1, @NonNull View v, int position12, long id1) {
        Bundle bundle1 = new Bundle();
        bundle1.putInt("itemPosition1", position12);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        desc_cba descFragment2 = new desc_cba();
        descFragment2.setArguments(bundle1);

        fragmentTransaction.replace(R.id.listcontainer2, descFragment2);
        fragmentTransaction.addToBackStack("desc_cba");
        fragmentTransaction.commit();

    }
}