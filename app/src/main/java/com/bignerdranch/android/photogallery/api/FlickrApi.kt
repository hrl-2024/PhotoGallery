package com.bignerdranch.android.photogallery.api

import com.bignerdranch.android.photogallery.BuildConfig
import retrofit2.http.GET

private const val API_KEY = BuildConfig.FLICKR_API_KEY

interface FlickrApi {
    @GET("/")
    suspend fun fetchContents(): String  // A general response type called OkHttp.ResponseBody
                                            // is provided with Retrofit.
                                            // But here, we want it parse into a String object
}