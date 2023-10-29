package com.example.activity_20231029

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.activity_20231029.databinding.ActivitySecondBinding
import com.example.activity_20231029.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_third)

        val receivedMessage = intent.getStringExtra("message")

        val receivedNumber = intent.getIntExtra("number", -1)

        binding.txtMessage.text = "전달 문구 : ${receivedMessage}\n 전달 숫자 : ${receivedNumber}"


    }
}