package com.example.acltask1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewProfile(View view) {
        Intent about = new Intent(this, Profile.class);
        startActivity(about);
    }

    public void viewAbout(View view) {
        Intent about = new Intent(this, About.class);
        startActivity(about);
    }
}
