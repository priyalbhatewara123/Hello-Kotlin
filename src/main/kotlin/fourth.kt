//Maps
val mapOfNames = mapOf<Int,String>(0 to "xyz" , 1 to "abc" , 2 to "pqr") //to keyword maps key to value
//mapOf is immutable similar to arrayOf

//generic map can have any type of key and value
val genericMap = mapOf(0 to "Priyal" , "abc" to 0)

//Hashmap
val hm = hashMapOf(1 to "a",2 to "b",3 to "c") //hash map is mutable


fun main(){
   println(mapOfNames[1])
    println(genericMap["abc"])
    hm.set(4 ,"d") //we can add new key-value pair in hashmap through set function
    //or
    hm[5] = "e"
    println(hm.get(5))
    
    //For-each loop
    hm.forEach {
        println(it)
    }
}