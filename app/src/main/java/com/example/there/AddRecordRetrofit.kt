package com.example.there

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object AddRecordRetrofit {
    //통신할 서버 url
    private const val BASE_URL = "http://172.30.1.45:8080"

    //Retrofit 객체 초기화
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val add: RecordInterface = retrofit.create(RecordInterface::class.java)

}