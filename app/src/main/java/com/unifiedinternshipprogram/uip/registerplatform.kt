package com.unifiedinternshipprogram.uip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import kotlinx.android.synthetic.main.loginplatform.*
import kotlinx.android.synthetic.main.registerplatform.*

class registerplatform : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registerplatform);

        btn_next.setOnClickListener {
            intent = Intent(this, cv_upload::class.java)
            startActivity(intent)
        }
    }
}