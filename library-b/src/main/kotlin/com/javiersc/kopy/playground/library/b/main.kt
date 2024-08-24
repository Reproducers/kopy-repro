package com.javiersc.kopy.playground.library.b

import com.javiersc.kopy.playground.library.a.Cat
import com.javiersc.kopy.playground.library.a.House
import com.javiersc.kopy.playground.library.a.Kitchen

fun main() {

    val house = House(
        squareMeters = 100,
        kitchen = Kitchen(
            cat = Cat(
                name = "Garfield",
                age = 5,
                numbers = listOf(1, 2, 3),
            ),
            squareMeters = 10,
        ),
    )

    val house2: House = house {
        squareMeters = 300
        kitchen.cat.name = "Hugo"
        kitchen.cat.age.update { it + 4 }
        kitchen.cat.numbers.updateEach { it + 3 }
        kitchen.squareMeters.set(34)
    }

    // House(squareMeters=300, kitchen=Kitchen(cat=Cat(name=Hugo, age=9, numbers=[4, 5, 6]), squareMeters=34))
    println(house2)

}
