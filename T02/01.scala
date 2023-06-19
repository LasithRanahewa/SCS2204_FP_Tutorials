object firstQuestion 
{
    def main(args: Array[String]): Unit = {
        var i: Int = 2;
        var j: Int = 2;
        var m: Int = 5;
        var n: Int = 5;
        var k: Int = 2;
        var f: Float = 12.0f;
        var g: Float = 4.0f;
        var c: Char = 'X';
        
        print("i: "+i+"\n");
        print("j: "+j+"\n");
        print("m: "+m+"\n");
        print("n: "+n+"\n");
        print("k: "+k+"\n");
        print("f: "+f+"\n");
        print("g: "+g+"\n");
        print("c: "+c+"\n");


        print("k + 12 * m: "+(k + 12 * m)+"\n");
        print("m / j: "+(m / j)+"\n");
        print("n % j: "+(n % j)+"\n");
        print("m / j * j: "+(m / j * j)+"\n");
        print("f + 10*5 +g: "+(f + 10*5 +g)+"\n");

        
        // print("++i * n: "+(++i * n)+"\n");
        //In scala there is no ++ operator (pre increment)
        print("(i+1) * n: "+((i+1) * n)+"\n");
    }
}