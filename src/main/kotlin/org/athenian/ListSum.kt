package org.athenian


fun listSumLoop(list: List<Int>): Int {
    var sum = 0
    list.indices.forEach { sum += list[it] }
    return sum
}

fun listSumRecursion(list: List<Int>): Int =
    when {
        list.isEmpty() -> 0
        else -> list[0] + listSumRecursion(list.slice(1..list.size - 1))
    }

fun listSumStream(list: List<Int>) = list.sum()