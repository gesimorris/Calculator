package com.example.calculator;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import android.widget.EditText;

import android.widget.TextView;


/*
 * Main Activity class that loads {@link MainFragment}.
 */


public class MainActivity extends AppCompatActivity {

    Button plus, minus, multiply, divide, mod, square, percent, clear;
    EditText FirstNo, SecondNo;
    TextView result;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // References to widgets using ID
        FirstNo=findViewById(R.id.FirstNo);
        SecondNo=findViewById(R.id.SecondNo);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        multiply=findViewById(R.id.multiply);
        divide=findViewById(R.id.divide);
        mod=findViewById(R.id.mod);
        square=findViewById(R.id.square);
        percent=findViewById(R.id.percent);
        clear=findViewById(R.id.Clear);
        result=findViewById(R.id.result);

        // Add button
        Button add = plus;
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Convert numbers to Strings
                String s1 = FirstNo.getText().toString();
                String s2 = SecondNo.getText().toString();
                if(s1.isEmpty() || s2.isEmpty()){   // Check if there is an input
                    result.setText("Error, Please enter a number");
                }
                else{
                float num1 = Float.parseFloat(s1);
                float num2 = Float.parseFloat(s2);
                float sum = num1 + num2;
                result.setText("Result is: " + sum);}
                    }
        });

        // Minus button
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = FirstNo.getText().toString();
                String s2 = SecondNo.getText().toString();
                if(s1.isEmpty() || s2.isEmpty()){
                    result.setText("Error, Please enter a number");
                }
                else{
                float num1 = Float.parseFloat(s1);
                float num2 = Float.parseFloat(s2);
                float difference = num1 - num2;
                result.setText("Result is: " + difference);}
            }
        });
        // Multiply button
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                String s1 = FirstNo.getText().toString();
                String s2 = SecondNo.getText().toString();
                if(s1.isEmpty() || s2.isEmpty()){
                    result.setText("Error, Please enter a number");
                }
                else{
                float num1 = Float.parseFloat(s1);
                float num2 = Float.parseFloat(s2);
                float product = num1 * num2;
                result.setText("Result is: " + product);}
            }
        });
        // Divide button
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                String s1 = FirstNo.getText().toString();
                String s2 = SecondNo.getText().toString();
                if(s1.isEmpty() || s2.isEmpty()){
                    result.setText("Error, Please enter a number");
                }
                else {
                    float num1 = Float.parseFloat(s1);
                    float num2 = Float.parseFloat(s2);
                    if (num2 == 0) {
                        result.setText("Error, Cannot divide by zero");
                    } else {
                        float division = num1 / num2;
                        result.setText("Result is: " + division);
                    }
                }
            }
        });
        // Mod button
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                String s1 = FirstNo.getText().toString();
                String s2 = SecondNo.getText().toString();
                if(s1.isEmpty() || s2.isEmpty()){
                    result.setText("Error, Please enter a number");
                }
                else{
                float num1 = Float.parseFloat(s1);
                float num2 = Float.parseFloat(s2);
                float modulus = num1 % num2;
                result.setText("Result is: " + modulus);}
            }
        });
        // Square button
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                String s1 = FirstNo.getText().toString();
                String s2 = SecondNo.getText().toString();
                if(s1.isEmpty() || s2.isEmpty()){
                    result.setText("Error, Please enter a number");
                }
                else{
                float num1 = Float.parseFloat(s1);
                float num2 = Float.parseFloat(s2);
                double sqr = Math.pow(num1, num2);
                result.setText("Result is: " + sqr);}
            }
        });
        // Clear button
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                FirstNo.getText().clear();
                SecondNo.getText().clear();
                result.setText(null);
            }
        });
        // Percent button
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                String s1 = FirstNo.getText().toString();
                String s2 = SecondNo.getText().toString();
                if(s1.isEmpty() || s2.isEmpty()){
                    result.setText("Error, Please enter a number");
                }
                else{
                float num1 = Float.parseFloat(s1);
                float num2 = Float.parseFloat(s2);
                float percentage = ((num1 / num2)*100);
                result.setText("Result is: %" + Math.abs(percentage) );}
            }
        });
    }
}