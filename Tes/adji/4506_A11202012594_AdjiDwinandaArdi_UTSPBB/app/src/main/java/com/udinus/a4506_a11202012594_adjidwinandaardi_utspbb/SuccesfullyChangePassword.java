package com.udinus.a4506_a11202012594_adjidwinandaardi_utspbb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SuccesfullyChangePassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_succesfully_change_password);
    }

    public void ClickButton(View view){
        Intent i = new Intent(SuccesfullyChangePassword.this,DaftarProsessor.class);
        startActivity(i);
    }
}