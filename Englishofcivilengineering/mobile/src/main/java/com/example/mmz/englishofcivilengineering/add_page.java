package com.example.mmz.englishofcivilengineering;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class add_page extends AppCompatActivity {
    Button a2;
    int a=0;
    String b;
    TextView s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_page);
        s=(TextView) findViewById(R.id.textView3);
        a2= (Button) findViewById(R.id.button2);
        Intent f =getIntent();
        final String x=f.getStringExtra("score");
        //i.getStringExtra("score")
        s.setText(x);
        String y="osman25";
        a=Integer.parseInt(y.replaceAll("[\\D]",""));
        //.replaceAll("[\\D]","")
        final String b = Integer.toString(a);


        a2.setOnClickListener(new OnClickListener() {
            @Override
           public void onClick(View view) {
                Intent intocan2= new Intent(add_page.this, test_page.class);
                intocan2.putExtra("score",x);
                startActivity(intocan2);
            }
        });
    }
}
