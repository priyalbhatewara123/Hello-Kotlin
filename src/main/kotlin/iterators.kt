val nums = ArrayList<Int>()

fun main() {
    for (i in 0 until 100) {
        nums.add(i)
    }
    dropMultiples(3)
    dropMultiples(5)
    dropMultiples(7)

    for(i in nums)
        println(i)
}
/*
This might lead to ConcurrentModificationException as nums.size keeps on changing after removing i
 */
//fun dropMultiples(n : Int){
//    for(i in 0 until nums.size){
//        if(i % n == 0)
//            nums.remove(i)
//    }
//}

//So we can do this with help of iterator
fun dropMultiples(n :Int){
    val itr = nums.iterator()
    while(itr.hasNext()){
        val i = itr.next()
        if(i % n == 0)
            itr.remove()
    }
}