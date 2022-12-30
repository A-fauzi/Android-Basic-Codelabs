package com.example.unit_1_kotlin_basic.pathway_1

fun main() {
    happyBirthday("Akhmad Fauzi", 26)
}

fun happyBirthday(name: String, age: Int) {
    borderComa(age)
    borderPipe(age)
    borderEquals(age)
    borderAt(age)
    borderAt(age)
    println("Happy Birthday $name!")
    println("Now your age is $age!")
    borderAt(age)
    borderAt(age)

}

fun borderComa(age: Int){
    print(" ")
    repeat(age){
        print(",")
    }
    println()
}

fun borderPipe(age: Int){
    print(" ")
    repeat(age){
        print("|")
    }
    println()
}
fun borderEquals(age: Int){
    repeat(age + 2){
        print("=")
    }
    println()
}
fun borderAt(age: Int){
    repeat(age + 2){
        print("@")
    }
    println()
}