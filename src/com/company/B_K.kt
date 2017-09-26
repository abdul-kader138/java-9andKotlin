package com.company

import com.company.kotlin.Drived
import com.company.kotlin.Emp
import com.company.kotlin.Info
import com.company.kotlin.Week


fun main(args: Array<String>) {


    var testArray = arrayOf('0', '1', '2', '3', '4', '5', '6', '7').toCharArray();
    println(decimalDigitValue('1', testArray));

    val text = """
    <Tell me and I forget.
    <Teach me and I remember.
    <Involve me and I learn.
    <(Benjamin Franklin)
    """.trimMargin("<");


    val s = "abc";
    println("$s.length is ${s.length}");

    println(text)

    var x: Int = 5;
    var y: Int = 9;

    val max = if (x > y) x else y;
    println(max);


    println(hasPrefix(x))
    println(hasPrefix1("Babu"));

    loop@ for ((index, value) in testArray.withIndex()) {
        println("" + index + "-" + value);
    }


    var obj = Emp("Babu", 31);
    var obj1 = Emp("Abdul Kader Babu", 28);
//    var obj=Emp("Babu",25,27);/
//    var obj1=Emp("Babu",25,27,58);
//    println(obj.age)
//    println(obj.age)


    var info = Info(3, 15, obj);
    info.x = 105;
    var info1 = info.copy(z = obj1);
    println(info.component3());
    println(info1.component3());
    println(info.toString());
    println(info1.toString());


    var t12 = StringBuffer();
    t12.append(12);
    t12.append(31);
    println(t12)


    var day = Week.MONDAY;
    println(day.ordinal);


    testVarArgs("babu", "a", "b", "c");

    var t:String="rrrr";

    println( t.isBlank());


    var t142=Drived();
    println(t142.t);

}


fun decimalDigitValue(c: Char, d: CharArray): Int {
    if (c !in d)
        throw IllegalArgumentException("Out of range")
    println(c.toInt());
    return c.toInt() + '1'.toInt() // Explicit conversions to numbers
}


fun hasPrefix(x: Any) = when (x) {
    is Int -> true
    else -> false
}

fun hasPrefix1(x: Any) = when (x) {
    is String -> x.startsWith("B", true);
    else -> false
}

fun testVarArgs(t: String, vararg items: String) {
    for (v: String in items)
        println(v)
}

fun String.isBlank(): Boolean {
    if (this.trim().length > 3) return true;
    else return false;
}
