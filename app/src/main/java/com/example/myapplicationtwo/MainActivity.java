package com.example.myapplicationtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MYTAG","ONCREATE TAG TEST");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MYTAG","ONSTART TAG TEST");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MYTAG","ONRESUME TAG TEST");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MYTAG","ONPAUSE TAG TEST");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MYTAG","ONSTOP TAG TEST");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MYTAG","ONDESTROY TAG TEST");
    }
}
