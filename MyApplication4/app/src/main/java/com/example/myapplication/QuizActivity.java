package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {
    RadioGroup result;
    TextView question;
    int score=0;
    String[] setchoice = new String[3];
    RadioButton answer,q1,q2,q3;
    Button apply;
    int n=0,c=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        q1 = (RadioButton) findViewById(R.id.question1);
        q2 = (RadioButton) findViewById(R.id.question2);
        q3 = (RadioButton) findViewById(R.id.question3);
        result = (RadioGroup) findViewById(R.id.radioGroup);
        apply = (Button) findViewById(R.id.apply);
        question = (TextView) findViewById(R.id.question);
        question.setText(question(n));
        setchoice = choice(c);
        q1.setText(setchoice[0]);
        q2.setText(setchoice[1]);
        q3.setText(setchoice[2]);

        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id;
                if (checkAns(answer.getText().toString(),n)){
                    score++;
                }
                n++;
                c++;
                setchoice = choice(c);
                q1.setText(setchoice[0]);
                q2.setText(setchoice[1]);
                q3.setText(setchoice[2]);
                question.setText(question(n));
                id = result.getCheckedRadioButtonId();
                answer = (RadioButton) findViewById(id);


            }
        });
    }
    public String[] choice (int c){
        String[] c1 = new String[20];
        String[] c2 = new String[20];
        String[] c3 = new String[20];
        String[] setc = new String[3];

//        answer 1,2,1,2,3,3,2,1,2,2,1,1,3,1,1,3,2,3,2,1
        c1[0] = "zero";
        c1[1] = "noe";
        c1[2] = "two";
        c1[3] = "thee";
        c1[4] = "for";
        c1[5] = "fine";
        c1[6] = "sick";
        c1[7] = "seven";
        c1[8] = "egg";
        c1[9] = "nye";
        c1[10] = "ten";
        c1[11] = "eleven";
        c1[12] = "twenty";
        c1[13] = "thirteen";
        c1[14] = "fourteen";
        c1[15] = "fivety";
        c1[16] = "sixty";
        c1[17] = "sewenty";
        c1[18] = "eightteen";
        c1[19] = "nineteen";

        c2[0] = "zelo";
        c2[1] = "one";
        c2[2] = "too";
        c2[3] = "three";
        c2[4] = "flow";
        c2[5] = "fift";
        c2[6] = "six";
        c2[7] = "sewen";
        c2[8] = "eight";
        c2[9] = "nine";
        c2[10] = "elefen";
        c2[11] = "zelo";
        c2[12] = "twev";
        c2[13] = "thorteen";
        c2[14] = "fourty";
        c2[15] = "fiveteen";
        c2[16] = "sixteen";
        c2[17] = "sewenteen";
        c2[18] = "eighteen";
        c2[19] = "nineteen";

        c3[0] = "zeero";
        c3[1] = "neo";
        c3[2] = "to";
        c3[3] = "tree";
        c3[4] = "four";
        c3[5] = "five";
        c3[6] = "sik";
        c3[7] = "sefen";
        c3[8] = "eigth";
        c3[9] = "ny";
        c3[10] = "tain";
        c3[11] = "elewen";
        c3[12] = "twelve";
        c3[13] = "thirty";
        c3[14] = "fourty";
        c3[15] = "fifteen";
        c3[16] = "sickty";
        c3[17] = "seventeen";
        c3[18] = "eighty";
        c3[19] = "ninteen";

        setc[0] = c1[c];
        setc[1] = c2[c];
        setc[2] = c3[c];
        return setc;

    }
    public String question (int i){
        String[] q = new String[20];
        q[0] = "Spelling number 0 is correct.";
        q[1] = "Spelling number 1 is correct.";
        q[2] = "Spelling number 2 is correct.";
        q[3] = "Spelling number 3 is correct.";
        q[4] = "Spelling number 4 is correct.";
        q[5] = "Spelling number 5 is correct.";
        q[6] = "Spelling number 6 is correct.";
        q[7] = "Spelling number 7 is correct.";
        q[8] = "Spelling number 8 is correct.";
        q[9] = "Spelling number 9 is correct.";
        q[10] = "Spelling number 10 is correct.";
        q[11] = "Spelling number 11 is correct.";
        q[12] = "Spelling number 12 is correct.";
        q[13] = "Spelling number 13 is correct.";
        q[14] = "Spelling number 14 is correct.";
        q[15] = "Spelling number 15 is correct.";
        q[16] = "Spelling number 16 is correct.";
        q[17] = "Spelling number 17 is correct.";
        q[18] = "Spelling number 18 is correct.";
        q[19] = "Spelling number 19 is correct.";
        return q[i];
    }
    public boolean checkAns(String ans,int choi){
        String[] answer = new String[20];
        answer[0] = "zero";
        answer[1] = "one";
        answer[2] = "two";
        answer[3] = "three";
        answer[4] = "four";
        answer[5] = "five";
        answer[6] = "six";
        answer[7] = "seven";
        answer[8] = "eight";
        answer[9] = "nine";
        answer[10] = "ten";
        answer[11] = "eleven";
        answer[12] = "twelve";
        answer[13] = "thirteen";
        answer[14] = "fourteen";
        answer[15] = "fifteen";
        answer[16] = "sixteen";
        answer[17] = "seventeen";
        answer[18] = "eighteen";
        answer[19] = "nineteen";

        if (ans == answer[choi]){
            return true;
        }
        else {
            return false;
        }

    }
}
