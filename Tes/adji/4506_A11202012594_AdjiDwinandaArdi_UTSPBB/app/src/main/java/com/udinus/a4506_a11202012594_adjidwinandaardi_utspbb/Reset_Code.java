package com.udinus.a4506_a11202012594_adjidwinandaardi_utspbb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Reset_Code extends AppCompatActivity {
    //Deklarasi Variabel editTextEmail dengan mengguakan EditText
    EditText EditTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_code);
        //Binding variabel edt_text_email ke EditTextEmail
        EditTextEmail =findViewById(R.id.edt_text_email);
    }
    public void ClickResetCode(View view){
        if (TextUtils.isEmpty(EditTextEmail.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Email Tidak Boleh Kosong",Toast.LENGTH_LONG).show();
        }
        else
            if (!isValidEmail(EditTextEmail.getText().toString().trim())){
                Toast.makeText(view.getContext(),"Email Tidak Valid",Toast.LENGTH_LONG).show();
            }
            else{
                Intent i = new Intent(Reset_Code.this,Forgot_Password.class);
                startActivity(i);
            }
    }


    public static  boolean isValidEmail(CharSequence email){
        return(Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}