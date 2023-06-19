object VolumeOfASphere {
  def volume(r: Double): Double = {
    4.0/3.0*math.Pi*r*r*r
  }
  def main(args: Array[String]): Unit = {
    println("The volume of a sphere with radius 5 is " + volume(5))
  }
}