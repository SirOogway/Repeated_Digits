package com.innova.repeateddigits.Extensions

fun Int.containsRepeatedDigits():Boolean{
    val numberStr = this.toString()
    val simplifiedNumberStr = numberStr.toCharArray()

    if (simplifiedNumberStr.distinct().size < numberStr.length) return true

    return false
}