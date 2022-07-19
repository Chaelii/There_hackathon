package com.example.there

interface AddRecordView {
    fun onAddRecordSuccess(code : Int, message: String)
    fun onAddRecordFailure()
}