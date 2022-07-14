package com.example.there

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {

    companion object{
        //통신할 서버 url
        private const val BASE_URL = ""

        //Retrofit 객체 초기화
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val add: RecordInterface = retrofit.create(RecordInterface::class.java)


    }

}