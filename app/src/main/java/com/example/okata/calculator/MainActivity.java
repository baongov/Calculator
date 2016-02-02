package com.example.okata.calculator;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Scanner;

import Lexer.CalculateExpression;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtonDataOnClick(View v){
        TextView t = (TextView) findViewById(R.id.input);
        t.append(((Button) v).getText());
    }
    public void ButtonDelOnClick(View v){
        TextView t = (TextView) findViewById(R.id.input);
        t.setText(t.getText().subSequence(0, t.getText().length() - 1));
    }

    public void ButtonCountOnClick(View v){
        CalculateExpression exp = new CalculateExpression();
        TextView out = (TextView) findViewById(R.id.result);
        TextView in = (TextView) findViewById(R.id.input);
        out.setText(exp.MyCalculator(in.getText().toString()));
    }
}
