package com.example.wav9.caers;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private Counter counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_result);

        counter = getIntent().getParcelableExtra("counter");
        TextView result = findViewById(R.id.textViewResult);
        result.setText(findResultText());
    }

    private int findResultText(){
        String result = calculateResult();

        if (result.equals("ESFP"))
            return R.string.ESFP;
        else if (result.equals("ISFP"))
            return R.string.ISFP;
        else if (result.equals("ESTP"))
            return R.string.ESTP;
        else if (result.equals("ISTP"))
            return R.string.ISTP;
        else if (result.equals("ESFJ"))
            return R.string.ESFJ;
        else if (result.equals("ISFJ"))
            return R.string.ISFJ;
        else if (result.equals("ESTJ"))
            return R.string.ESTJ;
        else if (result.equals("ISTJ"))
            return R.string.ISTJ;
        else if (result.equals("ENFJ"))
            return R.string.ENFJ;
        else if (result.equals("INFJ"))
            return R.string.INFJ;
        else if (result.equals("ENFP"))
            return R.string.ENFP;
        else if (result.equals("INFP"))
            return R.string.INFP;
        else if (result.equals("ENTJ"))
            return R.string.ENTJ;
        else if (result.equals("INTJ"))
            return R.string.INTJ;
        else if (result.equals("ENTP"))
            return R.string.ENTP;
        else if (result.equals("INTP"))
            return R.string.INTP;
        else return 0;
    }

    private String calculateResult(){
        String letter1, letter2, letter3, letter4;
        if (counter.getCountE() > counter.getCountI())
            letter1 = "E";
        else
            letter1 = "I";
        if (counter.getCountS() > counter.getCountN())
            letter2 = "S";
        else
            letter2 = "N";
        if (counter.getCountT() > counter.getCountF())
            letter3 = "T";
        else
            letter3 = "F";
        if (counter.getCountJ() > counter.getCountP())
            letter4 = "J";
        else
            letter4 = "P";
        return letter1 + letter2 + letter3 + letter4;
    }

    public void mainPage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
