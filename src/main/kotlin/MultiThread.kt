val numlist = ArrayList<Int>()

fun main(){
    for(i in 0 until 100){
        numlist.add(i)
    }

    /*
    All the 3 threads are running parallelly not one after the other
     */
    Thread { printList("1")}.start()
    Thread { printList("2")}.start()
    Thread { printList("3")}.start()
}

fun printList(id : String){
    for(i in numlist){
        if(id == "2" && i == 50)
            Thread.sleep(50)      //You can make one thread sleep / pause while others are running
        println("$id $i")

    }
}