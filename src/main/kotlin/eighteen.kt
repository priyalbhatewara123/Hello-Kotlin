/*
Data Class
https://www.youtube.com/watch?v=Z6xj7hta7Ac
 */
data class User(var name: String, var id: Int)

fun main(){
    var user1 = User("Sam", 10)
    var user2 = User("Sam", 10)

    println(user1)

    if (user1 == user2)
        println("Equal")
    else
        println("Not equal")

    var newUser = user1.copy(id = 25)
    println(newUser)
}