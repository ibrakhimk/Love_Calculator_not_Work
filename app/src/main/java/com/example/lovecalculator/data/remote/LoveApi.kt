package com.example.lovecalculator.data.remote

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveApi {

    @GET("getPercentage")
    fun getPercentage(
        @Query("fname") firstName: String,
        @Query("sname") second: String,
        @Header("X-RapidAPI-Key") key: String = ("cbcc646cebmsh04002b36118a05cp15a0bcjsndc7ee3e83a58"),
        @Header("X-RapidAPI-Host") host: String = ("love-calculator.p.rapidapi.com")
    ): Call<LoveModel>
}