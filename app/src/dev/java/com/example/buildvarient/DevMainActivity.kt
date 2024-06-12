package com.example.buildvarient

import android.graphics.pdf.PdfRenderer
import android.os.Bundle
import android.os.ParcelFileDescriptor
import android.widget.Button
import com.example.buildvarient.AppConstants.Contants
import java.io.File


class DevMainActivity : BaseActivity() {
     var  btnSubmit: Button?=null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSubmit = findViewById(R.id.btnSubmit)
        btnSubmit!!.setOnClickListener {

            showToast("DevMainActivity")

        }
    }

}