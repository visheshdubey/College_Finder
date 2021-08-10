package com.sabgrowth.collegefinder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val signup_btn = findViewById<TextView>(R.id.signup_btn) as TextView

        signup_btn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            // start your next activity
            startActivity(intent)
        }

    }
}