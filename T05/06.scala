//Scala Tutorial – 5 
//06)
import scala.io.StdIn
def fibonacci(n:Int):Int = n match
{
    case 0 => 0
    case 1 => 1
    case _ => fibonacci(n-1) + fibonacci(n-2)
}
def fibonacciSeq(n:Int):Unit = n match
{
    case 0 => printf("0 ")
    case _ => fibonacciSeq(n-1); printf("%d ",fibonacci(n))
}

object main extends App
{
    print("Enter an integer : ")
    val a = scala.io.StdIn.readInt()
    if (a > 0)
    {
        printf("First %d Fibonacci numbers : ",a)
        fibonacciSeq(a-1)
        printf("\n")
    }
    else
        printf("Invalid input\n")
}