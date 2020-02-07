package com.smv.activities_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_2 extends AppCompatActivity
{
    Button buttonOpenActivity_3;
    EditText text, number;

    View.OnClickListener openActivity3_OnClickListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            String textRead = text.getText().toString();
            double numberRead;
            try
            {
                numberRead = Double.parseDouble(number.getText().toString());
            }
            catch (Exception ex)
            {
                numberRead = -1;
            }
            Intent intent = new Intent(getApplicationContext(), Activity_3.class);
            intent.putExtra("EXTRA_STRING", textRead);
            intent.putExtra("EXTRA_NUMBER", numberRead);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        buttonOpenActivity_3 = findViewById(R.id.buttonOpenActivity_3);
        text = findViewById(R.id.editTextString);
        number = findViewById(R.id.editTextNumber);

        buttonOpenActivity_3.setOnClickListener(openActivity3_OnClickListener);
    }
}
