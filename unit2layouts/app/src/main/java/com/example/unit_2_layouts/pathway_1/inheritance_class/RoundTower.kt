package com.example.unit_2_layouts.pathway_1.inheritance_class

class RoundTower(resident: Int, radius: Double, private val floors: Int = 2): RoundHut(resident, radius) {
    override val buildingMaterial: String = "Stone"
    override val capacity: Int = 4 * floors
}