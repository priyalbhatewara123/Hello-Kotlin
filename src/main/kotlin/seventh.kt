/*
    Functions in Kotlin
 */


fun square(number : Int) : Int {
    return number * number
}

//Above func in short form
fun square1(number : Int) : Int = number * number

//we can remove Int also because of Type Inference
fun square2(number : Int) = number * number

//vararg as a function argument
fun countAndPrintArgs(vararg number: Int){
    println("Size = " + number.size)
    for (no in number)
        println(no)
}

fun main(){
    println(square(3))
    println(square1(4))
    countAndPrintArgs(1,2,3,4,5)
}

/*
    Types of Arguments in Functions
        * Positional arguments
        * Default arguments
        * Named arguments

        Detailed explanation here : https://www.studytonight.com/kotlin/kotlin-positional-default-and-named-function-arguments
 */