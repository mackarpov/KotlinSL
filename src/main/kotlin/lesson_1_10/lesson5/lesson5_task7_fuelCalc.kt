package org.example.lesson5

fun main() {

    print("Введите расстояние поездки (в километрах): ")
    val distance = readln().toFloat()

    print("Введите расход топлива на 100 км (в литрах): ")
    val fuelConsumption = readln().toFloat()

    print("Введите текущую цену за литр топлива: ")
    val fuelPrice = readln().toFloat()

    val totalAmountOfFuel = (distance * fuelConsumption) / FUEL_COEFFICIENT
    val totalCostOfFuel = totalAmountOfFuel * fuelPrice

    println("Общее количество топлива = $totalAmountOfFuel " +
            "Итоговая стоимость поездки = ${String.format("%.2f", totalCostOfFuel)}")

}

const val FUEL_COEFFICIENT = 100