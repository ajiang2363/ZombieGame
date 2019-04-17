package com.example.zombiegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Tree tree;
    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_input);
        this.tree = new Tree();
        Node head = tree.getStart();

        String storyLine = head.getStoryLine();
        String choice1S = head.choiceText1;
        String choice2S = head.choiceText2;
        String choice3S = head.choiceText3;

        button1 = (Button)findViewById(R.id.choice1);
        button2 = (Button)findViewById(R.id.choice2);
        button3 = (Button)findViewById(R.id.choice3);

        TextView textStory = findViewById(R.id.storyLine);
        textStory.setText(storyLine);

        button1.setText(choice1S);
        button2.setText(choice2S);
        button3.setVisibility(View.INVISIBLE);
    }

    public void choice1(View view){
        Node current = tree.getCurrent();
        Node next = current.getChoice1();

        String storyLine = next.getStoryLine();
        String choice1S = next.choiceText1;
        String choice2S = next.choiceText2;
        String choice3S = next.choiceText3;

        button1 = (Button)findViewById(R.id.choice1);
        button2 = (Button)findViewById(R.id.choice2);
        button3 = (Button)findViewById(R.id.choice3);

        TextView textStory = findViewById(R.id.storyLine);
        textStory.setText(storyLine);

        button1.setText(choice1S);
        if(choice2S == null) {
            button2.setVisibility(View.INVISIBLE);
        }
        else{
            button2.setVisibility(View.VISIBLE);
            button2.setText(choice2S);
        }
        if(choice3S == null) {
            button3.setVisibility(View.VISIBLE);
            button3.setVisibility(View.INVISIBLE);
        }
        else{
            button3.setText(choice3S);
        }
        tree.setCurrent(next);

    }

    public void choice2(View view){
        Node current = tree.getCurrent();
        Node next = current.getChoice2();

        String storyLine = next.getStoryLine();
        String choice1S = next.choiceText1;
        String choice2S = next.choiceText2;
        String choice3S = next.choiceText3;

        button1 = (Button)findViewById(R.id.choice1);
        button2 = (Button)findViewById(R.id.choice2);
        button3 = (Button)findViewById(R.id.choice3);

        TextView textStory = findViewById(R.id.storyLine);
        textStory.setText(storyLine);

        button1.setText(choice1S);
        if(choice2S == null) {
            button2.setVisibility(View.INVISIBLE);
        }
        else{
            button2.setVisibility(View.VISIBLE);
            button2.setText(choice2S);
        }
        if(choice3S == null) {
            button3.setVisibility(View.INVISIBLE);
        }
        else{
            button2.setVisibility(View.VISIBLE);
            button3.setText(choice3S);
        }
        tree.setCurrent(next);
    }

    public void choice3(View view){
        Node current = tree.getCurrent();
        Node next = current.getChoice3();

        String storyLine = next.getStoryLine();
        String choice1S = next.choiceText1;
        String choice2S = next.choiceText2;
        String choice3S = next.choiceText3;

        button1 = (Button)findViewById(R.id.choice1);
        button2 = (Button)findViewById(R.id.choice2);
        button3 = (Button)findViewById(R.id.choice3);

        TextView textStory = findViewById(R.id.storyLine);
        textStory.setText(storyLine);

        button1.setText(choice1S);
        if(choice2S == null) {
            button2.setVisibility(View.INVISIBLE);
        }
        else{
            button2.setVisibility(View.VISIBLE);
            button2.setText(choice2S);
        }
        if(choice3S == null) {
            button3.setVisibility(View.INVISIBLE);
        }
        else{
            button2.setVisibility(View.VISIBLE);
            button3.setText(choice3S);
        }
        tree.setCurrent(next);
    }
}
