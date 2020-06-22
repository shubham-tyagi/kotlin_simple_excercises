fun main() {
  // Create a program in Kotlin to calculate the factorial of number 7.
  var num = 7
  var mult: Int = 1
  for (i in num downTo 1) {
    mult = mult * i
  }
  println("\n factorial of $num is $mult")
}
