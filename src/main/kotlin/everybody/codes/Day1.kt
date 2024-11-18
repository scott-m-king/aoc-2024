package org.example.everybody.codes

import org.example.readFile

val map = mapOf(
    'B' to 1,
    'C' to 3,
    'D' to 5
)

fun day1(input: String): Int = input.fold(0) { acc, c ->
    acc + map.getOrDefault(c, 0)
}

fun day1Pt2(input: String): Int = input.chunked(2).fold(0) { acc, c ->
    acc + c.fold(0) { sum, d ->
        sum + map.getOrDefault(d, 0)
    } + if (c.count { it == 'x' } > 0) 0 else 2
}

fun day1Pt3(input: String): Int = input.chunked(3).fold(0) { acc, c ->
    acc + c.fold(0) { sum, d ->
        sum + map.getOrDefault(d, 0)
    } + when (c.count { it == 'x' }) {
        0 -> 6
        1 -> 2
        else -> 0
    }
}

fun main() {
    println("Part 1")
    println(day1("ABBAC"))
    val input = readFile("everybody-codes/everybody_codes_e2024_q01_p1.txt")
    println(day1(input))

    println("Part 2")
    println(day1Pt2("AxBCDDCAxD"))
    val input2 = readFile("everybody-codes/everybody_codes_e2024_q01_p2.txt")
    println(day1Pt2(input2))

    println("Part 3")
    println(day1Pt3("xBxAAABCDxCC"))
    val input3 = readFile("everybody-codes/everybody_codes_e2024_q01_p3.txt")
    println(day1Pt3(input3))
}