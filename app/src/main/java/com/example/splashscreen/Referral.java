package com.example.splashscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Referral extends AppCompatActivity {
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referral);
        TextView textView = findViewById(R.id.text_view1);
        TextView textView1 = findViewById(R.id.text_view3);
        String text = "Terms and Conditions";
        String text1 = "Privacy policy";
        SpannableString s = new SpannableString(text);
        SpannableString s1 = new SpannableString(text1);

        ClickableSpan clickableSpan1= new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Toast.makeText(Referral.this, "Terms and Conditions", Toast.LENGTH_SHORT).show();
            }
        };
        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Toast.makeText(Referral.this, "Privacy policy", Toast.LENGTH_SHORT).show();
            }
        };


        s.setSpan(clickableSpan1,0, 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        s1.setSpan(clickableSpan2, 0,14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(s);
        textView1.setText(s1);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView1.setMovementMethod(LinkMovementMethod.getInstance());

        t1 = findViewById(R.id.text_view1);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent term = new Intent(Referral.this, term_and_condition.class);
                startActivity(term);
            }
        });

        t2 = findViewById(R.id.text_view3);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent privacy = new Intent(Referral.this, privacy_policy.class);
                startActivity(privacy);
            }
        });
    }

}
