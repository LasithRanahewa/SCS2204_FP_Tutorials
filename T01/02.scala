object CelciusToFahrenheit {
  def c2f(tempC: Double): Double = {
    tempC * 1.8 + 32
  }

  def main(args: Array[String]): Unit = {
    println("35 degrees of Celcius is "+c2f(35)+" degrees Fahrenheit")
  }
}


