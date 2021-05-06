/*
Higher Order Functions in Kotlin:
A higher-order function is a function that takes functions as parameters or returns a function.
Video link : https://www.youtube.com/watch?v=Q6f3r2ICWAM&t=186s
 */

//1. Function returning a function.

fun doAddition() : (Int,Int) -> Int{
    return :: addNumbers
}

fun addNumbers(numberOne : Int , numberTwo : Int) = numberOne.plus(numberTwo)

fun main(){
    val addition : (Int,Int) -> Int = doAddition()
    println(addition(3,4))
}