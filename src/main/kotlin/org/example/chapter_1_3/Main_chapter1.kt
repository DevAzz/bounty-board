package org.example.chapter_1_3

private const val HERO_NAME = "Madrigal"

fun main() {
    println("The hero announces her presence to the world.")
    println(HERO_NAME)
    var playerLevel = 4
    println(playerLevel)

    println("The hero embarks on her journey to locate the enchanted sword.")
    playerLevel += 1
    println(playerLevel)

    val hasSteed = false
    println(hasSteed)

    println(HERO_NAME.reversed())
}