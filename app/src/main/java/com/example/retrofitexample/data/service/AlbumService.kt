package com.example.retrofitexample.data.service

import com.example.retrofitexample.data.model.network.Albums
import retrofit2.Response
import retrofit2.http.GET

interface AlbumService {

    @GET("/albums")
    suspend fun getAlbums(): Response<Albums>
}