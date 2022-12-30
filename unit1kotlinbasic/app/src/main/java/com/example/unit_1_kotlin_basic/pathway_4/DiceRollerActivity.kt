package com.example.unit_1_kotlin_basic.pathway_4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView
import com.example.unit_1_kotlin_basic.R
import kotlinx.coroutines.*
import kotlin.coroutines.coroutineContext

class DiceRollerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_roller)

        val btnRoll = findViewById<Button>(R.id.btn_roll)
        btnRoll.setOnClickListener {
            rollDice()
        }
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun rollDice() {

        var state: Boolean = false

        val imageRoll = findViewById<ImageView>(R.id.iv_roll_number)
        val animationView = findViewById<LottieAnimationView>(R.id.animationView)

        val dice = Dice(6)

        when (dice.roll()) {
            1 -> {
                imageRoll.setImageDrawable(resources.getDrawable(R.drawable.dice_1, null))
                state = false
            }
            2 -> {
                imageRoll.setImageDrawable(resources.getDrawable(R.drawable.dice_2, null))
                state = false
            }
            3 -> {
                imageRoll.setImageDrawable(resources.getDrawable(R.drawable.dice_3, null))
                state = false
            }
            4 -> {
                imageRoll.setImageDrawable(resources.getDrawable(R.drawable.dice_4, null))
                state = false
            }
            5 -> {
                imageRoll.setImageDrawable(resources.getDrawable(R.drawable.dice_5, null))
                state = false
            }
            6 -> {
                imageRoll.setImageDrawable(resources.getDrawable(R.drawable.dice_6, null))
                state = true
            }
        }

        when(state) {
            true -> animationView.visibility = View.VISIBLE
            false -> animationView.visibility = View.GONE
        }
    }
}