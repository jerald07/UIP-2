package com.unifiedinternshipprogram.uip


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.welcome.*

class welcome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)

        btn_login.setOnClickListener() {
            intent = Intent(this, loginplatform::class.java)
            startActivity(intent)
        }

        btn_company.setOnClickListener() {
            intent = Intent(this, melham_info::class.java)
            startActivity(intent)
        }

        btn_apply_welcome.setOnClickListener(){

            val dialog = simple_diag()
            dialog.show(supportFragmentManager,"customDialog")
        }
    }
}

