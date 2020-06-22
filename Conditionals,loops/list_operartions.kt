fun main() {
// Create a list which contains math function operators (+, -, *, /) as characters. Iterate through this list and pass two variables along with the list item (operator) to a function and perform all the math functions on them. Perform the operation corresponding to the character encountered by the iterator.
// Given:
// Index of + is 0
// Index of - is 1
// Index of * is 2
// Index of / is 3
// In case of division check if the divisor is 0 or not.

var operators = listOf("+", "-", "*", "/")
var a = 10
var b = 10
performOperation(operators, a, b)
}

fun performOperation(operators: List<String>, a: Int, b: Int) {
  var result: Int

  for (item in operators) {
    if (item == "+") {
      result = a + b
      println("result = $result")
    }
    if (item == "-") {
      result = a - b
      println("result = $result")
    }
    if (item == "*") {
      result = a * b
      println("result = $result")
    }
    if (item == "/") {
      result = a / b
      println("result = $result")
    }
  }
}
