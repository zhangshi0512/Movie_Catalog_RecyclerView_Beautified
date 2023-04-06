package com.example.nestedrecyclerview.services

import com.example.nestedrecyclerview.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=c0a8bbb04a10529b01b7170692277617")
    fun getMovieList(): Call<MovieResponse>

}