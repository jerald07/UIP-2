package com.unifiedinternshipprogram.uip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.individual_applicant_platform.*

class individual_applicant_platform : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.individual_applicant_platform)


        btn_next_individual.setOnClickListener(){
            intent= Intent(this, cv_upload_individual::class.java)
            startActivity(intent)
        }
    }
}