package com.example.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lab2", "Metoda onCreate [Log]");
        Toast.makeText(this, "Metoda onCreate [Toast]", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();

        Log.d("Lab2", "Metoda onResume [Log]");
        Toast.makeText(this, "Metoda onResume [Toast]", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();

        Log.d("Lab2", "Metoda onPause [Log]");
        Toast.makeText(this, "Metoda onPause [Toast]", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();

        Log.d("Lab2", "Metoda onRestart [Log]");
        Toast.makeText( this, "Metoda onRestart [Toast]", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Lab2", "Metoda onStop [Log]");
        Toast.makeText(this, "Metoda onStop [Toast]", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Lab2", "metoda onDestroy [Log]");
        Toast.makeText(this, "Metoda onStop[Toast]", Toast.LENGTH_SHORT).show();
    }
}

