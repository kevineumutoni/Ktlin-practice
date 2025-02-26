import com.sun.source.doctree.SummaryTree

fun main () {
    var customers=20
    println("There are ${customers +1} customers")
    val name= "Mary"
    val age = 20
    println("$name is $age years old")
    customers = customers + 1
    customers +=7
    customers -=3
    customers *=2
    customers /=3
    println("$customers")/* 20 */

    val a:Int=1000
    val b: String = "log message"
    val c :Double= 3.14
    val d : Long= 100_000_000_000_000
    val e :Boolean=false
    val f :Char = 'n'

}