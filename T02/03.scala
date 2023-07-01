object thirdQuestion{
    def normalHours(h: Int): Int = {
        250 * h
    } 
    def otHours(h: Int): Int = {
        85 * h
    }
    def tax(nH: Int , oH: Int): Double = {
        (normalHours(nH) + otHours(oH)) * 0.12
    }
    def takeHomeSalary(nH: Int , oH: Int): Double = {
        normalHours(nH) + otHours(oH) - tax(nH , oH)
    }
    def main(args: Array[String]): Unit = {
        // println("Number of normal hours: ")
        // var normalH = scala.io.StdIn.readInt()
        // println("Number of OT hours: ")
        // var otH = scala.io.StdIn.readInt()
        println("Take home salary: " + takeHomeSalary(40 , 30))
    }
}