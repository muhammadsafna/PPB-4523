package com.udinus.a4506_a11202012594_adjidwinandaardi_utspbb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }
    public void ClickLogin (View view){
        Intent i = new Intent(WelcomeActivity.this, Login.class);
        startActivity(i);
    }
}