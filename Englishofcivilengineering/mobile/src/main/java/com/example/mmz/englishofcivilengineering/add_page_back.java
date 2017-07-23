package com.example.mmz.englishofcivilengineering;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class add_page_back extends AppCompatActivity {
    Button a2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_page);
        a2= (Button) findViewById(R.id.button2);
        a2.setOnClickListener(new OnClickListener() {
            @Override
           public void onClick(View view) {
                Intent intocan4= new Intent(add_page_back.this, welcome.class);
                startActivity(intocan4);
            }
        });
    }
}
