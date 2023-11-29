package com.bignerdranch.android.photogallery.api

import retrofit2.http.GET

interface FlickrApi {
    @GET("/")
    suspend fun fetchContents(): String  // A general response type called OkHttp.ResponseBody
                                            // is provided with Retrofit.
                                            // But here, we want it parse into a String object
}