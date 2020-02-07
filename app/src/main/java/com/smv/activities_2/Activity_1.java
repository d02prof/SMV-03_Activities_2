package com.smv.activities_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_1 extends AppCompatActivity
{
    Button buttonOpenActivity2;

    View.OnClickListener openActivity2_OnClickListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            Intent intent = new Intent(getApplicationContext(), Activity_2.class);
            startActivity((intent));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        buttonOpenActivity2 = findViewById(R.id.buttonOpenActivity_2);
        buttonOpenActivity2.setOnClickListener(openActivity2_OnClickListener);

    }
}
