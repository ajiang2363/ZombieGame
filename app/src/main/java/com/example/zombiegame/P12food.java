package com.example.zombiegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class P12food extends AppCompatActivity {

    private Button C15;
    private Button C16;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice8);
        C15 = (Button) findViewById(R.id.C15);
        C16 = (Button) findViewById(R.id.C16);

        C15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice1();
            }
        });
        C16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice2();
            }
        });

    }

    public void choice1(){
        Intent intent = new Intent(this, P15.class);
        startActivity(intent);
    }
    public void choice2(){
        Intent intent = new Intent(this, P16.class);
        startActivity(intent);
    }

}
