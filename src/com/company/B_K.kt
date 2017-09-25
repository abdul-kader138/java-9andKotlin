package com.company


fun main(args: Array<String>) {


    var testArray= arrayOf('0','1','2','3','4','5','6','7').toCharArray();
    println(decimalDigitValue('0',testArray));

}


fun decimalDigitValue(c: Char, d:CharArray): Int {
    if (c !in d)
        throw IllegalArgumentException("Out of range")
    return c.toInt() - '0'.toInt() // Explicit conversions to numbers
}