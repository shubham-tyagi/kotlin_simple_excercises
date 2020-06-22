class Laptop {
  var ram: Int = 4
  var brand: String = "Aplle"
  var hdd: Int = 500

  fun performComputations() {
    print("computation is performed")
  }
}

fun main() {
  // Create a class ‘Laptop’ with properties as RAM, 
  // brand and hard disk size. Also, create a function ‘performComputations’ in it.

  val laptop = Laptop()

  println(laptop.ram)
  println(laptop.brand)
  println(laptop.hdd)
  laptop.performComputations()

  // For the class ‘Laptop’ created in the previous question, create two different objects in the 
  // main function.

  val laptop1 = Laptop()
  val laptop2 = Laptop()
}
