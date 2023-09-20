package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.splashscreen.Adapter.SlideViewpagerAdapter;

public class SlideActivity extends AppCompatActivity {
    ViewPager viewPager;
    SlideViewpagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);

        viewPager = findViewById(R.id.viewpager);
        adapter = new SlideViewpagerAdapter(this);
        viewPager.setAdapter(adapter);

    }
}