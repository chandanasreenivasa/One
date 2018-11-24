package com.example.chandanasrinivas.one;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText et;
    private static final String Tag=MainActivity.class.getSimpleName();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button) findViewById(R.id.btn);
        et=(EditText) findViewById(R.id.editText);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("Name",et.getText().toString());
                startActivity(i);
            }
        });

        Log.i(Tag,"in method OnCreate");
    }

    protected void OnStart()
    {
        super.onStart();
        Log.i(Tag,"in method OnStart");
    }

    protected void OnResume()
    {
        super.onResume();
        Log.i(Tag,"in method OnResume");
    }

    protected void onPause()
    {
        super.onPause();
        Log.i(Tag,"in method onPause");
    }

    protected void onStop()
    {
        super.onStop();
        Log.i(Tag,"in method onStop");
    }

    protected void onDestroy()
    {
        super.onDestroy();
        Log.i(Tag,"in method onDestroy");
    }
}
