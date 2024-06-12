package com.example.buildvarient

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class QAMainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BuildConfig.BASE_URL
        Log.d("QAMainActivity",BuildConfig.MODE);
        Log.d("QAMainActivity",BuildConfig.BASE_URL);
        findViewById<Button>(R.id.btnSubmit).setOnClickListener {
            showToast("QAMainActivity")
        }

    }
}