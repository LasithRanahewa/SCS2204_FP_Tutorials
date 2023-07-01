object thirdQuestion 
{
    def mean(n1: Int, n2: Int): Float = {
        "%.2f".format((n1+n2)/2.0).toFloat
    }
    def main(args: Array[String]): Unit = {
        print("Enter num1 : ")
        val num1 = scala.io.StdIn.readInt()
        print("Enter num2 : ")
        val num2 = scala.io.StdIn.readInt()
        
        // println(mean(num1, num2))
        printf("Mean : %.2f\n",mean(num1, num2))
    }
}