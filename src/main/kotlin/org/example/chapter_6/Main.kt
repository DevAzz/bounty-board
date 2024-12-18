package org.example.chapter_6

private const val HERO_NAME = "Madrigal"
private var playerLevel = 0

fun main() {
    println("$HERO_NAME announces her presence to the world.")
    println("What level is $HERO_NAME?")
    val playerLevelInput = readLine()!!
    playerLevel = if (playerLevelInput.matches("""\d+""".toRegex())) {
        playerLevelInput.toInt()
    } else {
        1
    }
    println("$HERO_NAME`s level is $playerLevel")

    readBountyBoard()

    println("Time passes...")
    println("$HERO_NAME returns from her quest.")

    playerLevel++
    println(playerLevel)
    readBountyBoard()
}

private fun readBountyBoard() {
    println(
        """
        |$HERO_NAME approaches the bounty board. It reads:
        |    "${obtainQuest(playerLevel)}"
        """.trimMargin()
    )
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