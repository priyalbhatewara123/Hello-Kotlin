//Secondary constructor in Kotlin

class account {
    var accNo : Int = 1
    var name : String = ""
    var amount : Float = 0.0f

    constructor(accNo : Int){
        this.accNo = accNo
        name = "Default"
        amount = 0f
    }

    constructor(accNo: Int,name: String){
        this.accNo = accNo
        this.name = name
        amount = 0f
    }

    constructor(accNo: Int,name: String,amount: Float){
        this.accNo = accNo
        this.name = name
        this.amount = amount
    }
}

fun main(){
    val acc = account(201)
    println(acc.amount)
    val acc1 = account(201,"Priyal",101f)
    println("${acc1.accNo} -> ${acc1.name} -> ${acc1.amount}")
}