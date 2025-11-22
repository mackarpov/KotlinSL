package org.example.lesson2

fun main() {

    val buffRate = 20
    val crystalOre = 7
    val ironOre = 11
    val extraCrystalOre = crystalOre * (buffRate.toDouble() / 100 + 1) - crystalOre
    val extraIronOre = ironOre * (buffRate.toDouble() / 100 + 1) - ironOre

    println(extraCrystalOre.toInt())
    println(extraIronOre.toInt())
}