package com.example.there

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.there.databinding.FragmentMyprofileBinding


class MyProfileFragment : Fragment(){
    lateinit var binding: FragmentMyprofileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMyprofileBinding.inflate(inflater, container, false)
        binding.btnMyprofileRecord.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm, AddRecordFragment()).commitAllowingStateLoss()
        }

        binding.ibtnMyprofileMyrecord1.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm, MyRecordFragment()).commitAllowingStateLoss()
        }
        binding.ibtnMyprofileMyrecord2.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm, MyRecordFragment()).commitAllowingStateLoss()
        }
        binding.ibtnMyprofileMyrecord3.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm, MyRecordFragment()).commitAllowingStateLoss()
        }
        binding.ibtnMyprofileMyrecord4.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm, MyRecordFragment()).commitAllowingStateLoss()
        }
        binding.ibtnMyprofileMyrecord5.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm, MyRecordFragment()).commitAllowingStateLoss()
        }
        binding.ibtnMyprofileMyrecord6.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm, MyRecordFragment()).commitAllowingStateLoss()
        }
        binding.ibtnMyprofileMyrecord7.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm, MyRecordFragment()).commitAllowingStateLoss()
        }
        binding.ibtnMyprofileMyrecord8.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm, MyRecordFragment()).commitAllowingStateLoss()
        }
        binding.ibtnMyprofileMyrecord9.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm, MyRecordFragment()).commitAllowingStateLoss()
        }
        binding.ibtnMyprofileMyrecord10.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm, MyRecordFragment()).commitAllowingStateLoss()
        }
        binding.ibtnMyprofileMyrecord11.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm, MyRecordFragment()).commitAllowingStateLoss()
        }
        binding.ibtnMyprofileMyrecord12.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm, MyRecordFragment()).commitAllowingStateLoss()
        }
        binding.ibtnMyprofileMyrecord13.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm, MyRecordFragment()).commitAllowingStateLoss()
        }
        return binding.root
    }

    }
