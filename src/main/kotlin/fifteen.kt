/*
Scope Functions :
https://kotlinlang.org/docs/scope-functions.html
Video Reference : https://www.youtube.com/watch?v=MHxGv4K6BsM
*/

class Person {
    var name: String = ""
    var age: Int = 0
}

fun main() {

    /** Scope Function: 'apply'
    Property 1: Refer to context object by using 'this'
    Property 2: The return value is the 'context object'  */

    val person = Person().apply {
        name = "Sriyank Siddhartha"
        age = 26
    }

    with(person) {
        println(name)       // prints   Sriyank Siddhartha
        println(age)        // prints   26
    }

    // Perform some other operations on 'person' object
    person.also {
        it.name = "Shreks from Smartherd"
        println("New name: ${it.name}")     // prints   New name: Shreks from Smartherd
    }

    /** Scope Function - "let"
    Use 'let' function to avoid NullPointerException
     */
    val name : String ?= "hello"
    val stringLength = name?.let {               //Safe call operator [ ?.] which ensures following lines of code are executed only when name is not null
        println(it.reversed())
        println(it.capitalize())
        it.length
        //it keyword contains the copy of the property inside let
    }
    println(stringLength)
}