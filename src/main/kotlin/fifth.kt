//to print numbers from 1 to 10
fun main(){
    for(x in 1..10){
        println(x)  //10 is inclusive
    }

    //OR
    for(x in 1 until 10){
        println(x)   //10 is exclusive
    }

    //Increment - to increase the value by 2 after every iteration
    for(x in 0 until 10 step 2){
        println(x)  //10 is exclusive
    }

    //Decrement - to decrease the value by 2 after every iteration
    for(x in 10 downTo 0 step 2){
        println(x)  //0 is inclusive
    }
}