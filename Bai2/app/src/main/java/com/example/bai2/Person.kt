package com.example.bai2

class Person(val name: String, val age: Int) {
    constructor(name: String) : this(name, age=0)
    var isAdult: Boolean = true
        get(){
            return if(age >=18) true else false
        }
}

class Student(name: String, age: Int) : Person1(name, age)

fun main() {
    val person1 = Person("Alice", 25)
    person1.isAdult = false
    println(person1.isAdult)
}

open class Person1(var name: String, var age: Int)