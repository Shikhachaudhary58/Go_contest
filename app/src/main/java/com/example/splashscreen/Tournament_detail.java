package com.example.splashscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Tournament_detail extends AppCompatActivity {
    TextView textView;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tournament_detail);
        textView = findViewById(R.id.txt5);
        String txt = "View Rank Breakup";
        SpannableString s =new SpannableString(txt);

        ClickableSpan clickableSpan5= new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
            }
        };

        s.setSpan(clickableSpan5, 0, 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(s);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        dialog = new Dialog(this);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.setContentView(R.layout.popup1);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.tournament);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Tournament Details");
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