package com.example.splashscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import com.example.splashscreen.Adapter.NotificationAdapter;

public class Notification extends AppCompatActivity {
    RecyclerView recyclerView;
    NotificationAdapter notificationAdapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        recyclerView = findViewById(R.id.notification_rec);
        List<notification1> items = new ArrayList<>();
        items.add(new notification1("New game play", "10-06-2023  11:20 PM", "10-06-2023  11:20 PM",R.drawable.ic_baseline_horizontal_rule_24));
        items.add(new notification1("New game play", "10-06-2023  11:20 PM", "10-06-2023  11:20 PM",R.drawable.ic_baseline_horizontal_rule_24));
        items.add(new notification1("New game play", "10-06-2023  11:20 PM", "10-06-2023  11:20 PM",R.drawable.ic_baseline_horizontal_rule_24));
        items.add(new notification1("New game play", "10-06-2023  11:20 PM", "10-06-2023  11:20 PM",R.drawable.ic_baseline_horizontal_rule_24));
        items.add(new notification1("New game play", "10-06-2023  11:20 PM", "10-06-2023  11:20 PM",R.drawable.ic_baseline_horizontal_rule_24));
        items.add(new notification1("New game play", "10-06-2023  11:20 PM", "10-06-2023  11:20 PM",R.drawable.ic_baseline_horizontal_rule_24));
        items.add(new notification1("New game play", "10-06-2023  11:20 PM", "10-06-2023  11:20 PM",R.drawable.ic_baseline_horizontal_rule_24));
        items.add(new notification1("New game play", "10-06-2023  11:20 PM", "10-06-2023  11:20 PM",R.drawable.ic_baseline_horizontal_rule_24));
        items.add(new notification1("New game play", "10-06-2023  11:20 PM", "10-06-2023  11:20 PM",R.drawable.ic_baseline_horizontal_rule_24));
        items.add(new notification1("New game play", "10-06-2023  11:20 PM", "10-06-2023  11:20 PM",R.drawable.ic_baseline_horizontal_rule_24));
        items.add(new notification1("New game play", "10-06-2023  11:20 PM", "10-06-2023  11:20 PM",R.drawable.ic_baseline_horizontal_rule_24));
        items.add(new notification1("New game play", "10-06-2023  11:20 PM", "10-06-2023  11:20 PM",R.drawable.ic_baseline_horizontal_rule_24));
        items.add(new notification1("New game play", "10-06-2023  11:20 PM", "10-06-2023  11:20 PM",R.drawable.ic_baseline_horizontal_rule_24));
        items.add(new notification1("New game play", "10-06-2023  11:20 PM", "10-06-2023  11:20 PM",R.drawable.ic_baseline_horizontal_rule_24));
        items.add(new notification1("New game play", "10-06-2023  11:20 PM", "10-06-2023  11:20 PM",R.drawable.ic_baseline_horizontal_rule_24));
        items.add(new notification1("New game play", "10-06-2023  11:20 PM", "10-06-2023  11:20 PM",R.drawable.ic_baseline_horizontal_rule_24));
        items.add(new notification1("New game play", "10-06-2023  11:20 PM", "10-06-2023  11:20 PM",R.drawable.ic_baseline_horizontal_rule_24));
        items.add(new notification1("New game play", "10-06-2023  11:20 PM", "10-06-2023  11:20 PM",R.drawable.ic_baseline_horizontal_rule_24));
        items.add(new notification1("New game play", "10-06-2023  11:20 PM", "10-06-2023  11:20 PM",R.drawable.ic_baseline_horizontal_rule_24));
        items.add(new notification1("New game play", "10-06-2023  11:20 PM", "10-06-2023  11:20 PM",R.drawable.ic_baseline_horizontal_rule_24));
        items.add(new notification1("New game play", "10-06-2023  11:20 PM", "10-06-2023  11:20 PM",R.drawable.ic_baseline_horizontal_rule_24));
        items.add(new notification1("New game play", "10-06-2023  11:20 PM", "10-06-2023  11:20 PM",R.drawable.ic_baseline_horizontal_rule_24));
        items.add(new notification1("New game play", "10-06-2023  11:20 PM", "10-06-2023  11:20 PM",R.drawable.ic_baseline_horizontal_rule_24));
        items.add(new notification1("New game play", "10-06-2023  11:20 PM", "10-06-2023  11:20 PM",R.drawable.ic_baseline_horizontal_rule_24));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new NotificationAdapter(getApplicationContext(),items));
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.notify);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Notification");
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