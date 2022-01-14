package com.metehanbolat.retrofitmvvmjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.metehanbolat.retrofitmvvmjetpackcompose.model.Movie
import com.metehanbolat.retrofitmvvmjetpackcompose.ui.theme.RetrofitMVVMJetpackComposeTheme
import com.metehanbolat.retrofitmvvmjetpackcompose.view.MovieItem
import com.metehanbolat.retrofitmvvmjetpackcompose.viewmodel.MovieViewModel

class MainActivity : ComponentActivity() {

    val movieViewModel by viewModels<MovieViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RetrofitMVVMJetpackComposeTheme {
                Surface(color = MaterialTheme.colors.background) {
                    MovieList(movieList = movieViewModel.movieListResponse)
                    movieViewModel.getMovieList()
                }
            }
        }
    }
}

@Composable
fun MovieList(movieList: List<Movie>) {
    LazyColumn {
        itemsIndexed(items = movieList){index, item ->
            MovieItem(movie = item)
        }
    }
}
