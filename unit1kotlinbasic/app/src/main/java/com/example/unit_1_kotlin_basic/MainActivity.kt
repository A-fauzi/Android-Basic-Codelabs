package com.example.unit_1_kotlin_basic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.unit_1_kotlin_basic.pathway_2.BirthdayCardActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn_path_3)
        btn.setOnClickListener {
            startActivity(Intent(this, BirthdayCardActivity::class.java))
        }
    }
}