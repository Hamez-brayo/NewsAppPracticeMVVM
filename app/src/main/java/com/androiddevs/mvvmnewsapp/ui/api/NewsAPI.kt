package com.androiddevs.mvvmnewsapp.ui.api

import com.androiddevs.mvvmnewsapp.ui.models.NewsResponse
import com.androiddevs.mvvmnewsapp.ui.util.Constants.Companion.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {
    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String="ke",
        @Query("page")
        pageNumber: Int=1,
        @Query("apikey")
        apiKey:String=API_KEY
    ): retrofit2.Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
        searchQuery: String,
        @Query("page")
        pageNumber: Int=1,
        @Query("apikey")
        apiKey:String=API_KEY
    ): retrofit2.Response<NewsResponse>
}