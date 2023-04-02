package com.tmannapps.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    EditText myInputValue1, myInputValue2;
    TextView myResult;
    ImageButton myAdd, mySubtract;
    Double input1Double, input2Double;
    Double result;


// Tiffany Mann SIT708 Task 3.1 Calculator Student ID: 221457972
    public void getDouble() {
        input1Double = Double.parseDouble(myInputValue1.getText().toString());
        input2Double = Double.parseDouble(myInputValue2.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myInputValue1 = findViewById(R.id.myInputValue1);
        myInputValue2 = findViewById(R.id.myInputValue2);
        myResult = findViewById(R.id.myResult);
        myAdd = findViewById(R.id.myButtonAdd);
        mySubtract = findViewById(R.id.myButtonSubtract);

        myAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDouble();
                result = input1Double+input2Double;
                myResult.setText(Double.toString(result));
            }
        });

        mySubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDouble();
                result = input1Double-input2Double;
                myResult.setText(Double.toString(result));
            }
        });
    }
}