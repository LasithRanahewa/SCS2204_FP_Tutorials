//Scala Tutorial – 4 
//03)

import scala.io.StdIn

object Main extends App {
    println(formatNames("Benny", toUpper))
    println(formatNames("Niroshan", toUpperSpecific,1))
    println(formatNames("Saman",toLowerSpecific,0))
    // println(formatNames("Saman",toLower))
    println(formatNames("Kumara", toUpperSpecific,5))
}

def toUpper(name : String) : String = {
    name.toUpperCase()
}
def toLower(name : String) : String = {
    name.toLowerCase()
}

def toUpperSpecific(name: String, index: Int) : String = {
    name.substring(0, index) + name.substring(index, index + 1).toUpperCase() + name.substring(index + 1)
}
def toLowerSpecific(name: String, index: Int) : String = {
    name.substring(0, index) + name.substring(index, index + 1).toLowerCase() + name.substring(index + 1)
}

def formatNames(name : String, formatter: (String) => String) : String = {
    formatter(name)
}
def formatNames(name : String, formatter: (String,Int) => String, i:Int) : String = {
    formatter(name,i)
}

    




