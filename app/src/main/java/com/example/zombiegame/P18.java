package com.example.zombiegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class P18 extends AppCompatActivity {

    private Button C20;
    private Button C21;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice10);
        C20 = (Button) findViewById(R.id.C20);
        C21 = (Button) findViewById(R.id.C21);

        C20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice1();
            }
        });

    }

    public void choice1(){
        Intent intent = new Intent (this, P12food.class);
        startActivity(intent);
    }
}
