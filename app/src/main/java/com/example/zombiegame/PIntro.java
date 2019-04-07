package com.example.zombiegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PIntro extends AppCompatActivity {

    private Button start;
    private Button info;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        start = (Button)findViewById(R.id.button);
        info = (Button)findViewById(R.id.button2);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startgame();
            }
        });
    }

    public void startgame(){
        Intent intent = new Intent(this, P1.class);
        startActivity(intent);
    }
}
