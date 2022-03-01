package com.unifiedinternshipprogram.uip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.cv_upload.*

class cv_upload : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cv_upload)

        setupSimpleSpinner()
    }

    private fun setupSimpleSpinner() {
        val adapter=ArrayAdapter.createFromResource(
            this,
            R.array.Company,
        android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        simpleSpinner.adapter=adapter
    }
}