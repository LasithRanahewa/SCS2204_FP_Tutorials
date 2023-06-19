object RunningTime {
  def easy(total: Int): Int = {
    8 * total
  }
  def tempo(total: Int): Int = {
    7 * total
  }
  def main(args: Array[String]) = {
    val total = easy(2)+tempo(3)+easy(2) 
    println("The total running time is " + total+ " minutes")
  }
}