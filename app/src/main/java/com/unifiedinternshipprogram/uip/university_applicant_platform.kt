package com.unifiedinternshipprogram.uip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.university_applicant_platform.*

class university_applicant_platform : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.university_applicant_platform)

        btn_next_university.setOnClickListener(){
            intent= Intent(this, cv_upload_university::class.java)
            startActivity(intent)
        }
    }
}