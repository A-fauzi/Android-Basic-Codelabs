package com.example.unit_2_layouts.pathway_1.inheritance_class

import kotlin.math.PI
import kotlin.math.sqrt

open class RoundHut(resident: Int, val radius: Double): Dwelling(resident) {
    override val buildingMaterial: String = "Straw"
    override val capacity: Int = 4
    override fun floorArea(): Double {
        return PI * radius * radius
    }

    fun calculateMaxCarpetLength(): Double {

        return sqrt(2.0) * radius
    }

}