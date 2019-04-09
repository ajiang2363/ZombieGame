package com.example.zombiegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class P17 extends AppCompatActivity {

    private Button meme;
    private Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victory1);
        meme = (Button) findViewById(R.id.meme1);
        home = (Button) findViewById(R.id.HV1);

        meme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redMeme1();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redHome();
            }
        });
    }

    public void redMeme1(){
        Intent intent = new Intent(this,prizememe1.class);
        startActivity(intent);
    }

    public void redHome(){
        Intent intent = new Intent(this,PIntro.class);
        startActivity(intent);
    }

}
