package com.example.there

import com.google.gson.annotations.SerializedName

data class RecordRequest(
    @SerializedName("userIdx") var userIdx : Int,
    @SerializedName("content") var content : String,
    @SerializedName("imgUrl") var imgUrl : String
)