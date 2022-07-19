package com.example.there

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RecordInterface {
    @POST("/posts")
    fun postRecord(
    @Body recordRequest: RecordRequest
    ): Call<RecordResponse>
}