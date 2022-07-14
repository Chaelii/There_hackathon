package com.example.there

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RecordInterface {
//    private val Base_URL = ""
    @POST("/post")
    fun postRecord(
    @Body recordRequest: RecordRequest
    ): Call<RecordResponse>
}