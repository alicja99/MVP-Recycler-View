package com.mvp.model.network.request

import com.mvp.model.pojo.MoviesResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApiService {
    @GET("/3/movie/popular/")
    fun getMovies(@Query("api_key") key: String?): Call<MoviesResult>

}