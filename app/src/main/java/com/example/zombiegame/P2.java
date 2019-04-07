package com.example.zombiegame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
    }
}
