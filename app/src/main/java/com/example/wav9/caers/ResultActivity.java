package com.example.wav9.caers;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private Counter counter;

    private String result;

    private TextView tvResultName;

    private TextView tvResultDisc;

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_result);

        counter = getIntent().getParcelableExtra("counter");
        result = calculateResult();

        tvResultName = findViewById(R.id.result_name_textView);
        String resultNameString = getResources().getString(R.string.your_type) + getResources().getString(getResultName());
        tvResultName.setText(resultNameString);

        tvResultDisc = findViewById(R.id.result_disc_textView);
        tvResultDisc.setText(getResultDiscription());

        imageView = (ImageView) findViewById(R.id.result_image);
        imageView.setImageResource(getResultImage());
    }

    private int getResultName() {
        if (result.equals("ESFP"))
            return R.string.ESFP_name;
        else if (result.equals("ISFP"))
            return R.string.ISFP_name;
        else if (result.equals("ESTP"))
            return R.string.ESTP_name;
        else if (result.equals("ISTP"))
            return R.string.ISTP_name;
        else if (result.equals("ESFJ"))
            return R.string.ESFJ_name;
        else if (result.equals("ISFJ"))
            return R.string.ISFJ_name;
        else if (result.equals("ESTJ"))
            return R.string.ESTJ_name;
        else if (result.equals("ISTJ"))
            return R.string.ISTJ_name;
        else if (result.equals("ENFJ"))
            return R.string.ENFJ_name;
        else if (result.equals("INFJ"))
            return R.string.INFJ_name;
        else if (result.equals("ENFP"))
            return R.string.ENFP_name;
        else if (result.equals("INFP"))
            return R.string.INFP_name;
        else if (result.equals("ENTJ"))
            return R.string.ENTJ_name;
        else if (result.equals("INTJ"))
            return R.string.INTJ_name;
        else if (result.equals("ENTP"))
            return R.string.ENTP_name;
        else if (result.equals("INTP"))
            return R.string.INTP_name;
        else return 0;
    }

    private int getResultDiscription() {

        if (result.equals("ESFP"))
            return R.string.ESFP_disc;
        else if (result.equals("ISFP"))
            return R.string.ISFP_disc;
        else if (result.equals("ESTP"))
            return R.string.ESTP_disc;
        else if (result.equals("ISTP"))
            return R.string.ISTP_disc;
        else if (result.equals("ESFJ"))
            return R.string.ESFJ_disc;
        else if (result.equals("ISFJ"))
            return R.string.ISFJ_disc;
        else if (result.equals("ESTJ"))
            return R.string.ESTJ_disc;
        else if (result.equals("ISTJ"))
            return R.string.ISTJ_disc;
        else if (result.equals("ENFJ"))
            return R.string.ENFJ_disc;
        else if (result.equals("INFJ"))
            return R.string.INFJ_disc;
        else if (result.equals("ENFP"))
            return R.string.ENFP_disc;
        else if (result.equals("INFP"))
            return R.string.INFP_disc;
        else if (result.equals("ENTJ"))
            return R.string.ENTJ_disc;
        else if (result.equals("INTJ"))
            return R.string.INTJ_disc;
        else if (result.equals("ENTP"))
            return R.string.ENTP_disc;
        else if (result.equals("INTP"))
            return R.string.INTP_disc;
        else return 0;
    }

    private int getResultImage() {
        if (result.equals("ESFP"))
            return R.drawable.esfp;
        else if (result.equals("ISFP"))
            return R.drawable.isfp;
        else if (result.equals("ESTP"))
            return R.drawable.estp;
        else if (result.equals("ISTP"))
            return R.drawable.istp;
        else if (result.equals("ESFJ"))
            return R.drawable.esfj;
        else if (result.equals("ISFJ"))
            return R.drawable.isfj;
        else if (result.equals("ESTJ"))
            return R.drawable.estj;
        else if (result.equals("ISTJ"))
            return R.drawable.istj;
        else if (result.equals("ENFJ"))
            return R.drawable.enfj;
        else if (result.equals("INFJ"))
            return R.drawable.infj;
        else if (result.equals("ENFP"))
            return R.drawable.enfp;
        else if (result.equals("INFP"))
            return R.drawable.infp;
        else if (result.equals("ENTJ"))
            return R.drawable.entj;
        else if (result.equals("INTJ"))
            return R.drawable.intj;
        else if (result.equals("ENTP"))
            return R.drawable.entp;
        else if (result.equals("INTP"))
            return R.drawable.intp;
        else return R.drawable.entj;
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
        finish();
    }
}
