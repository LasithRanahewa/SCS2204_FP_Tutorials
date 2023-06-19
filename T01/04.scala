object CostOfCopies {
  def price(copies: Int): Double = {
    24.95*copies
  }
  def discount(copies: Int): Double = {
    0.4*price(copies)
  }
  def shippingCost(copies: Int): Double = {
    if (copies <= 50) 
      3.0*copies
    else
      3.0*50 + 0.75 * (copies-50)
  }
  def main(args: Array[String]): Unit = {
      println("The total wholesale cost for 60 copies is Rs. " + (price(60) - discount(60) + shippingCost(60)))
  }
}