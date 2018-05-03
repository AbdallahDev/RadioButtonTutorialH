package com.example.abdallahsarayrah.radiobuttontutorialh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioButtonOne.setOnClickListener {
            if (radioButtonOne.isChecked) textViewResult.text = radioButtonOne.text.toString()
        }
        radioButtonTwo.setOnClickListener {
            if (radioButtonTwo.isChecked) textViewResult.text = radioButtonTwo.text.toString()
        }
        radioButtonThree.setOnClickListener {
            if (radioButtonThree.isChecked) textViewResult.text = radioButtonThree.text.toString()
        }
    }
}

