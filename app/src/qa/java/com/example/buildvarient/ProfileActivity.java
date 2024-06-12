package com.example.buildvarient;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends BaseActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        btn = findViewById(R.id.btnSubmitPro);
        btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

           }
       });
    }
}