package com.example.aapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.aapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var Balance = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.tv.text= "$Balance"
        //BUTTON CLICK EVENT HAPPENS INCREASE ,DECREASE & RESET NUMBER TO 0
        binding.button.setOnClickListener {
            Balance++
            binding.tv.text = Balance.toString()
        }
        binding.button.setOnClickListener {
            Balance--
            binding.tv.text = Balance.toString()
        }
        binding.button.setOnClickListener {
            Balance
            binding.tv.text = Balance.toString()
        }

    }
}