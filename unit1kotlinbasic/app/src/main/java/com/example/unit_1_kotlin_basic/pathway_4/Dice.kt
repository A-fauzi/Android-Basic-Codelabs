package com.example.unit_1_kotlin_basic.pathway_4

class Dice(val sides: Int) {

    fun roll(): Int {
        val dice = 1..sides
        return dice.random()
    }
}