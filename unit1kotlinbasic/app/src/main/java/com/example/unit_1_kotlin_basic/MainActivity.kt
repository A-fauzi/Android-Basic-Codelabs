package com.example.unit_1_kotlin_basic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.unit_1_kotlin_basic.pathway_2.BirthdayCardActivity
import com.example.unit_1_kotlin_basic.pathway_4.DiceRollerActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btn_path_3)
        val btn2 = findViewById<Button>(R.id.btn_path_4)
        btn1.setOnClickListener {
            startActivity(Intent(this, BirthdayCardActivity::class.java))
        }
        btn2.setOnClickListener {
            startActivity(Intent(this, DiceRollerActivity::class.java))
        }
    }
}