package com.example.splashscreen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import com.example.splashscreen.Adapter.Completeadapter;

public class fragment3 extends Fragment {

    private List<Data> list;
    private RecyclerView homeRecyclerview;
    private Completeadapter completeadapter;



    public fragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.fragment_fragment3, container, false);

        list = generateData();
        homeRecyclerview = rootview.findViewById(R.id.recycler);
        homeRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        completeadapter = new Completeadapter(list);
        homeRecyclerview.setAdapter(completeadapter);

        return rootview;

    }

    private List<Data> generateData(){
        List<Data> Data = new ArrayList<>();
        Data.add(new Data("25 Questions", "Play and Win 5000", "Entry Fees 100","End in 00:45:03", "2500 users are playing", R.drawable.logo));
        Data.add(new Data("25 Questions", "Play and Win 5000", "Entry Fees 100","End in 00:45:03", "2500 users are playing", R.drawable.logo));
        Data.add(new Data("25 Questions", "Play and Win 5000", "Entry Fees 100","End in 00:45:03", "2500 users are playing", R.drawable.logo));
        Data.add(new Data("25 Questions", "Play and Win 5000", "Entry Fees 100","End in 00:45:03", "2500 users are playing", R.drawable.logo));
        Data.add(new Data("25 Questions", "Play and Win 5000", "Entry Fees 100","End in 00:45:03", "2500 users are playing", R.drawable.logo));
        Data.add(new Data("25 Questions", "Play and Win 5000", "Entry Fees 100","End in 00:45:03", "2500 users are playing", R.drawable.logo));
        Data.add(new Data("25 Questions", "Play and Win 5000", "Entry Fees 100","End in 00:45:03", "2500 users are playing", R.drawable.logo));
        Data.add(new Data("25 Questions", "Play and Win 5000", "Entry Fees 100","End in 00:45:03", "2500 users are playing", R.drawable.logo));
        Data.add(new Data("25 Questions", "Play and Win 5000", "Entry Fees 100","End in 00:45:03", "2500 users are playing", R.drawable.logo));
        Data.add(new Data("25 Questions", "Play and Win 5000", "Entry Fees 100","End in 00:45:03", "2500 users are playing", R.drawable.logo));
        Data.add(new Data("25 Questions", "Play and Win 5000", "Entry Fees 100","End in 00:45:03", "2500 users are playing", R.drawable.logo));
        Data.add(new Data("25 Questions", "Play and Win 5000", "Entry Fees 100","End in 00:45:03", "2500 users are playing", R.drawable.logo));
        Data.add(new Data("25 Questions", "Play and Win 5000", "Entry Fees 100","End in 00:45:03", "2500 users are playing", R.drawable.logo));
        Data.add(new Data("25 Questions", "Play and Win 5000", "Entry Fees 100","End in 00:45:03", "2500 users are playing", R.drawable.logo));
        Data.add(new Data("25 Questions", "Play and Win 5000", "Entry Fees 100","End in 00:45:03", "2500 users are playing", R.drawable.logo));
        Data.add(new Data("25 Questions", "Play and Win 5000", "Entry Fees 100","End in 00:45:03", "2500 users are playing", R.drawable.logo));
        Data.add(new Data("25 Questions", "Play and Win 5000", "Entry Fees 100","End in 00:45:03", "2500 users are playing", R.drawable.logo));
        Data.add(new Data("25 Questions", "Play and Win 5000", "Entry Fees 100","End in 00:45:03", "2500 users are playing", R.drawable.logo));
        Data.add(new Data("25 Questions", "Play and Win 5000", "Entry Fees 100","End in 00:45:03", "2500 users are playing", R.drawable.logo));
        Data.add(new Data("25 Questions", "Play and Win 5000", "Entry Fees 100","End in 00:45:03", "2500 users are playing", R.drawable.logo));
        return Data;
    }

}