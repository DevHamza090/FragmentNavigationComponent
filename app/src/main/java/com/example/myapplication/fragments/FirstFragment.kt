package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding.bind
import com.example.myapplication.databinding.ActivityMainBinding.inflate
import com.example.myapplication.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private lateinit var binding : FragmentFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root





    }

    override fun onStart() {
        super.onStart()
        binding.firstToSecond.setOnClickListener {
            navigate(R.id.first_to_second)
        }
        binding.secondToThird.setOnClickListener {
            navigate(R.id.first_to_third)
        }
        binding.thirdToForth.setOnClickListener {
            navigate(R.id.first_to_forth)
        }
    }


    fun navigate(id : Int){
        findNavController().navigate(id)
    }


}