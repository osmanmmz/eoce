package com.example.mmz.englishofcivilengineering;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class welcome extends AppCompatActivity {
    Button a;
    String b="0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        a= (Button) findViewById(R.id.b_start);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intocan= new Intent(welcome.this,add_page.class);
                intocan.putExtra("score",b);
                startActivity(intocan);
            }
        });
        }


}
