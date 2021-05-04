//List or Collection
val l = listOf<String>("Priyal","xyz","abc") //immutable
val l1 = mutableListOf<String>("1","2","3") //mutable
val l2 = arrayListOf<Int>(1,2,3) //arrayListOf is by default mutable

fun main(){
    //there is no add function with l
    l1.add("pqr")
    l2.add(4)

}

/*
1. List are immutable. We can add values only while constructing the list.
   To make them mutable you need to use a mutable list.
 */