package com.example.zombiegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class P2 extends AppCompatActivity {

    Button D1;
    Button D2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice2);
        D1 = (Button)findViewById(R.id.D1);
        D2= (Button)findViewById(R.id.D2);

        D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                death1();
            }
        });

        D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                death2();
            }
        });
    }

    public void death1(){
        Intent intent = new Intent(this, P3.class);
        startActivity(intent);
    }
    public void death2(){
        Intent intent = new Intent(this, P4.class);
        startActivity(intent);
    }
}
