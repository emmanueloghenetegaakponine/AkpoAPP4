package com.tega.akpo9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Signup : AppCompatActivity() {

private lateinit var sgnButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        sgnButton = findViewById(R.id.sgnButton)
        sgnButton.setOnClickListener{
            Signup1()
        }

    }

    private fun Signup1(){
        var intent: Intent = Intent(this, Services::class.java)
        startActivity(intent)
    }

}