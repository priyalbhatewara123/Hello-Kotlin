//Conditional loop - When as replacement of Switch
val any:Any = "Priyal"
fun main(){
    when(any){
        "Bhatewara" ->{
            println("Name1")
        }
        "xyz" ->{
            println("Name2")
        }
        "Priyal" ->{
            println("Name3")
        }
        else ->{
            println("No name")
        }
    }

    //When can also return a value
    val x = when(any){
        "Priyal" -> "$any Bhatewara"
        "Bhatewara" -> "Priyal $any"
        else -> "Not a valid name"
    }
    println(x)
}