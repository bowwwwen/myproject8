package com.bowen.com.bowen.score

class Student (var name:String, var english:Int, var math :Int){
    init {
        println("test")
    }
    fun print(){
        println("$name\t$english\t$math\t${getAverage()}")
    }
    fun getAverage()=(english+math)/2

}

fun main() {
    val Jack = Student("Jack",75,80)
    Jack.print()
}