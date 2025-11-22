package org.example.lesson4

fun main() {

    var shipHasDamages: Boolean
    var amountOfCrewOnBoard: Int
    var amountOfProvisions: Int
    var goodWeather: Boolean

    print("Наличие повреждений у корабля (true || false): ")
    shipHasDamages = readln().toBoolean()

    print("Состав экипажа (количество): ")
    amountOfCrewOnBoard = readln().toInt()

    print("Ящики с провизией (количество): ")
    amountOfProvisions = readln().toInt()

    print("Погода благоприятная? (true || false): ")
    goodWeather = readln().toBoolean()

    val result =
        ("${
            ((shipHasDamages == SHIP_HAS_DAMAGES &&
                    amountOfCrewOnBoard in MINIMUM_CREW..MAXIMUM_CREW &&
                    amountOfProvisions > MINIMUM_PROVISIONS &&
                    (goodWeather == GOOD_WEATHER || goodWeather == !GOOD_WEATHER)) ||
                    (shipHasDamages == !SHIP_HAS_DAMAGES &&
                            amountOfCrewOnBoard == MAXIMUM_CREW &&
                            amountOfProvisions >= MINIMUM_PROVISIONS &&
                            goodWeather == GOOD_WEATHER))
        }")

    println("Корабль может приступить к долгосрочному плаванию: $result")
}

const val MINIMUM_CREW = 55
const val MAXIMUM_CREW = 70
const val MINIMUM_PROVISIONS = 50
const val SHIP_HAS_DAMAGES = false
const val GOOD_WEATHER = true
