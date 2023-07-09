//Scala Tutorial – 5 
//04)
import scala.io.StdIn

def isEven(n:Int):Boolean = n match
{
    case 0 => true
    case _ => isOdd(n-1)
}
def isOdd(n:Int):Boolean = !(isEven(n))

object main extends App
{
    print("Enter an integer : ")
    val a = scala.io.StdIn.readInt()
    if (a > 0)
        printf("%d is %s\n",a,if(isEven(a)) "even" else "odd")
    else
        printf("Invalid input\n")
}