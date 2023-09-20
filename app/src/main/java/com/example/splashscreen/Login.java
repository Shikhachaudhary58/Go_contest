package com.example.splashscreen;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.FirebaseTooManyRequestsException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthMissingActivityForRecaptchaException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class Login extends AppCompatActivity {
    TextView txt,txt1,txt2;
    EditText number;
    Button cont;
    ProgressBar progressBar;
    private PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        number = findViewById(R.id.editTextTextPhoneNumber);
        progressBar = findViewById(R.id.progress);
        TextView textView = findViewById(R.id.text_view1);
        TextView textView1 = findViewById(R.id.text);
        TextView textView2 = findViewById(R.id.text_view3);
        String text = "Terms and Conditions";
        String text1 = "Have a referral code?";
        String text3= "Privacy policy";
        SpannableString s = new SpannableString(text);
        SpannableString s1 = new SpannableString(text1);
        SpannableString s2 = new SpannableString(text3);

        ClickableSpan clickableSpan1= new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Toast.makeText(Login.this, "Term and Conditions", Toast.LENGTH_SHORT).show();
            }
        };
        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Toast.makeText(Login.this, "Privacy policy", Toast.LENGTH_SHORT).show();
            }
        };
        ClickableSpan clickableSpan= new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Toast.makeText(Login.this, "Referral code", Toast.LENGTH_SHORT).show();
            }
        };

        s.setSpan(clickableSpan1,0, 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        s2.setSpan(clickableSpan2, 0,14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        s1.setSpan(clickableSpan,0,21,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(s);
        textView1.setText(s1);
        textView2.setText(s2);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView1.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setMovementMethod(LinkMovementMethod.getInstance());

        txt = findViewById(R.id.text);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent txt1 = new Intent(Login.this, Referral.class);
                startActivity(txt1);
            }
        });

        cont = findViewById(R.id.ctn);
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!number.getText().toString().trim().isEmpty()){
                    if((number.getText().toString().trim()).length() == 10){
                        progressBar.setVisibility(View.VISIBLE);
                        cont.setVisibility(View.INVISIBLE);
                        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                                "+91" + number.getText().toString(),
                                60, TimeUnit.SECONDS, Login.this,
                                new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                                    @Override
                                    public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
                                        progressBar.setVisibility(View.GONE);
                                        cont.setVisibility(View.VISIBLE);
                                    }

                                    @Override
                                    public void onVerificationFailed(@NonNull FirebaseException e) {
                                        progressBar.setVisibility(View.GONE);
                                        cont.setVisibility(View.VISIBLE);
                                        Toast.makeText(Login.this,"Verification Failed", Toast.LENGTH_SHORT).show();
                                    }

                                    @Override
                                    public void onCodeSent(@NonNull String s, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                                        progressBar.setVisibility(View.GONE);
                                        cont.setVisibility(View.VISIBLE);
                                        Intent cont = new Intent(getApplicationContext(), otp.class);
                                        cont.putExtra("mobile", number.getText().toString());
                                        cont.putExtra("backendOtp", s);
                                        startActivity(cont);
                                    }
                                });
                    }
                    else {
                        Toast.makeText(Login.this,"Please Enter Valid number", Toast.LENGTH_SHORT).show();
                    }}
                else {
                    Toast.makeText(Login.this,"Enter Mobile Number", Toast.LENGTH_SHORT).show();
                    }
                }
        });

        txt1=findViewById(R.id.text_view1);
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent terms= new Intent(Login.this, term_and_condition.class);
                startActivity(terms);
            }
        });

        txt2=findViewById(R.id.text_view3);
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent privacy = new Intent(Login.this, privacy_policy.class);
                startActivity(privacy);
            }
        });
    }

}