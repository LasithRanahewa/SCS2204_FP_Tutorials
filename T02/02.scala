object secondQuestion 
{
    def main(args: Array[String]): Unit = {
        var a = 2;
        var b = 3;
        var c = 4;
        var d = 5;
        var k = 4.3f;

        // a) println( --b * a + c *d--);
        //In scala there is no ++,-- operators (pre increment, post increment)
        b -= 1
        println((b) * a + c * (d))
        d -= 1
        //Since --b is pre decrement, the value of b is decremented before the operation
        //Since d-- is post decrement, the value of d is decremented after the operation.

        // b) println(a++);
        println(a)
        a+=1
        //Since a++ is post increment, the value of a is incremented after the operation. 

        // c) println (–2 * ( g – k ) +c);
        // println("c) "+(-2*(g-k)+c));
        //There is no variable named g in the code. Before calculating the result, we need to define g
        var g = 1;
        println((-2) * (-1*k) +c)

        // d) println (c=c++);
        // post increment operator is not defined in scala
        println(c);
        c+=1

        // e) println (c=++c*a++);
        //pre increment and post increment operators are not defined in scala
        c+=1
        println(c*a)
        a+=1


        
    }
}