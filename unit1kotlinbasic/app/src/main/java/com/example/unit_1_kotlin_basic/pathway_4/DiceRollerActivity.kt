package com.example.unit_1_kotlin_basic.pathway_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.unit_1_kotlin_basic.R

class DiceRollerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_roller)

        val btnRoll = findViewById<Button>(R.id.btn_roll)
        btnRoll.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val resultRoll = findViewById<TextView>(R.id.tv_roll_number)
        val dice = Dice(20)
        resultRoll.text = dice.roll().toString()
    }
}