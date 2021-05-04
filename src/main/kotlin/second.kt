//Arrays

//Method 1
val numbers = arrayOf(1,2,3,4,5)
val arr = arrayOf(1,"Priyal",2,"Rewangi") //we haven't given any datatype to this array so it can contain more than 1 type of data
val a = arrayOf<String>("1","2") //since here we have given string as datatype so it will hold only string values

//Method2 - Array Constructor - since array is a class inside kotlin therefore we can make an array with array constructor
val num = Array(6,{ i -> i+1}) //this will make array of size 6 and initialise element at index i to i+1

//Method 3 - For primitive datatypes only
val intArray = intArrayOf(3,4,5,6)

//Null array
val nullArray = arrayOfNulls<Int>(5) //you have to give the datatype

fun main(){
    println(a[0])
    println(arr[1])
    println(num[5])
    //OR
    println(num.get(5))

    //for each loop
    intArray.forEach {
        println(it)
    }
    //long form of for each loop
    for(i in intArray){
        println(i)
    }
}

