package org.example

import java.io.File

fun readFilesAsLines(fileName: String): List<String>
        = File("/Users/scott/code/aoc-2024/src/main/resources/${fileName}").readLines()