package com.example.zombiegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class P0 extends AppCompatActivity {

    private Button C2;
    private Button C3;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice1);
        C2 = (Button)findViewById(R.id.C2);
        C3 = (Button)findViewById(R.id.C1);

        C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice1();
            }
        });

        C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice2();
            }
        });
    }

    public void choice1(){
        Intent intent = new Intent(this, P2.class);
        startActivity(intent);
    }

    public void choice2(){
        Intent intent = new Intent(this, P1.class);
        startActivity(intent);
    }

}
