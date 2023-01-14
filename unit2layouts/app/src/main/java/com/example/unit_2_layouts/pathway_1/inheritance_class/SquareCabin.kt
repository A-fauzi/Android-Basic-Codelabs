package com.example.unit_2_layouts.pathway_1.inheritance_class

class SquareCabin(resident: Int, val length: Double): Dwelling(resident) {
    override val buildingMaterial: String = "Wood"
    override val capacity: Int = 6
    override fun floorArea(): Double {
        return length * length
    }
}