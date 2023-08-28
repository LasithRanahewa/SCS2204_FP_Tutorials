
def calculateAverage(temp : List[Int]) : Double = {
    temp.map(c => c*9.0/5.0 + 32).reduce(_ + _)/temp.size
}

def main(args: Array[String]): Unit = {
    var temp : List[Int] = List(0, 10, 20, 30)
    println(temp)
    println("Average Fahrenheit temperature: " + calculateAverage(temp))  
}

