package com.example.wav9.caers;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class TestActivity extends AppCompatActivity {

    // список вопросов
    private ArrayList<Question> questions;
    private Counter counter;

    private TextView questionNumberText, questionText;
    private Button answerText1, answerText2;
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_test);
        questions = Questions.getQuestions();
        counter = new Counter();

        questionNumberText = findViewById(R.id.textViewQuestionNumber);
        questionText = findViewById(R.id.textViewQuestion);
        answerText1 = findViewById(R.id.buttonAnswer1);
        answerText2 = findViewById(R.id.buttonAnswer2);

        updateText();
    }

    public void answer1(View view) {
        increaseCounter(questions.get(index).getAnswers()[0].getAnswerCategory().toString());
        index++;
        if (index == questions.size()) {
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("counter", counter);
            startActivity(intent);
        } else
            updateText();
    }

    public void answer2(View view) {
        increaseCounter(questions.get(index).getAnswers()[1].getAnswerCategory().toString());
        index++;
        if (index == questions.size()) {
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("counter", counter);
            startActivity(intent);
        } else
            updateText();
    }

    private void updateText() {
        questionNumberText.setText("Вопрос " + (index + 1) + "/70");
        questionText.setText(questions.get(index).getDescription());
        answerText1.setText(questions.get(index).getAnswers()[0].getDescription());
        answerText2.setText(questions.get(index).getAnswers()[1].getDescription());
    }

    private void increaseCounter(String ch) {
        switch (ch) {
            case "E":
                counter.increaseE();
                break;
            case "I":
                counter.increaseI();
                break;
            case "S":
                counter.increaseS();
                break;
            case "N":
                counter.increaseN();
                break;
            case "T":
                counter.increaseT();
                break;
            case "F":
                counter.increaseF();
                break;
            case "J":
                counter.increaseJ();
                break;
            case "P":
                counter.increaseP();
                break;
        }
    }

}
