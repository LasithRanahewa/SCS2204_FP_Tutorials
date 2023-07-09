//Scala Tutorial – 5 
//05)
import scala.io.StdIn

def addEven(n: Int): Int =  n match 
{
    case 0 => 0
    case _ => if (n%2 == 0) n + addEven(n-1) else addEven(n-1)
}

object main extends App
{
    print("Enter an integer : ")
    val a = scala.io.StdIn.readInt()
    if (a > 0)
        printf("Sum of even numbers less than %d : %d\n",a,addEven(a))
    else
        printf("Invalid input\n")
}
