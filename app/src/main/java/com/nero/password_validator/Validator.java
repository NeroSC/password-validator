package com.nero.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Validator extends AppCompatActivity {

    private int counter = 0;

    public int securityCheck(String s) {
        counter=0;
        if (s.equals("password")) {
            counter += 1;
        }
        if (s.length() >= 8) {
            counter += 1;
        }
        if (!s.contains(" ")) {
          counter += 1;
        }
        return (counter);
    }


}
