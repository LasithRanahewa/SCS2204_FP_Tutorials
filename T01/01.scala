object AreaOfADisk{
    def area(r: Int): Double = {
        math.Pi * r * r
    } 
    def main(args: Array[String]): Unit = {
        println("The area of a disk with radius 5 is " + area(5))
    }
}

