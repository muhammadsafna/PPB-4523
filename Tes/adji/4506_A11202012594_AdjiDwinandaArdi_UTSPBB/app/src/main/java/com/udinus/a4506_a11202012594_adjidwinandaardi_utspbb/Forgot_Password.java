package com.udinus.a4506_a11202012594_adjidwinandaardi_utspbb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Forgot_Password extends AppCompatActivity {
    EditText editTextResetCode;
    EditText editTextPassword;
    EditText editTextNewPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        editTextResetCode = findViewById(R.id.edt_txt_ResetCode);
        editTextPassword = findViewById(R.id.edt_txt_password);
        editTextNewPassword = findViewById(R.id.edt_txt_Newpassword);
    }

    public void ClickForgotPassword(View view){
        //Validasi Reset Code dan email Kosong
        if (TextUtils.isEmpty(editTextResetCode.getText().toString().trim())
        && TextUtils.isEmpty(editTextPassword.getText().toString().trim())
        && TextUtils.isEmpty(editTextNewPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(),"Reset Code dan Password tidak boleh kosong",Toast.LENGTH_LONG).show();
        }
        //Validasi
        if(TextUtils.isEmpty(editTextResetCode.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Reset Code Tidak Boleh Kosong",Toast.LENGTH_LONG).show();
        }
        else if (TextUtils.isEmpty(editTextPassword.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Password Tidak Boleh Kosong",Toast.LENGTH_LONG).show();
        }
        else
            if (TextUtils.isEmpty(editTextNewPassword.getText().toString().trim())){
                Toast.makeText(view.getContext(),"Confirm Password Tidak Boleh kosong",Toast.LENGTH_LONG).show();
            }
        else
            if (!editTextPassword.getText().toString().equals(editTextNewPassword.getText().toString())){
                Toast.makeText(view.getContext(),"Password Tidak Sama",Toast.LENGTH_LONG).show();
            }
            else{
                Intent i = new Intent(Forgot_Password.this,SuccesfullyChangePassword.class);
                startActivity(i);
            }


    }

}