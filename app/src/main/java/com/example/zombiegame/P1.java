package com.example.zombiegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class P1 extends AppCompatActivity {

    private Button C5;
    private Button C6;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice3);
        C5 = (Button)findViewById(R.id.C5);
        C6 = (Button)findViewById(R.id.C6);

        C5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice1();
            }
        });

        C6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice2();
            }
        });
    }

    public void choice1(){
        Intent intent = new Intent(this,P5.class);
        startActivity(intent);
    }
    public void choice2(){
        Intent intent = new Intent(this, P7.class);
        startActivity(intent);
    }
}
