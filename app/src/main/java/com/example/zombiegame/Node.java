package com.example.zombiegame;

import android.support.v7.app.AppCompatActivity;

public class Node extends AppCompatActivity {

    String storyLine;
    String choiceText1;
    String choiceText2;
    String choiceText3;
    Node choice1;
    Node choice2;
    Node choice3;

    public Node(String choiceText1, String choiceText2, String choiceText3, String storyLine){
        this.choiceText1 = choiceText1;
        this.choiceText2 = choiceText2;
        this.choiceText3 = choiceText3;
        this.storyLine = storyLine;
        this.choice1 = null;
        this.choice2 = null;
        this.choice3 = null;
    }

    public String getChoiceText1(){
        return choiceText1;
    }
    public String getChoiceText2(){
        return choiceText2;
    }
    public String getChoiceText3(){
        return choiceText3;
    }
    public String getStoryLine(){
        return storyLine;
    }

    public Node getChoice1(){
        return choice1;
    }
    public Node getChoice2(){
        return choice2;
    }
    public Node getChoice3(){
        return choice3;
    }

    public void setChoice1(Node choice){
        this.choice1 = choice;
    }
    public void setChoice2(Node choice){
        this.choice2 = choice;
    }
    public void setChoice3(Node choice){
        this.choice3 = choice;
    }


}
