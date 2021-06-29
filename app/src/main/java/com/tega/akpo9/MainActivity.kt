package com.tega.akpo9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnWelcome: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnWelcome = findViewById(R.id.btnWelcome)
        btnWelcome.setOnClickListener{
            Welcome1()
        }
    }
  private fun Welcome1(){
      var intent: Intent= Intent(this, Signup::class.java)
      startActivity(intent)
  }
}