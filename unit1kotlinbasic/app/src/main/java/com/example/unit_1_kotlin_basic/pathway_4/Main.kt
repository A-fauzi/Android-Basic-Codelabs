package com.example.unit_1_kotlin_basic.pathway_4

fun main() {
    val firstDice = Dice(6)
    println("Your ${firstDice.sides} side dice rolled ${firstDice.roll()}")

    repeat(50) {
        print("@")
    }

    println()

    checkLuckyWin()

}

private fun checkLuckyWin() {
    val dice = Dice(6)
    val resultRoll = dice.roll()
    val luckyNumber = 6

    when(resultRoll) {
        luckyNumber -> println("You Win!")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        4 -> println("Don't cry! You rolled a 4. Try again!")
        5 -> println("Apologies! You rolled a 5. Try again!")
    }
}