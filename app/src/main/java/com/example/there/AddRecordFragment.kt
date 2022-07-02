package com.example.there

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.example.there.databinding.FragmentAddrecordBinding

class AddRecordFragment: Fragment() {
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

        return binding.root
    }
}