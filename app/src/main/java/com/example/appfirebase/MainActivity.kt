package com.example.appfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setup()


    }
    fun setup(){
        var username = findViewById<TextView>(R.id.EmailTextView)
        var password = findViewById<TextView>(R.id.pwdTextView)

    }
}