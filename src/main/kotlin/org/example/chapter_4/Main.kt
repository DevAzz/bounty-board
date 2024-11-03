package org.example.chapter_4

private const val HERO_NAME = "Madrigal"
private var PLAYER_LEVEL = 5

fun main() {
    println("The hero announces her presence to the world.")
    println(HERO_NAME)
    println(PLAYER_LEVEL)

    readBountyBoard()

    println("Time passes...")
    println("The hero returns from her quest.")

    PLAYER_LEVEL++
    println(PLAYER_LEVEL)
    readBountyBoard()
}

private fun readBountyBoard() {
    println("The hero approaches the bounty board. It reads:")
    println(obtainQuest(PLAYER_LEVEL))
}

private fun obtainQuest(
    playerLevel: Int,
    playerClass: String = "paladin",
    hasBefriendedBarbarians: Boolean = true,
    hasAngeredBarbarians: Boolean = false
): String = when (playerLevel) {
    1 -> "Meet Mr. Bubbles in the land of soft things."
    in 2..5 -> {
        //Проверить возможность дипломатического решения
        val canTalkToBarbarians = !hasAngeredBarbarians && (hasBefriendedBarbarians || playerClass == "barbarian")
        if (canTalkToBarbarians) {
            "Convince the barbarians to call off their invasion."
        } else {
            "Save the town from the barbarian invasions."
        }
    }

    6 -> "Locate the enchanted sword."
    7 -> "Recover the long-lost artifact of creation."
    8 -> "Defeat Nogartse, bringer of death and eater of worlds."
    else -> "There are no quests right now."
}