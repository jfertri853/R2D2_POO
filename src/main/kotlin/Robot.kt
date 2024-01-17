package org.example

class Robot(private val name: String) {
    private var posX: Int = 0
    private var posY: Int = 0
    private var orientation: String = "North"


    fun move(movements: Array<Int>) {
        for (steps in movements) {
            when (this.orientation) {
                "North" -> {
                    posY += steps
                    this.orientation = "West"
                }

                "West" -> {
                    posX -= steps
                    this.orientation = "South"
                }

                "South" -> {
                    posY -= steps
                    this.orientation = "East"
                }

                "East" -> {
                    posX += steps
                    this.orientation = "North"
                }
            }
        }
    }


    private fun obtainOrientation(): String {
        return when (this.orientation) {
            "North" -> "Positive Y"
            "West" -> "Negative X"
            "South" -> "Negative Y"
            "East" -> "Positive X"
            else -> throw IllegalArgumentException("Hemos perdido la orientación de ${this.name}")
        }
    }


    fun showPosition() {
        println("${this.name} está en (${this.posX}, ${this.posY}) ${obtainOrientation()}")
    }
}