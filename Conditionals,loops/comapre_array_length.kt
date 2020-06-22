fun main() {
    val a = arrayOf("Internshala", "Trainings")
    val b = arrayOf("Android", "App", "Developement")
    println(compareArrayLength(a, b))
}

fun compareArrayLength(a: Array<String>, b: Array<String>): String {
  if (a.size == b.size) {
    return ("the length of both the arrays a and b are equal")
  } else {
    return ("length of the both the array are not equal")
  }
}
