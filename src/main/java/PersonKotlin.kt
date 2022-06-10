package com.bowen


class PersonKotlin {
    fun greeting(){
        println("Kotlin")
    }
}

// first level
//no change->val  change->var
fun main() {
    val p = PersonKotlin()
    p.greeting()
}