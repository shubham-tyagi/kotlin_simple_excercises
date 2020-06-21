import kotlin.math.*

fun main(args: Array<String>) {

  var a:Int= 8
  var b:Int=4
  println(sum(a,b))
  println(product(a,b))
  println(differnce(a,b))
  println(division(a,b))  
  println(max(a,b))
}

fun sum(a: Int, b: Int): Int{
  return a+b
}

fun differnce(a: Int, b: Int): Int{
  return a-b
}

fun division(a: Int, b: Int): Int{
  return a/b
}

fun product(a: Int, b: Int): Int{
  return a*b
}
