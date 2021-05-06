/*
Kotlin provides a unique thing that java does not provide.
We can create objects without classes.
 */

object myObject{
    val item = "someitem"
    fun say(){
        println("Hello")
    }
}

fun main(){
    println(myObject.item)
    myObject.say()
}

/*
What this does under the hood?
Go to tools -> kotlin -> show kotlin bytecode
then decompile

It actually creates a class myObject. But it can have only one instance/object.
It is similar to singleton class in java.
 */