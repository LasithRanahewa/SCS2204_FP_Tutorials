//Scala Tutorial – 5 
//03)
import scala.io.StdIn

def add(n:Int):Int = n match
{
    case 0 => 0
    case _ => n + add(n-1)
}
object main extends App
{
    print("Enter an integer : ")
    val a = scala.io.StdIn.readInt()
    if (a > 0)
        printf("Sum of numbers from 1 to %d : %d\n",a,add(a))
    else
        printf("Invalid input\n")
}