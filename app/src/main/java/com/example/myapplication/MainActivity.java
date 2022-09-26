package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.wenben).setOnClickListener(this);
        findViewById(R.id.but).setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.but || view.getId() == R.id.wenben){
            startActivity(new Intent(this, TextViewActivity.class));
        }

    }
}