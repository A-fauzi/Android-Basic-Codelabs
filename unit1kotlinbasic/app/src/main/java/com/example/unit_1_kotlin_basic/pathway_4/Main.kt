package com.example.unit_1_kotlin_basic.pathway_4

fun main() {
    val firstDice = Dice(6)
    println("Your ${firstDice.sides} side dice rolled ${firstDice.roll()}")

    val secondDice = Dice(20)
    println("Your ${secondDice.sides} side dice rolled ${secondDice.roll()}")
}