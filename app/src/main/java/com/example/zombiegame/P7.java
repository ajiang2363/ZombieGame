package com.example.zombiegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class P7 extends AppCompatActivity {

    private Button C10;
    private Button D4;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice5);
        C10 = (Button)findViewById(R.id.C10);
        D4 = (Button)findViewById(R.id.D4);

        C10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice1();
            }
        });
        D4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice2();
            }
        });


    }

    public void choice1(){
        Intent intent = new Intent(this, P10.class);
        startActivity(intent);
    }
    public void choice2(){
        Intent intent = new Intent(this, P9.class);
        startActivity(intent);
    }

}
