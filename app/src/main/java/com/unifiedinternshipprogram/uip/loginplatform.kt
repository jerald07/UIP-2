package com.unifiedinternshipprogram.uip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.loginplatform.*

class loginplatform : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginplatform)

        lp_btn_login.setOnClickListener {
            intent = Intent(this, login_dashboard::class.java)
            startActivity(intent)

        }
        }
}