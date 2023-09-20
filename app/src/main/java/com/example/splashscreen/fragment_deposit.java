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

import com.example.splashscreen.Adapter.ViewAdapter;


public class fragment_deposit extends Fragment {
    List<deposite> items;
    RecyclerView recyclerView;
    ViewAdapter viewAdapter;



    public fragment_deposit() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View rootview= inflater.inflate(R.layout.fragment_deposit, container, false);
        items = generatedeposit();
        recyclerView = rootview.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        viewAdapter = new ViewAdapter(items);
        recyclerView.setAdapter(viewAdapter);
        return rootview;

    }

    private List<deposite> generatedeposit() {
        List<deposite> items = new ArrayList<>();
        items.add(new deposite("Deposit", "18:12", "2 August 2023", "Rs. 30", "Failed"));
        items.add(new deposite("Deposit", "18:12", "2 August 2023", "Rs. 30", "Failed"));
        items.add(new deposite("Deposit", "18:12", "2 August 2023", "Rs. 30", "Failed"));
        items.add(new deposite("Deposit", "18:12", "2 August 2023", "Rs. 30", "Failed"));
        items.add(new deposite("Deposit", "18:12", "2 August 2023", "Rs. 30", "Failed"));
        items.add(new deposite("Deposit", "18:12", "2 August 2023", "Rs. 30", "Failed"));
        items.add(new deposite("Deposit", "18:12", "2 August 2023", "Rs. 30", "Failed"));
        items.add(new deposite("Deposit", "18:12", "2 August 2023", "Rs. 30", "Failed"));
        items.add(new deposite("Deposit", "18:12", "2 August 2023", "Rs. 30", "Failed"));
        items.add(new deposite("Deposit", "18:12", "2 August 2023", "Rs. 30", "Failed"));
        items.add(new deposite("Deposit", "18:12", "2 August 2023", "Rs. 30", "Failed"));
        items.add(new deposite("Deposit", "18:12", "2 August 2023", "Rs. 30", "Failed"));
        items.add(new deposite("Deposit", "18:12", "2 August 2023", "Rs. 30", "Failed"));
        items.add(new deposite("Deposit", "18:12", "2 August 2023", "Rs. 30", "Failed"));
        items.add(new deposite("Deposit", "18:12", "2 August 2023", "Rs. 30", "Failed"));
        items.add(new deposite("Deposit", "18:12", "2 August 2023", "Rs. 30", "Failed"));
        items.add(new deposite("Deposit", "18:12", "2 August 2023", "Rs. 30", "Failed"));
        items.add(new deposite("Deposit", "18:12", "2 August 2023", "Rs. 30", "Failed"));
        return items;

    }
}