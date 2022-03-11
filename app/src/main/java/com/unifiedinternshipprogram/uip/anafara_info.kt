package com.unifiedinternshipprogram.uip

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.anafara_info.*
import kotlinx.android.synthetic.main.melham_info.btn_facebook
import kotlinx.android.synthetic.main.melham_info.btn_website

class anafara_info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.anafara_info)

        btn_facebook.setOnClickListener(){
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/AnafaraGroup"))
            startActivity(i)
        }

        btn_website.setOnClickListener(){
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://anafara.com/#home "))
            startActivity(i)
        }

        btn_anafara_next.setOnClickListener(){
            intent=Intent(this, visvis_info::class.java)
            startActivity(intent)
        }
        btn_prev_anafara.setOnClickListener(){
            intent=Intent(this, melham_info::class.java)
            startActivity(intent)
        }
    }
}