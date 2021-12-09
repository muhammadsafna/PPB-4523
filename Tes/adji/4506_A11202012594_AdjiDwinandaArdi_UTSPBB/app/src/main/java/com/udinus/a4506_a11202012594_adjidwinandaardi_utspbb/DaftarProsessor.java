package com.udinus.a4506_a11202012594_adjidwinandaardi_utspbb;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DaftarProsessor extends AppCompatActivity {
    RecyclerView recyclerView;
    String s1[],s2[];
    int images[] = {R.drawable.pass, R.drawable.pass, R.drawable.pass, R.drawable.pass};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_prosessor);
        recyclerView =findViewById(R.id.recyclerView);

        s1=getResources().getStringArray(R.array.daftar_prosesor);
        s2=getResources().getStringArray(R.array.deskripsi);

        MyAdapter myAdapter = new MyAdapter(this,s1,s2,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}