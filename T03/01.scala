object firstQuestion 
{
    def reverseString(str: String): String = {
        if (str.length == 0) 
            ""
        else 
            reverseString(str.tail) + str.head
    }

    def main(args: Array[String]): Unit = {
        print("Enter a string : ")
        val input = scala.io.StdIn.readLine()
        println(reverseString(input))
    }
}