package com.example.buildvarient

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    lateinit var string: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dev)
        Log.d("MainActivity",BuildConfig.MODE)

//        if (BuildConfig.MODE.equals("QA")) {

    }


    fun openSomeActivityForResult() {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("RequestCode","100")
        resultLauncher.launch(intent)
    }

    var resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            // There are no request codes
            val data: Intent? = result.data
            if (data!!.getStringExtra("RequestCode").equals("100")){
                TODO()
            }
            //doSomeOperations()
        }
    }
}