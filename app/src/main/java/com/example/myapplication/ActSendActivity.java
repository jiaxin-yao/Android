package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActSendActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_send);
        TextView textView = findViewById(R.id.send);
        textView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, ActReceiveActivity.class);
        Bundle bundle = new Bundle(); // 创建一个包裹
        bundle.putString("request_content", textView.getText().toString());
        intent.putExtras(bundle);
    }
}