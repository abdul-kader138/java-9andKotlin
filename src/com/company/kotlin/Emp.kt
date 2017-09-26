package com.company.kotlin

class Emp(var name: String, var age: Int) {
//    constructor(value: String, value2: Int, value3: Int) : this(value, (value2+value3)) {
//        age=age*2;
//    };
//    constructor(value: String, value2: Int, value3: Int,value4: Int) : this(value, (value4+value3));
//

    override fun toString(): String {
        return "Emp(name='$name', age=$age)"
    }
}