package com.example.buildvarient

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

    internal fun showToast(msg: String) {
        Toast.makeText(this@BaseActivity, msg, Toast.LENGTH_SHORT).show()
    }
}