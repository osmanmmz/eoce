package com.example.mmz.englishofcivilengineering;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import static android.graphics.Color.*;
import static android.graphics.Color.GREEN;

public class test_page extends AppCompatActivity {
    Button a3;
    Button buttonNext;
    Button b;
    Button b1;
    Button b2;
    Button b3;
    String A2;
    String B2;
    String C2;
    String D2;
    String ans;
    String que;
    TextView t;
    int score;
    TextView s;
    GLOBALS sglobal;
    String Score;
    //SharedPreferences sp;
    //SharedPreferences.Editor edt;
    //private String SCORE_KEY="com.example.mmz.englishofcivilengineering.sharedpreferences.SCORE";
    //private String MAIN_KEY="com.example.mmz.englishofcivilengineering.sharedpreferences.MAIN_DATA";

//-------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_page);
        a3= (Button) findViewById(R.id.button7);
        buttonNext= (Button) findViewById(R.id.buttonNext);
        b=  (Button) findViewById(R.id.button);
        b1= (Button) findViewById(R.id.button3);
        b2= (Button) findViewById(R.id.button4);
        b3= (Button) findViewById(R.id.button5);
        t= (TextView) findViewById(R.id.tv_que);
        s=(TextView) findViewById(R.id.tv_score);
        //sp=getSharedPreferences(MAIN_KEY,MODE_PRIVATE);
        //score=getSharedPreferences(MAIN_KEY,MODE_PRIVATE).getInt(SCORE_KEY,0);
        Intent i= getIntent();
        Score= i.getStringExtra("score");
        score = Integer.parseInt(Score);//.replaceAll("[\\D]","")
        s.setText("SCORE:"+score);
        buttonNext.setEnabled(false);

        a3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                final String Score=Integer.toString(score);
                Intent intocan3= new Intent(test_page.this,add_page_back.class);
                intocan3.putExtra("score",Score);

                startActivity(intocan3);
            }
        });
        buttonNext.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intocan4= new Intent(test_page.this,add_page.class);
                intocan4.putExtra("score",String.valueOf(score));
                startActivity(intocan4);
            }
        });
        //-----------------test soru ve cevaplar-----------------
        String [] A={"beam","column","sought","bind","solid mass","assyrians","babylonians","clay","lime","gypsum","mortar","monumental","foundations","slaked lime","capable"};
        String [] B={"kiriş","kolon","aranan","bağlama","katı kütle","asurlular","babiller","kil","kireç","kireç taşı","harç","tarihi","temel","sönmüş kireç","yeteneği olabilme",};
        Random r = new Random();

        int g=r.nextInt(15);
        que=A[g];
        ans=B[g];
        int g1=r.nextInt(15);
        String A1=B[g1];
        int g2=r.nextInt(15);
        String B1=B[g2];
        int g3=r.nextInt(15);
        String C1=B[g3];
        String D1=B[g];
        if(B1==C1 | A1==C1|B1==A1|B1==D1|A1==D1|C1==D1){
            do{
                g1=r.nextInt(15);
                A1=B[g1];
                g2=r.nextInt(15);
                B1=B[g2];
                g3=r.nextInt(15);
                C1=B[g3];
            }while(B1==C1|A1==C1|B1==A1|B1==D1|A1==D1|C1==D1);
        }
        String [] Options={A1,B1,C1,D1};
        int g4=r.nextInt(4);
        A2=Options[g4];
        int g5=r.nextInt(4);
        B2=Options[g5];
        int g6=r.nextInt(4);
        C2=Options[g6];
        int g7=r.nextInt(4);
        D2=Options[g7];
        if(B2==C2 | A2==C2|B2==A2|B2==D2|A2==D2|C2==D2){
            do{
                g5=r.nextInt(4);
                B2=Options[g5];
                g6=r.nextInt(4);
                C2=Options[g6];
                g7=r.nextInt(4);
                D2=Options[g7];
            }while(B2==C2|A2==C2|B2==A2|B2==D2|A2==D2|C2==D2);
        }
        //----------test soru ve cevaplar son---------
        t.setText(que);
        b.setText(A2);
        b1.setText(B2);
        b2.setText(C2);
        b3.setText(D2);
//----------------clicks-----------------------
        b.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonNext.setEnabled(true);
                if(b.getText()==ans){
                    b.setBackgroundColor(GREEN);
                    score++;

                    s.setText("SCORE:"+score);
                }
                else{
                    if (b1.getText()==ans){
                        b1.setBackgroundColor(GREEN);
                    }
                    if (b2.getText()==ans){
                        b2.setBackgroundColor(GREEN);
                    }
                    if (b3.getText()==ans){
                        b3.setBackgroundColor(GREEN);
                    }
                    b.setBackgroundColor(RED);
                }
                b.setEnabled(false);
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
            }
        });
        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonNext.setEnabled(true);
                if(b1.getText()==ans){
                    b1.setBackgroundColor(GREEN);
                    score++;

                    s.setText("SCORE:"+score);
                }
                else{
                    if (b.getText()==ans){
                        b.setBackgroundColor(GREEN);
                    }
                    if (b2.getText()==ans){
                        b2.setBackgroundColor(GREEN);
                    }
                    if (b3.getText()==ans){
                        b3.setBackgroundColor(GREEN);
                    }
                    b1.setBackgroundColor(RED);
                }
                b.setEnabled(false);
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
            }
        });
        b2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonNext.setEnabled(true);
                if(b2.getText()==ans){
                    b2.setBackgroundColor(GREEN);
                    score++;

                    s.setText("SCORE:"+score);
                }
                else{
                    if (b.getText()==ans){
                        b.setBackgroundColor(GREEN);
                    }
                    if (b1.getText()==ans){
                        b1.setBackgroundColor(GREEN);
                    }
                    if (b3.getText()==ans){
                        b3.setBackgroundColor(GREEN);
                    }
                    b2.setBackgroundColor(RED);
                }
                b.setEnabled(false);
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
            }
        });
        b3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonNext.setEnabled(true);
                if(b3.getText()==ans){
                    b3.setBackgroundColor(GREEN);
                    score++;

                    s.setText("SCORE:"+score);
                }
                else{
                    if (b.getText()==ans){
                        b.setBackgroundColor(GREEN);
                    }
                    if (b2.getText()==ans){
                        b2.setBackgroundColor(GREEN);
                    }
                    if (b1.getText()==ans){
                        b1.setBackgroundColor(GREEN);
                    }
                    b3.setBackgroundColor(RED);
                }
                b.setEnabled(false);
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
            }
        });
//---------------clicks end----------------------------------
        //edt.putInt(SCORE_KEY,score);
        //edt.commit();
    }//------main end-----
}
