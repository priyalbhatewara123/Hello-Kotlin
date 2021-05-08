/*
Extension function :
Ability to add more functionality to the existing classes, by without inheriting them.
 */

class Student {        //OUR OWN CLASS
    fun hasPassed(marks:Int) : Boolean
    {
        return marks > 40
    }
}

//Extension function
fun Student.isScholar (marks :Int) : Boolean{
    return marks > 95
}

fun main(){
    val student = Student()
    println("Pass status: " + student.hasPassed(57))
    println("Scholarship Status: " + student.isScholar(57))
}
