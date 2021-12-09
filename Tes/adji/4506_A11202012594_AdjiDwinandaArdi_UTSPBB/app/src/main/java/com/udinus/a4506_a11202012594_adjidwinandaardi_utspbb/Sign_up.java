package com.udinus.a4506_a11202012594_adjidwinandaardi_utspbb;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Sign_up extends AppCompatActivity {
    //deklarasi variabel edit_text_email dengan EditText
    EditText editTextEmail;
    //deklarasi Variabel edit_text_password dengan EditText
    EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // Binding edt_txt_email ke variabel editTextEmail
        editTextEmail = findViewById(R.id.edt_text_email);
        // Binding edt_txt_password ke variabel editTextPassword
        editTextPassword = findViewById(R.id.edt_text_password);
    }
    public  void Click_get_back(View view){
        Intent i = new Intent(Sign_up.this, Login.class);
        startActivity(i);
    }

    public void ClickSend(View view){
        //validasi email dan password kosong
        if (TextUtils.isEmpty(editTextEmail.getText().toString().trim())
                && TextUtils.isEmpty(editTextPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Email dan Password Tidak boleh Kosong",Toast.LENGTH_LONG).show();
        }
        //Validasi
        if(!isValidEmail(editTextEmail.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Email Tidak Valid",Toast.LENGTH_LONG).show();
        }
        else
        if(TextUtils.isEmpty(editTextEmail.getText().toString().trim())){
            Toast.makeText(view.getContext(),"Email Tidak Boleh Kosong",Toast.LENGTH_LONG).show();
        }
        else
        if(TextUtils.isEmpty(editTextPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(),"Password Tidak Boleh Kosong",Toast.LENGTH_LONG).show();
        }
        else{
            Intent i = new Intent(Sign_up.this,DaftarProsessor.class);
            startActivity(i);
        }
    }

    public  static boolean isValidEmail(CharSequence email){
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

}
