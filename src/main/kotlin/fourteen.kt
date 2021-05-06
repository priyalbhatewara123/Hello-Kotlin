/*
2. Passing function as a parameter
 */

fun printMyName(print : (String)->Unit){
    print("Priyal")
}

fun main(){
    printMyName(print)
}