fun main() {
  // Create a program to print the first 10 numbers of Fibonacci series. 
  // The Fibonacci Sequence is a series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
  var a = 0
  var b = 1
  var sum: Int
  print("\n$a $b")
  for (i in 1..8) {
    sum = a + b
    print(" $sum")
    a = b
    b = sum
  }
}
