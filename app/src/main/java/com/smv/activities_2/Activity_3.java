package com.smv.activities_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_3 extends AppCompatActivity
{
    TextView text, number;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Intent intent = getIntent();
        if(intent.hasExtra("EXTRA_STRING"))
        {
            String textRead = intent.getStringExtra("EXTRA_STRING");
            text = findViewById(R.id.textViewString);
            text.setText(textRead);
        }
        if(intent.hasExtra("EXTRA_NUMBER"))
        {
            double numberRead = intent.getDoubleExtra("EXTRA_NUMBER", -1);
            number = findViewById(R.id.textViewNumber);
            number.setText("" + numberRead);
        }
    }
}
