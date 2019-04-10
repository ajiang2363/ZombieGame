package com.example.zombiegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class autoInput extends AppCompatActivity {

    private Button choice1;
    private Button choice2;
    private Button choice3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_input);
        choice1 = (Button)findViewById(R.id.choice1);
        choice2 = (Button)findViewById(R.id.choice2);
        choice3 = (Button)findViewById(R.id.choice3);

    }

    public void handleChoice1(View view){
        TextView textView = findViewById(R.id.storyLine);
        textView.setText("blah blah blah");

    }

}
