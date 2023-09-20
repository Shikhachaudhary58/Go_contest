package com.example.splashscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.splashscreen.Adapter.ContestAdapter;

import java.util.ArrayList;
import java.util.List;

public class mycontest extends AppCompatActivity {

    RecyclerView recyclerView;
    ContestAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mycontest);
        recyclerView = findViewById(R.id.recycler);
        List<contest> items = new ArrayList<contest>();
        items.add(new contest("Congratulations!", "percentage 30% Won Rs. 20", "10 jun 2023", R.drawable.logo));
        items.add(new contest("Congratulations!", "percentage 30% Won Rs. 20", "10 jun 2023", R.drawable.logo));
        items.add(new contest("Congratulations!", "percentage 30% Won Rs. 20", "10 jun 2023", R.drawable.logo));
        items.add(new contest("Congratulations!", "percentage 30% Won Rs. 20", "10 jun 2023", R.drawable.logo));
        items.add(new contest("Congratulations!", "percentage 30% Won Rs. 20", "10 jun 2023", R.drawable.logo));
        items.add(new contest("Congratulations!", "percentage 30% Won Rs. 20", "10 jun 2023", R.drawable.logo));
        items.add(new contest("Congratulations!", "percentage 30% Won Rs. 20", "10 jun 2023", R.drawable.logo));
        items.add(new contest("Congratulations!", "percentage 30% Won Rs. 20", "10 jun 2023", R.drawable.logo));
        items.add(new contest("Congratulations!", "percentage 30% Won Rs. 20", "10 jun 2023", R.drawable.logo));
        items.add(new contest("Congratulations!", "percentage 30% Won Rs. 20", "10 jun 2023", R.drawable.logo));
        items.add(new contest("Congratulations!", "percentage 30% Won Rs. 20", "10 jun 2023", R.drawable.logo));
        items.add(new contest("Congratulations!", "percentage 30% Won Rs. 20", "10 jun 2023", R.drawable.logo));
        items.add(new contest("Congratulations!", "percentage 30% Won Rs. 20", "10 jun 2023", R.drawable.logo));
        items.add(new contest("Congratulations!", "percentage 30% Won Rs. 20", "10 jun 2023", R.drawable.logo));
        items.add(new contest("Congratulations!", "percentage 30% Won Rs. 20", "10 jun 2023", R.drawable.logo));
        items.add(new contest("Congratulations!", "percentage 30% Won Rs. 20", "10 jun 2023", R.drawable.logo));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ContestAdapter(getApplicationContext(),items));


        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("My contest");
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}