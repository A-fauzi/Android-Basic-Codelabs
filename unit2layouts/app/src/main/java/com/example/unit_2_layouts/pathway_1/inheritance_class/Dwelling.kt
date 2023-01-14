package com.example.unit_2_layouts.pathway_1.inheritance_class

abstract class Dwelling(private var resident: Int) {
    abstract val buildingMaterial: String
    abstract val capacity: Int

    fun hashRoom(): Boolean {
        return resident < capacity
    }

    abstract fun floorArea(): Double

    fun getRoom() {
        if (capacity > resident) {
            resident++
            println("You got a room")
        } else {
            println("Sorry, at capacity and no rooms left.")
        }
    }
}