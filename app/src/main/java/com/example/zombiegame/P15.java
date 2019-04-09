package com.example.zombiegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class P15 extends AppCompatActivity {

    private Button C17;
    private Button C18;
    private Button C19;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice9);
        C17 = (Button) findViewById(R.id.C17);
        C18 = (Button) findViewById(R.id.C18);
        C19 = (Button) findViewById(R.id.C19);

        C17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice1();
            }
        });
    }

    public void choice1(){
        Intent intent = new Intent(this,P17.class);
        startActivity(intent);
    }

}
