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

import org.w3c.dom.Text;

public class mywallet extends AppCompatActivity {
    TextView textview1;
    Dialog mDialog;
    Button cancel, cnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mywallet);
        TextView txt = findViewById(R.id.wallet);
        String str = "View Wallet Balance";
        SpannableString W = new SpannableString(str);

        ClickableSpan Span1= new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Toast.makeText(mywallet.this, "Wallet Balance", Toast.LENGTH_SHORT).show();
            }
        };

        W.setSpan(Span1, 0, 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        txt.setText(W);
        txt.setMovementMethod(LinkMovementMethod.getInstance());


        textview1 = findViewById(R.id.wallet);
        mDialog = new Dialog(this);
        cancel = mDialog.findViewById(R.id.wb1);

        textview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog.setContentView(R.layout.popup);
                mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                mDialog.show();

            }
        });
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.wallet_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("My Wallet");
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