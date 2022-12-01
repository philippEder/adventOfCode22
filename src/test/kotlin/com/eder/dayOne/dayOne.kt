package com.eder.dayOne

import org.junit.jupiter.api.Test

class DayOne {

    @Test
    fun dayOne_partOne() {
        val input = DayOne::class.java.getResource("/day1.txt").readText()

        val maxCalories = input.split("\r\n\r\n")
                               .map { elf ->elf.split("\r\n").map { it.toInt() }.sumBy { it } }
                               .maxOrNull()

        println(maxCalories)
    }

    @Test
    fun dayOne_partTwo() {
        val input = DayOne::class.java.getResource("/day1.txt").readText()

        val top3Calories = input.split("\r\n\r\n")
            .map { elf ->elf.split("\r\n").map { it.toInt() }.sumBy { it } }
            .sortedDescending()
            .take(3)
            .sumBy { it }

        println(top3Calories)
    }

}