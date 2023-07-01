object fourthQuestion{
    def attendance(price: Int): Int = {
        120+((15 - price)/5)*20
    }
    def cost(price: Int): Int = {
        500+attendance(price)*3
    }
    def profit(price: Int): Int = {
        attendance(price)*price - cost(price)
    }
    def maxPrice()=
    {
        var max = 0;
        var maxPrice = 0;
        for(i <- 5 to 100 by 5)
        {
            if(profit(i) > max)
            {
                max = profit(i)
                maxPrice = i
            }
        }
        maxPrice
    }
    
    def main(args: Array[String]): Unit = {
        println("Best ticket price: " + maxPrice())
        println(profit(maxPrice()))
        // println(maxPrice())
    }
    
}