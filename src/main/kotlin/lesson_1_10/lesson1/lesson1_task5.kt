package org.example.lesson1

fun main() {

    val seconds: Int = 6480
    val secondsInOneMinute = 60
    val minutes = seconds / secondsInOneMinute
    val remainingSeconds = seconds % minutes
    val minutesInOneHour = 60
    val hours = minutes / minutesInOneHour
    val remainingMinutes = minutes % minutesInOneHour

    println(String.format("%02d:%02d:%02d", hours, remainingMinutes, remainingSeconds))
}