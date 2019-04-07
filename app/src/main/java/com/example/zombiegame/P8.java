package com.example.zombiegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class P8 extends AppCompatActivity {

    Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_death3);
        home = (Button) findViewById(R.id.H3);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redHome();
            }
        });

    }

    public void redHome(){
        Intent intent = new Intent(this, PIntro.class);
        startActivity(intent);
    }

}
