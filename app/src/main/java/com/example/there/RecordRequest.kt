package com.example.there

import com.google.gson.annotations.SerializedName

data class RecordRequest(
    @SerializedName("userIdx") var userIdx: Int? = 1,
    @SerializedName("content") var content: String,
    @SerializedName("imgUrl") var imgUrl: String = "img"
)