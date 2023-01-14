package com.example.unit_2_layouts.pathway_1.inheritance_class

fun main() {
    val squareCabin = SquareCabin(6, 50.0)
    with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hashRoom()}")
        println("Floor Area: ${floorArea()}")
        getRoom()
    }

    val roundHut = RoundHut(3, 10.0)
    with(roundHut) {
        println("\n Round Hut\n============")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hashRoom()}")
        println("Floor area: ${floorArea()}")
        getRoom()
        println("Carpet Length: ${calculateMaxCarpetLength()}")
    }

   val roundTower = RoundTower(4, 15.5)
    with(roundTower) {
        println("\n Round Tower\n============")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hashRoom()}")
        println("Floor area: ${floorArea()}")
        getRoom()
        println("Carpet Length: ${calculateMaxCarpetLength()}")
    }
}