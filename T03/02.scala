object secondQuestion 
{
    def func(l: List[String]): List[String] = {
        var newList = List[String]()
        for (i <- 0 until l.length) {
            if (l(i).length > 5) {
                newList = newList :+ l(i)
                // newList = newList.appended(l(i))
            }
        }
        newList
    }

    def main(args: Array[String]): Unit = {
        print("Enter a list of strings : ")
        val input = scala.io.StdIn.readLine()
        val l = input.split(" ").toList
        
        println(func(l))  
    }
}