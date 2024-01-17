package org.example


fun main() {
    val robot1 = Robot("R2D2")
    val moves = arrayOf(
        arrayOf(1, -5, 0, 9),
        arrayOf(3, 3, 5, 6, 1, 0, 0, -7),
        arrayOf(2, 1, 0, -1, 1, 1, -4),
        arrayOf(),
        arrayOf(3, 5),
        arrayOf(-2),
        arrayOf(0, 0),
        arrayOf(11, 3, -11, 2, 2, -1, 0, 4),
        arrayOf(2, 9)
    )


    for (moveSet in moves) {
        try {
            robot1.move(moveSet)
            robot1.showPosition()
        } catch (e: IllegalArgumentException) {
            println("** ERROR ** - $e")
        }

        Thread.sleep(1000)
    }
}