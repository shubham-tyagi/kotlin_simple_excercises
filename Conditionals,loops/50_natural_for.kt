fun main() {

  // Print the first 50 natural numbers using ‘for’, ‘while’, and ‘do-while’ loops
  for (i in 1 until 51) {
    print("$i ")
  }

  // Print the odd numbers from 100 to 1 using ‘for’, ‘while’, and ‘do-while’ loops.
  for (i in 100 downTo 1) {
    if (i % 2 != 0) {
      print("$i ")
    }
  }
}
