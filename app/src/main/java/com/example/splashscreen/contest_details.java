package com.example.splashscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class contest_details extends AppCompatActivity {
    Dialog dialog;
    TextView textView;
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contest_details);
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
        start = findViewById(R.id.quiz);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent start = new Intent(contest_details.this, start_quiz.class);
                startActivity(start);
            }
        });

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.contest_tool);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Contest Details");
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