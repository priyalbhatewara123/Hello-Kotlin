/*
Lambda Expressions :
Lambdas Expressions are essentially anonymous functions that we can treat as values.

More details : https://blog.mindorks.com/understanding-higher-order-functions-and-lambdas-in-kotlin
*/

//Lambda expression for square of a number
val square : (Int) -> Int = {
    number -> number * number
}

//Lambda expression to add two numbers
val add : (Int,Int) -> Int = {
    a,b -> a+b
}

//Unit represents that the function does not return anything.
val print : (String) -> Unit = {
    println(it)  //it is the default name that kotlin provides
}

fun main(){
    println(square(6))
    println(add(5,6))
    print("Priyal")
}
