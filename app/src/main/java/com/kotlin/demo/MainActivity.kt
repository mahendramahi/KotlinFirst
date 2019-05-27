package com.kotlin.demo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToastButton.setOnClickListener {

            Toast.makeText(this, "Button CLicked", Toast.LENGTH_SHORT).show()
            Log.d("shjsh", "dsefkedk  ")
        }

        buttonsendmsg.setOnClickListener {
            val message: String = editText.text.toString();
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
             val intent  = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_message", message)
            startActivity(intent)
        }
        buttonshareOtherApp.setOnClickListener {
            val message: String = editText.text.toString();
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "share to : "))

        }

        btnRecycler.setOnClickListener {
            val intent = Intent(this, Hobbies::class.java)
            startActivity(intent)
        }

    }
}