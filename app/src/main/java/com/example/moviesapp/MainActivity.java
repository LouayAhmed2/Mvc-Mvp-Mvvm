package com.example.moviesapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    protected Button MovieBtn;
    protected TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        initView();
        MovieBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(getMoviefromDatabase().name);
            }
        });

    }

    private void initView() {
        MovieBtn = (Button) findViewById(R.id.Movie_btn);
        textView = (TextView) findViewById(R.id.textView);
    }

    public  MovieViewModel getMoviefromDatabase(){
        return new MovieViewModel("X-men","14/9","Action",1);
    }
}
