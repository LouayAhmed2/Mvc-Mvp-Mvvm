package com.example.moviesapp.Ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.moviesapp.R;

public class MainActivity extends AppCompatActivity implements MovieView {

    protected Button MovieBtn;
    protected TextView textView;
    MoviePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        initView();
        MovieBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                presenter.getMovieName();
            }
        });

        presenter =new MoviePresenter(this);

    }

    private void initView() {
        MovieBtn = (Button) findViewById(R.id.Movie_btn);
        textView = (TextView) findViewById(R.id.textView);
    }


    @Override
    public void OnGetMovieName(String name) {
        textView.setText(name);

    }
}
