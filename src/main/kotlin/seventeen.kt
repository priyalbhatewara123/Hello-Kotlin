/*
2nd example of Extension Function.
Extension function for a predefined class.
 */

//There is no function to append three strings therefore we make an extension func
fun String.add(s1: String, s2: String): String {

    return this + s1 + s2
}

fun Int.greaterValue(other: Int): Int {

    if (this > other)
        return this
    else
        return other
}

fun main(){
    var str1: String = "Hello "
    var str2: String = "World"
    var str3: String = "Hey "

    println(str3.add(str1, str2))

    val x: Int = 6
    val y: Int = 10

    val greaterVal = x.greaterValue(y)

    println(greaterVal)
}