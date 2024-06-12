package com.example.buildvarient

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button


class SplashScreenActivity : BaseActivity() {
     var  btnSubmit: Button?=null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Handler().postDelayed({
            startActivity(Intent(SplashScreenActivity@this,QAMainActivity::class.java))
        }, 1000)
    }
}