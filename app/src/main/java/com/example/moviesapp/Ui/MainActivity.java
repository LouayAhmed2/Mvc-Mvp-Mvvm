package com.example.moviesapp.Ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import com.example.moviesapp.R;
import com.example.moviesapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity   {


    MovieViewModel movieViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        movieViewModel = ViewModelProviders.of(this).get(MovieViewModel.class);
        activityMainBinding.setViewmodel(movieViewModel);
        activityMainBinding.setLifecycleOwner(this);



    }


}
