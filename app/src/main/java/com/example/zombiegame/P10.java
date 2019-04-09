package com.example.zombiegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class P10 extends AppCompatActivity {

    private Button C11;
    private Button C12;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice6);
        C11 = (Button) findViewById(R.id.C11);
        C12 = (Button) findViewById(R.id.C12);

        C12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice2();
            }
        });
    }

    public void choice2(){
        Intent intent = new Intent(this, P12.class);
        startActivity(intent);
    }
}
