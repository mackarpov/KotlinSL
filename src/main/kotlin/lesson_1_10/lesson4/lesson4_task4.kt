package org.example.lesson4

fun main() {

    val numberOfDay = 5

    println(
        """
        Упражнения для рук: ${numberOfDay % 2 == 1}
        Упражнения для ног: ${numberOfDay % 2 != 1}
        Упражнения для спины: ${numberOfDay % 2 != 1}
        Упражнения для пресса: ${numberOfDay % 2 == 1}
    """.trimIndent()
    )
}