package com.example.currencyconverter;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
EditText bax;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bax=findViewById(R.id.box);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(v -> {
            String bux=bax.getText().toString().trim();
            double bix=Double.parseDouble(bux);
            double dubleInr=75.70 * bix;
            String Txt="="+ dubleInr +"$";

            Toast.makeText(getApplicationContext(),"converted currency is"+Txt,Toast.LENGTH_SHORT).show();
        });
    }
}