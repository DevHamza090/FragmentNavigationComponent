package com.example.myapplication

import android.os.Build
import android.os.Bundle
import android.os.Environment
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.EnvironmentCompat
import com.example.myapplication.databinding.ActivityMainBinding
import java.io.File
import java.io.IOException
import java.io.InputStream

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)








    }



    override fun onResume() {
        super.onResume()

    }
}