package com.example.classproject.retrofit

import com.example.classproject.MainModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiEndPoint {

    @GET("/quotes")
    suspend fun  getquotes() : Response<MainModel>
}