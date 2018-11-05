package com.example.displayjokelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        Intent intentStartedThisActivity = getIntent();
        String receivedJoke = intentStartedThisActivity.getStringExtra("joke");

        TextView jokeView =  findViewById(R.id.textView);
        jokeView.setText(receivedJoke);

    }
}
