package com.example.moviesapp.Ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.example.moviesapp.R;

public class MainActivity extends AppCompatActivity   {

    protected Button MovieBtn;
    protected TextView textView;
    MovieViewModel movieViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        initView();
        MovieBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
 movieViewModel.getMovieName();
            }
        });
        movieViewModel = ViewModelProviders.of(this).get(MovieViewModel.class);
        movieViewModel.MovieNameMutableLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setText(s);

            }
        });


    }

    private void initView() {
        MovieBtn = (Button) findViewById(R.id.Movie_btn);
        textView = (TextView) findViewById(R.id.textView);
    }



}
