fun main() { // print the even and odd numbers from 1 to 100 using the ‘while’ and ‘do-while’ loop
  var i = 0
  println("\neven numbers will be printed :")
  while (i <= 10) {
    print("$i ")
    i += 2
    if (i == 10) {
      println("\n")
    }
  }
  i = 1
  println("odd numbers will be printed :")
  do {
    print("$i ")
    i = i + 2
  } while (i <10)
}
