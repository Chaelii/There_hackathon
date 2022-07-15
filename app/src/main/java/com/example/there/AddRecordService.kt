package com.example.there

import android.util.Log
import retrofit2.Call
import retrofit2.Response

class AddRecordService {
    private lateinit var addRecordView: AddRecordView

    fun setAddRecordView(addRecordView: AddRecordView){
        this.addRecordView = addRecordView
    }

    fun addRecord(request: RecordRequest){
        val addService = AddRecordRetrofit.add

        addService.postRecord(request).enqueue(object : retrofit2.Callback<RecordResponse> {
            override fun onResponse(call: Call<RecordResponse>, response: Response<RecordResponse>){
                Log.d("ADD/SUCCESS", response.toString())
                val resp:RecordResponse = response.body()!!
                when(resp.code){
                    1000 -> addRecordView.onAddRecordSuccess()
                    else -> addRecordView.onAddRecordFailure()
                }
            }

            override fun onFailure(call: Call<RecordResponse>, t: Throwable){
                Log.d("ADD/FAILURE", t.message.toString())
            }
        })
        Log.d("ADD", "ADD WELL")
    }

}