package com.example.splashscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class start_quiz extends AppCompatActivity implements View.OnClickListener {
    TextView totalques;
    TextView question;
    RadioButton opt1, opt2, opt3, opt4;
    Button next;

    int score = 0;
    int totalquestion = Question_answer.question.length;
    int currentquestion = 0;
    String selectedanswer = "";
    private CountDownTimer timer;
    private long timeLeftInMillis; // The time left in milliseconds
    private final long COUNTDOWN_INTERVAL = 1000; // 1 second interval
    private final long TOTAL_TIME = 60000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);

        totalques = findViewById(R.id.total_ques);
        question = findViewById(R.id.ques);
        opt1 = findViewById(R.id.option1);
        opt2 = findViewById(R.id.option2);
        opt3 = findViewById(R.id.option3);
        opt4 = findViewById(R.id.option4);
        next = findViewById(R.id.next);

        opt1.setOnClickListener(this);
        opt2.setOnClickListener(this);
        opt3.setOnClickListener(this);
        opt4.setOnClickListener(this);
        next.setOnClickListener(this);

        totalques.setText("Total Questions : " + totalquestion);

        loadNewQuestion();
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.play_tool);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Lets Play");
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        timeLeftInMillis = TOTAL_TIME;

        // Start the countdown timer
        startCountdownTimer();

    }
    private void startCountdownTimer() {
        timer = new CountDownTimer(timeLeftInMillis, COUNTDOWN_INTERVAL) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
                updateCountdownUI();
            }

            @Override
            public void onFinish() {
                timeLeftInMillis = 0;
                updateCountdownUI();
                finishQuiz(); // Call the finishQuiz method when the timer finishes.
            }
        };

        timer.start();
    }

    private void updateCountdownUI() {
        // Update the TextView to display the remaining time.
        // Convert milliseconds to minutes and seconds as needed.
        int seconds = (int) (timeLeftInMillis / 1000);
        int minutes = seconds / 60;
        seconds = seconds % 60;
        String timeFormatted = String.format("%02d:%02d", minutes, seconds);

        TextView textViewCountdown = findViewById(R.id.textViewCountdown);
        textViewCountdown.setText(timeFormatted);
    }




    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View view) {


        Button clickedbutton = (Button) view;
        if (clickedbutton.getId() == R.id.next) {
            currentquestion++;
            loadNewQuestion();

        } else {
            selectedanswer = clickedbutton.getText().toString();

        }

    }

    void loadNewQuestion() {
        if (currentquestion == totalquestion) {
            finishQuiz();
            return;
        }
        question.setText(Question_answer.question[currentquestion]);
        opt1.setText(Question_answer.choices[currentquestion][0]);
        opt2.setText(Question_answer.choices[currentquestion][1]);
        opt3.setText(Question_answer.choices[currentquestion][2]);
        opt4.setText(Question_answer.choices[currentquestion][3]);

    }

    void finishQuiz() {
        if (timer != null) {
            timer.cancel();
        }
        // Calculate the score based on the selected answers
        for (int i = 0; i < totalquestion; i++) {
            if (selectedanswer.equals(Question_answer.correctAnswer[i])) {
                score++;
            }
        }

        // Create an Intent to navigate back to the MainActivity (home page)
        Intent intent = new Intent(start_quiz.this, contest_details.class);

        // You can pass the score data to the MainActivity if needed
        // For example, you can use intent.putExtra("SCORE", score); to pass the score data.

        // Start the MainActivity and clear all other activities on top of it
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

        // Finish the current activity (start_quiz) so that when the user presses the back button,
        // they won't

    }
}