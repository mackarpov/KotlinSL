package org.example.lesson2

const val MINUTES_IN_HOUR = 60

fun main() {

    val hoursOfStart = 9
    val minutesOfStart = 39
    val travelTime = 457
    val travelHours = travelTime / MINUTES_IN_HOUR
    val travelMinutes = travelTime % MINUTES_IN_HOUR
    val extraHours = (minutesOfStart + travelMinutes) / MINUTES_IN_HOUR
    val extraMinutes = (minutesOfStart + travelMinutes) % MINUTES_IN_HOUR

    println("${hoursOfStart + travelHours + extraHours}:$extraMinutes")
}