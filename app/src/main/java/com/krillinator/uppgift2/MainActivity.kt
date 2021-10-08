package com.krillinator.uppgift2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submitButton = findViewById<Button>(R.id.btnSubmit)
        val nameInput = findViewById<EditText>(R.id.inputName)

        submitButton.setOnClickListener {

            val message = nameInput.text.toString() // Get EditText - content
            val intent = Intent(this, ProfilePage::class.java).apply {
                putExtra("userName", message)
            }
            startActivity(intent)
        }
    }
}