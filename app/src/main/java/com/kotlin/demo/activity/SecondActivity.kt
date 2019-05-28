package com.kotlin.demo.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.kotlin.demo.AppConstant
import com.kotlin.demo.R
import com.kotlin.demo.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras

       bundle?.let {
           val msg = bundle.getString(AppConstant.USER_MSG_KEY)
           textView.text = msg
           showToast(msg)
       }
    }
}