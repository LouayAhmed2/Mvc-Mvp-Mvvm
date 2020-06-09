package com.example.moviesapp.Ui;

import com.example.moviesapp.PoJo.MovieViewModel;

public    class MoviePresenter   {
    MovieView View ;

    public MoviePresenter(MovieView view) {
        View = view;
    }
    public MovieViewModel getMoviefromDatabase(){
        return new MovieViewModel("X-men","14/9","Action",1);
    }

    public void getMovieName(){
        View.OnGetMovieName(getMoviefromDatabase().getName());
    }
}
