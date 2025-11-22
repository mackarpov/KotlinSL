package org.example.lesson4

fun main() {

    val todayBookedTables = 13
    val tomorrowBookedTables = 9

    println(
        "Доступность столиков на сегодня: ${todayBookedTables < TOTAL_TABLES}\n" +
                "Доступность столиков на завтра: ${tomorrowBookedTables < TOTAL_TABLES}"
    )
}

const val TOTAL_TABLES = 13