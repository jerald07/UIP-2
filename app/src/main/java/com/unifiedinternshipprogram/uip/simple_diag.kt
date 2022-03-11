package com.unifiedinternshipprogram.uip

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.simple_diag.*
import kotlinx.android.synthetic.main.simple_diag.view.*

class simple_diag : DialogFragment (){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var bind = inflater.inflate(R.layout. simple_diag, container, false)
        setCancelable(false)


        bind.btn_cancel.setOnClickListener(){
            dismiss()
        }

        bind.btn_individual.setOnClickListener(View.OnClickListener {

            val intent = Intent (this@simple_diag.requireContext(), individual_applicant_platform::class.java)
            startActivity(intent)
            dismiss()
        })
        bind.btn_university.setOnClickListener(View.OnClickListener {
            val intent = Intent (this@simple_diag.requireContext(), university_applicant_platform::class.java)
            startActivity(intent)
            dismiss()
        })
        return bind
    }
}