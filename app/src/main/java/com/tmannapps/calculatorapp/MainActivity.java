package com.tmannapps.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText myInputValue1, myInputValue2;
    TextView myResult;
    ImageButton myAdd, mySubtract;
    Double input1Double, input2Double;
    Double result;

// Tiffany Mann SIT708 Task 3.1 Calculator Student ID: 221457972
//source that assisted my understand the double type manipulation: https://technobyte.org/performing-arithmetic-operations-android-studio/

    //get double value from string variables
    public void getDouble() {
        input1Double = Double.parseDouble(myInputValue1.getText().toString());
        input2Double = Double.parseDouble(myInputValue2.getText().toString());
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myInputValue1 = findViewById(R.id.myInputValue1);
        myInputValue2 = findViewById(R.id.myInputValue2);
        myResult = findViewById(R.id.myResult);
        myAdd = findViewById(R.id.myButtonAdd);
        mySubtract = findViewById(R.id.myButtonSubtract);

        //set on click listener addition
        //suggested from warnings to replace with lambda. Review lambda expressions.
        myAdd.setOnClickListener(view -> {
            try {
                getDouble();
                result = input1Double+input2Double;
                myResult.setText(Double.toString(result));
            } catch (Exception exception){
                Toast.makeText(MainActivity.this, "Please input a number", Toast.LENGTH_SHORT).show();
            }
        });
        //set on click listener subtraction
        mySubtract.setOnClickListener(view -> {
            try {
                getDouble();
                result = input1Double - input2Double;
                myResult.setText(Double.toString(result));
            } catch (Exception exception) {
                Toast.makeText(MainActivity.this, "Please input a number", Toast.LENGTH_SHORT).show();
            }
        });
    }
}