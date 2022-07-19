package com.example.there

import android.util.Log
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AddRecordService {
    private lateinit var addRecordView: AddRecordView

    fun setAddRecordView(addRecordView: AddRecordView){
        this.addRecordView = addRecordView
    }

    fun addRecord(request: RecordRequest){
        val addService = AddRecordRetrofit.add

        addService.postRecord(request).enqueue(object : Callback<RecordResponse> {
            override fun onResponse(
                call: Call<RecordResponse>,
                response: Response<RecordResponse>){
                val resp:RecordResponse = response.body()!!
                Log.d("SERVER/ADD/SUCCESS", resp.message)
                when(resp.code){
                    1000 -> addRecordView.onAddRecordSuccess(resp.code, resp.message)
                    else -> addRecordView.onAddRecordFailure()
                }
            }

            override fun onFailure(call: Call<RecordResponse>, t: Throwable) {
                Log.d("SERVER/ADD/FAILURE", t.cause.toString())
            }
        })
        Log.d("ADD", "ADD WELL")
    }
}