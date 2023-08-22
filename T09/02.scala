class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator cannot be zero")

    val numer: Int = n
    val denom: Int = d

    def neg: Rational = new Rational(-numer, denom)

    def sub(that: Rational) = new Rational(numer * that.denom - that.numer * denom, denom * that.denom)

    override def toString: String = numer + "/" + denom
}

object Q2 extends App{
    val x = new Rational(3, 4)
    val y = new Rational(1, 2)
    
    println(x.sub(y))
}