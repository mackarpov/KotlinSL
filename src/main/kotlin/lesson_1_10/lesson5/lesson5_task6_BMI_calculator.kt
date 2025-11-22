package org.example.lesson5

import kotlin.math.pow

fun main() {

    print("Введите ваш вес (в киллограммах): ")
    val userWeight = readln().toDouble()

    print("Введите ваш рост (в сантиметрах): ")
    val userHeight = readln().toFloat() / CONVERSION_COEFFICIENT

    val indexBMI = userWeight / userHeight.pow(EXPONENT)

    val weightCategory = when{
        indexBMI >= 30 -> "Ожирение"
        indexBMI >= 25 ->"Избыточная масса тела"
        indexBMI >= 18.5 -> "Нормальная масса тела"
        else -> "Недостаточная масса тела"
    }

    println("ИМТ = ${String.format("%.2f", indexBMI)} - $weightCategory")
}

const val EXPONENT = 2
const val CONVERSION_COEFFICIENT = 100