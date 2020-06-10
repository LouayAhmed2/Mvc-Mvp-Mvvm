package com.example.moviesapp.Ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.moviesapp.PoJo.MovieModel;

public class MovieViewModel extends ViewModel {
    MutableLiveData<String> MovieNameMutableLiveData = new MutableLiveData<>();

    public void getMovieName() {
        String MovieName = getMoviefromDatabase().getName();
        MovieNameMutableLiveData.setValue(MovieName);
    }

    private MovieModel getMoviefromDatabase() {
        return new MovieModel("X-men", "14/9", "Action", 1);
    }
}
