package com.example.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tv:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.TextView2)
        val username = intent.getParcelableExtra<User>("User")?.Username
        val password = intent.getParcelableExtra<User>("User")?.Password
        tv.text = "Username : $username dan Password : $password"
    }
}