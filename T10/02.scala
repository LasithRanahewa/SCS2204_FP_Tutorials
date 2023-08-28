def countLetterOccurences(word : List[String]) : Int = {
    word.map(str => str.length()).reduce(_ + _)
}

def main(args: Array[String]): Unit = {
    val word: List[String] = List("apple", "banana", "cherry", "date")
    println(word)
    println("Total count of letter occurrences: " + countLetterOccurences(word))
}