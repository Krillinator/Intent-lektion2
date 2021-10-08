package com.krillinator.uppgift2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProfilePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_page)

        var userName = findViewById<TextView>(R.id.userName)
        val name = intent.getStringExtra("userName")

        userName.text = name
    }
}