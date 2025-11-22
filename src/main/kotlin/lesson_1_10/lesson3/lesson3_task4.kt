package org.example.lesson3

fun main() {

    var cellFrom = "E2"
    var cellTo = "E4"
    var moveNumber = 1
    var chessMoveRecord = "$cellFrom, $cellTo, $moveNumber"

    println(chessMoveRecord)

    cellFrom = "D2"
    cellTo = "D3"
    moveNumber = 3
    chessMoveRecord = "$cellFrom, $cellTo, $moveNumber"

    println(chessMoveRecord)
}