//Scala Tutorial – 4 
//01)

import scala.io.StdIn

def interest(a:Double):Double = a match
{
    case a if a <= 20000 => a * 0.02
    case a if a <= 200000  => a * 0.04
    case a if a <= 2000000 => a * 0.035
    case a if a > 2000000 => a * 0.065
}
object main extends App 
{    
    print("Enter deposit amount: ")
    val a = scala.io.StdIn.readDouble()
    if (a < 0) {
        println("Invalid amount")
    }
    else
    {
        println("The interest is: " + interest(a))
    }
}