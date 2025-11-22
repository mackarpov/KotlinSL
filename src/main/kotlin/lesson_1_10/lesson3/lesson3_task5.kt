package org.example.lesson3

fun main() {

    val chessRecord = "D2-D4;0"
    val splittedChessRecord = chessRecord.split('-', ';')
    val cellFrom = splittedChessRecord[0]
    val cellTo = splittedChessRecord[1]
    val moveNumber = splittedChessRecord[2]

    println(cellFrom)
    println(cellTo)
    println(moveNumber)
}