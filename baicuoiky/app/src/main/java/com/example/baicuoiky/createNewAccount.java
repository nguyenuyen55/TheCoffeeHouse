package com.example.baicuoiky;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class createNewAccount extends AppCompatActivity {
    private Button btncreate;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_account);
        btncreate = (Button) findViewById(R.id.sign1);
        btncreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(createNewAccount.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}