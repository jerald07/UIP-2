package com.unifiedinternshipprogram.uip

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.melham_info.*

class melham_info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.melham_info)


        btn_melham_next.setOnClickListener() {

            intent = Intent(this, anafara_info::class.java)
            startActivity(intent)
        }

        btn_facebook.setOnClickListener() {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/melhamconstruction"))
            startActivity(i)
        }

        btn_website.setOnClickListener() {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://melhamconstruction.ph/ "))
            startActivity(i)

        }
    }
}