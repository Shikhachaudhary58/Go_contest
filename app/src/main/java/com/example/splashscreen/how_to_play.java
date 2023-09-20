package com.example.splashscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import com.example.splashscreen.Adapter.Play_Adapter;
import com.example.splashscreen.Adapter.frqadapter;

public class how_to_play extends AppCompatActivity {
    RecyclerView recyclerView;
    Play_Adapter playAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_play);

        recyclerView = findViewById(R.id.search_recycler);
        List<play> data = new ArrayList<>();
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));
        data.add(new play("What is Lorem Ipsum?"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Play_Adapter(data, getApplicationContext()));
        recyclerView=findViewById(R.id.search_recycler);
        recyclerView.setAdapter(new frqadapter());


        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar6);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("How to play");
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