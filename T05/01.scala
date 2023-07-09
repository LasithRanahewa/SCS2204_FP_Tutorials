//Scala Tutorial – 5 
//01)
import scala.io.StdIn

def gcd(a:Int,b:Int):Int = b match
{
    case 0 => a
    case b if b>a => gcd(b,a)
    case _ => gcd(b,a%b)
}
def prime(a:Int,b:Int=2):Boolean = b match
{
    case x if(x==a) => true
    case x if gcd(a,x)>1 => false
    case x => prime(a,x+1)
}

object main extends App 
{    
    print("Enter an integer greater than 1 : ")
    val a = scala.io.StdIn.readInt()
    if (a > 1) {
        if(prime(a)) printf("%d is prime\n",a)
        else printf("%d is not prime\n",a)
    }
    else printf("Invalid input\n") 
}