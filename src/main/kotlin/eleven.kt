/*
There is no static keyword in Kotlin.
The best way to represent a static Java method in Kotlin is by placing the function in the "companion object".
*/

/*
Java Code:
class Foo {
  public static int a() { return 1; }
}
 */

//Equivalent kotlin code
class Foo {
    companion object {
        fun a() : Int = 1
    }
}

fun main(){
    println(Foo.a())
    /*
    In java , you would need to call it as
    println(Foo.Companion.a())
     */
}