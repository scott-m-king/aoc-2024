package org.example

import java.io.File

fun readFile(fileName: String): String
        = File("/Users/scott/code/aoc-2024/src/main/resources/${fileName}").readText()