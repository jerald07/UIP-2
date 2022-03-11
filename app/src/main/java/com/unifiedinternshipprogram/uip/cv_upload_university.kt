package com.unifiedinternshipprogram.uip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.cv_upload_university.*

class cv_upload_university : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cv_upload_university)


        //spinner
        val list = arrayOf(
            "Select Company Here", "Melham Construction Corporation", "Visvis Logistics Services", "Anafara Corporation"
        )

        val spinner = findViewById<Spinner>(R.id.ua_simpleSpinner)
        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list)
        spinner.adapter = arrayAdapter


        //attachfile resume
        ua_btn_insertcv.setOnClickListener(){
            val dialog = BottomSheetDialog(this)
            val view = layoutInflater.inflate(R.layout.bottom_dialog, null)
            dialog.setContentView(view)
            dialog.show()
            dialog.setCancelable(false)

            val close = view.findViewById<ImageView>(R.id.bd_close)
            close.setOnClickListener(){
                dialog.dismiss()
            }

        }

        ua_btn_insertMOA.setOnClickListener(){
            val dialog = BottomSheetDialog(this)
            val view = layoutInflater.inflate(R.layout.bottom_dialog, null)
            dialog.setContentView(view)
            dialog.show()
            dialog.setCancelable(false)

            val close = view.findViewById<ImageView>(R.id.bd_close)
            close.setOnClickListener(){
                dialog.dismiss()
            }
        }
    }
}