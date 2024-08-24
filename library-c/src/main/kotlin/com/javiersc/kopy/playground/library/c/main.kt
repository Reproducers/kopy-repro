package com.javiersc.kopy.playground.library.c

import com.javiersc.kotlin.kopy.Kopy

fun main() {

    val car = Car(
        seat = 4,
        wheels = Wheels(
            size = 20,
            number = 4,
        ),
    )

    val car2: Car = car {
        seat = 5
        wheels.size = 22
        wheels.number.update { it + 3 }
    }

    // Car(seat=5, wheels=Wheels(size=22, number=7))
    println(car2)
}

@Kopy data class Car(val seat: Int, val wheels: Wheels)
@Kopy data class Wheels(val size: Int, val number: Int)
