package com.example.there

import com.google.gson.annotations.SerializedName

data class RecordResponse(
    @SerializedName("isSuccess") var isSuccess : Boolean,
    @SerializedName("code") var code : Int,
    @SerializedName("message") var message : String,
    @SerializedName("result") var result : Result? = null
){
    data class Result(
        @SerializedName("postIdx") var postIdx : Int
    )
}
