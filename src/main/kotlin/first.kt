//Kotlin Fundamentals

lateinit var v : String
//cannot use -> var v : String

var f : String ? = null

fun main(){

    //print Hello world
    println("Hello World")

    //Type Inference
    val a = "Hello world from variable"
    println(a);

    var b = 10
    b = 9 //data type should be same as above
    println(b);

    v = "Priyal"
    println(v)

    var vv : String
    vv = "hey"
    println(vv)

    //NULL SAFETY
    // var size :Int = f?.length !! //gives exception

    //Elvis Operator (?:)
    //if f.length is null then return 0
    var l : Int? = f?.length ?: 0
    println(l)
    f = "priyal"
    var size = f ?.length
    println(size)

    //String concatenation
    println(f + "Bhatewara")
    //OR with $ sign
    println("This is ${f?.capitalize()} Bhatewara with name length as ${f?.length}")
}