
def encrypt(s: String, i: Int): String = {
  val shift = i % 26
  var encrypted = ""

  for (char <- s) {
    if (char.isLetter) {
      val base = if (char.isUpper) 'A' else 'a' //65 or 97
      val temp = ((char - base + shift) % 26 + base).toChar
      encrypted += temp
    } else {
      encrypted += char
    }
  }

  encrypted
}

def decrypt(s: String, i: Int): String = {
  val shift = i % 26 
  var decrypted = ""

  for (char <- s) {
    if (char.isLetter) {
      val base = if (char.isUpper) 'A' else 'a'
      val temp = ((char - base - shift + 26) % 26 + base).toChar
      decrypted += temp
    } else {
      decrypted += char
    }
  }

  decrypted
}

def cipher(s: String, shift: Int, func: (String, Int) => String): String = {
  func(s, shift)
}

def main(args: Array[String]): Unit = {
  print("Enter the string to encrypt: ")
  val str = scala.io.StdIn.readLine()
  // println("Enter the string to decrypt: ")
  // val str = scala.io.StdIn.readLine()
  print("Enter the shift: ")
  val shift = scala.io.StdIn.readInt()
  if (shift < 0) {
    println("Invalid shift!")
    return
  }
  
  val encrypted_str = cipher(str, shift, encrypt)
  println(s"Encrypted: $encrypted_str")

  val decrypted_str = cipher(encrypted_str, shift, decrypt)
  println(s"Decrypted: $decrypted_str")
}

