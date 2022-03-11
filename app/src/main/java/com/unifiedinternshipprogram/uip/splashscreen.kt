package com.unifiedinternshipprogram.uip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splashscreen : AppCompatActivity() {

    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)

        supportActionBar?.hide()
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this, welcome::class.java)
                startActivity(intent)
                finish()
            },4000)
    }
}