package com.example.chandanasrinivas.one;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i1=getIntent();
        Bundle bundle=i1.getExtras();
        Toast.makeText(this,bundle.getString("Name"),Toast.LENGTH_SHORT).show();
    }
}
