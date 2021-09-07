package com.tashev.kotlinhw1

class ClassForCopy(val string:String,
                   val int:Int,
                   var oneMoreString:String = "defaultParameter",
                   val double:Double = 55.5) {

    fun copy(string: String = this.string,
             int: Int = this.int,
             oneMoreString: String = this.oneMoreString,
             double: Double = this.double)
    = ClassForCopy(string, int, oneMoreString, double)

}