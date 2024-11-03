package org.example.chapter_1_3

private const val HERO_NAME = "Madrigal"

fun main() {
    println("The hero announces her presence to the world.")

    println(HERO_NAME)
    var playerLevel = 4
    println(playerLevel)

    val hasBefriendedBarbarians = true
    val hasAngeredBarbarians = false
    val playerClass = "paladin"
    if (playerLevel == 1) {
        println("Meet Mr. Bubbles in the land of soft things.")
    } else if (playerLevel <= 5) {
        //Проверить возможность дипломатического решения
        val canTalkToBarbarians = !hasAngeredBarbarians && (hasBefriendedBarbarians || playerClass == "barbarian")

        val barbarianQuest: String = if (canTalkToBarbarians) {
            "Convince the barbarians to call off their invasion."
        } else {
            "Save the town from the barbarian invasions."
        }
        println(barbarianQuest)
    } else if (playerLevel == 6) {
        println("Locate the enchanted sword.")
    } else if (playerLevel == 7) {
        println("Recover the long-lost artifact of creation.")
    } else if (playerLevel == 8) {
        println("Defeat Nogartse, bringer of death and eater of worlds.")
    } else {
        println("There are no quests right now.")
    }

    println("Time passes...")
    println("The hero returns from her quest.")

    playerLevel++
    println(playerLevel)
}