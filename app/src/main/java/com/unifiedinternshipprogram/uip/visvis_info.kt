package com.unifiedinternshipprogram.uip

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.melham_info.*
import kotlinx.android.synthetic.main.melham_info.btn_facebook
import kotlinx.android.synthetic.main.visvis_info.*

class visvis_info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.visvis_info)

        btn_facebook.setOnClickListener(){
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/visvislogisticservices/"))
            startActivity(i)
        }
        btn_prev_visvis.setOnClickListener(){
            intent=Intent(this, anafara_info::class.java)
            startActivity(intent)
        }
        btn_visvis_done.setOnClickListener(){
            intent=Intent(this, welcome::class.java)
            startActivity(intent)
        }
    }
}