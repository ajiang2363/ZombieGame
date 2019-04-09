package com.example.zombiegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class P16 extends AppCompatActivity {

    private Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_death5);
        home = (Button) findViewById(R.id.H5);
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
