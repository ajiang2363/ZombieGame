package com.example.zombiegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class P5 extends AppCompatActivity {
    private Button D3;
    private Button C7;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice4);

        D3 = (Button)findViewById(R.id.D3);
        C7 = (Button)findViewById(R.id.C7);

        D3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice1();
            }
        });

    }

    public void choice1(){
        Intent intent = new Intent(this, P8.class);
        startActivity(intent);
    }

}
