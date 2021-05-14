import java.util.concurrent.CopyOnWriteArrayList

val numsList = CopyOnWriteArrayList<Int>()

fun main() {
    for (i in 0 until 100) {
        numsList.add(i)
    }
    val itr = numsList.iterator()

    Thread {dropMultipless(3, itr )}.start()
    Thread { dropMultipless(5, itr) }.start()
    Thread { dropMultipless(7, itr) }.start()

    for(i in nums)
        println(i)
}

fun dropMultipless(n :Int , itr: MutableIterator<Int>){
    while(itr.hasNext()){
        val i = itr.next()
        if(i % n == 0)
            itr.remove()
    }
}