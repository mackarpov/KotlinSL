package org.example.lesson4

fun main() {

    val sunnyWeather: Boolean = true
    val airHumidity: Int = 20
    val tentIsOpen: Boolean = true
    val seasonNow: String = "winter"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${
                    SUNNY_WEATHER == sunnyWeather && 
                            TENT_IS_OPEN == tentIsOpen &&
                            AIR_HUMIDITY == airHumidity &&
                            SEASON_NOW == seasonNow
                }"
    )
}

const val SUNNY_WEATHER = true
const val AIR_HUMIDITY = 20
const val TENT_IS_OPEN = true
const val SEASON_NOW = "not winter"
