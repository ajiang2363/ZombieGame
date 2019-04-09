package com.example.zombiegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class P12 extends AppCompatActivity {

    private Button C13;
    private Button C14;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice7);
        C13 = (Button) findViewById(R.id.C13);
        C14 = (Button) findViewById(R.id.C14);

        C13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice();
            }
        });

        C14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice();
            }
        });
    }

    public void choice(){
        Intent intent = new Intent(this,P12food.class);
        startActivity(intent);
    }

}
