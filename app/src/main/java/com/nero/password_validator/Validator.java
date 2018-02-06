package com.nero.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Validator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validator);
    }

    private int counter = 0;
    private int minDigit=1;
    private int countDigit=0;
    private int countUpperCase=0;

    public int securityCheck(String s) {
        //initiating counter to 0
        counter=0;

        // checking if password is "password", if no then it passes the rule.
        if (!s.equals("password")) {
            counter += 1;
        }
        //checking the size of the string, if long enough, it passes the rule.
        if (s.length() >= 8) {
            counter += 1;
        }
        //checking if the string contains any space characters, if no then it passes the rule.
        if (!s.contains(" ")) {
            counter += 1;
        }
        //checking the string for a Digit and for Uppercases.
        for (char c:s.toCharArray()){
            if(Character.isDigit(c)){
                countDigit+=1;
            }
            if(Character.isUpperCase(c)){
                countUpperCase+=1;
            }
        }
        //if the string is not only in Uppercases it passes the rule.
        if (countUpperCase!=s.length() && countUpperCase!=0){
            counter+=1;
        }
        // if the string contains at least 1 digit, it passes the rule.
        if (countDigit>=minDigit){
            counter+=1;
        }
        //taking the counter back to 0
        countUpperCase=0;
        countDigit=0;

        return (counter);
    }


    public void setPassword(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String pass = editText.getText().toString();
        if (securityCheck(pass)==5) {
            String message = "Your password is safe !";
            TextView textView = findViewById(R.id.feedback);
            textView.setText(message);
        }
        else{
            String message2 = "Your password is not safe! It must contain at least : \n" +  "1 capitalized letter, 8 characters , 1 digit, not contain any space and can't be the word 'password' ";
            TextView textView = findViewById(R.id.feedback);
            textView.setText(message2);
        }
    }

}
