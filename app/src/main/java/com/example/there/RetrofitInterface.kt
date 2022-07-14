package com.example.there

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RetrofitInterface {
    @POST(value "/users")
    fun signUp(@Body user: User): Call<AuthResponse>
}