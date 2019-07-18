package org.athenian


fun listSumLoop(list: List<Int>): Int {
    var sum = 0
    for (i in list.indices)
        sum += list[i]
    return sum
}

fun listSumStream(list: List<Int>) = list.sum()

fun listSumRecursion(list: List<Int>): Int =
    if (list.size == 0) 0 else list[0] + listSumRecursion(list.slice(1..list.size - 1))
