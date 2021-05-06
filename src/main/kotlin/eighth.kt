//Classes in Kotlin

class Account (accNo : Int , name : String , amount : Float){
//    var accNo : Int = 0
//    var name : String = ""
//    var amount : Float = 0F

    //Primary Constructor
    var accNo : Int
    var name : String
    var amount : Float

    init {
        this.accNo = accNo
        this.name = name
        this.amount = amount
    }

    //Constructor
//    fun Account(no : Int , n : String , amt : Float){
//        accNo = no
//        name = n
//        amount = amt
//    }

    //fun to initialise accNo , name and amount
//    fun initialise(no : Int , n : String , amt : Float){
//        accNo = no
//        name = n
//        amount = amt
//    }

    fun deposit(money : Float){
        amount += money
        println("Amount after deposit = " + amount)
    }

    fun withdraw(money: Float){
        if(money > amount){
            println("Insufficient balance")
        }
        else{
            amount -= money
            println("Amount after withdrawl = " + amount)
        }
    }
}

fun main(){
    //create object of class Account
    val account = Account(101,"Priyal",1000f)
    //account.initialise(1011,"Priyal",10000f)
    account.deposit(100f)
    account.withdraw(100f)
    account.withdraw(50f)
    println("Account No :  ${account.accNo} , AccountHolder Name : ${account.name}")
    println( "Final Amount = " + account.amount)
}

/*
By default classes in kotlin are final (can't be extended).
In order to make a class inheritable, it has to be annotated with the open keyword.

Types of Constructors -
    Primary Constructor
    Secondary Constructor
    More details - https://blog.mindorks.com/primary-and-secondary-constructors-in-kotlin

    We can have only 1 primary constructor but multiple secondary constructors.
 */