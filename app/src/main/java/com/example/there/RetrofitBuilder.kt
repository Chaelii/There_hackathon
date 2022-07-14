package com.example.there

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val Base_URL = "https://"

object RetrofitBuilder {
    val api: RetrofitInterface
    init {
        val retrofit = Retrofit.Builder().baseUrl(Base_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
        api = retrofit.create(RetrofitInterface::class.java)
    }
}