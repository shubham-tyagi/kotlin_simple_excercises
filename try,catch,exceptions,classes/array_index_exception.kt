fun main() {
  var arr = listOf(0, 100, 200, 300, 400)
  try {
    print(arr[6])
  } catch (e: Exception) {
    println("\nhey champ you are in the exception block")
  }
  print("\nhello from the other side\n")
}
