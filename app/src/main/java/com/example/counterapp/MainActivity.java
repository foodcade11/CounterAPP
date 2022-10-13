package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int n=1;
    Button btn;
    TextView screen;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)  findViewById(R.id.counter);
        screen=(TextView)  findViewById(R.id.number);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(n+"");
                n++;
            }
        });
    }
}