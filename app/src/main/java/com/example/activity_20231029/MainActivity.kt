package com.example.activity_20231029

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.activity_20231029.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btn1.setOnClickListener{

            val myIntent = Intent( this, SecondActivity::class.java)

            startActivity(myIntent)
        }

        binding.btnMoveToThird.setOnClickListener {
            val myIntent = Intent(this, ThirdActivity::class.java)

            val inputMessage = binding.edtMessage.text.toString()

            myIntent.putExtra("message", inputMessage)

            val inputNumber = binding.edtNumber.text.toString().toInt()

            myIntent.putExtra("number", inputNumber)

            startActivity(myIntent)
        }
    }
}

