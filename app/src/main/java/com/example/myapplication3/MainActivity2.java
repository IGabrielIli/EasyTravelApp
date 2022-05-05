package com.example.myapplication3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void goToActivitygreece (View view){
        Intent intent = new Intent(this, Greece.class);
        startActivity(intent);
    }

    public void goToActivityabroad (View view){
        Intent intent = new Intent(this, abroad.class);
        startActivity(intent);
    }
}