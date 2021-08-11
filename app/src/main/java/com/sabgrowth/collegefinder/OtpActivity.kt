package com.sabgrowth.collegefinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_otp.*

class OtpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)

        resend.setOnClickListener {
            Toast.makeText(applicationContext,"OTP Sent Again",
                Toast.LENGTH_LONG).show()
        }
        verify.setOnClickListener {
            if (Integer.parseInt(editTextPhone2.text.toString())==17234 )
            {
                val intent = Intent(this, HomeActivity::class.java)
                // start your next activity
                startActivity(intent)
            }
            else
            {
                Toast.makeText(applicationContext,"Wrong Otp",
                    Toast.LENGTH_LONG).show()
            }
        }
    }
}