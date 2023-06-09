package com.example.evaluation1;

import static com.example.evaluation1.R.id.display;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String value;
    EditText editTextNumberOne;
    EditText editTextNumber2;
    TextView display;
    Button Calculate;
    Button Reset;
    double numberOne;
    double numberTwo;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumberOne = findViewById(R.id.editTextNumberOne);
        editTextNumber2= findViewById(R.id.editTextNumber2);
        display = findViewById(R.id.display);
        Calculate = findViewById(R.id.Calculate);
        Reset = findViewById(R.id.Reset);


        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {

                    numberOne = Double.parseDouble(editTextNumberOne.getText().toString());
                    numberTwo = Double.parseDouble(editTextNumber2.getText().toString());
                }
                catch(Exception e)
                {
                    Toast.makeText(MainActivity.this, "Please input a valid number", Toast.LENGTH_SHORT).show();
                }

                double answer = numberOne / numberTwo;
                display.setText(String.valueOf(answer));


            }
        });




        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String clear = "";
                value = "";
                display.setText(clear);
                editTextNumberOne.setText(clear);
                editTextNumber2.setText(clear);
            }
        });


    }
}