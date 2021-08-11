package com.sabgrowth.collegefinder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val signup_btn = findViewById<TextView>(R.id.signup_btn) as TextView

        signup_btn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            // start your next activity
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, OtpActivity::class.java)
            // start your next activity
            startActivity(intent)
        }

    }
}