fun main() {

  // Initialise a variable x = null and print the value as 0.0 while printing x using the Elvis operator.

  var x: String? = null
  // notice the presence of the ? with String it is the null safety operator
  // it indicates that the calue of the assigned variable can be null 

  print(x?.length ?: "0.0")
  // use of Elvis Operator ?: is done if the value of the variable is null 
  // it prints the other string 
}
