package com.example.there

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.there.databinding.FragmentAddrecordBinding

class AddRecordFragment: Fragment() , AddRecordView{
    lateinit var binding : FragmentAddrecordBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddrecordBinding.inflate(inflater, container, false)

        binding.btnAddrecordBackarrowIv.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm, MyProfileFragment()).commitAllowingStateLoss()
        }

        binding.textUploadTv.setOnClickListener {
            addRecord()
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm, MyProfileFragment()).commitAllowingStateLoss()
            Toast.makeText(context, "등록 버튼을 눌렀습니다.", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }

    private fun getContent(): RecordRequest {
        val content : String = binding.contentEt.text.toString()

        return RecordRequest(0, content, "")
    }

    private fun addRecord(){
        val addService = AddRecordService()
        addService.setAddRecordView(this)
        addService.addRecord(getContent())
    }


    override fun onAddRecordSuccess() {
        Toast.makeText(context, "success", Toast.LENGTH_SHORT).show()
    }

    override fun onAddRecordFailure() {
        TODO("Not yet implemented")
    }
}