class Clothes1 constructor (material: String, color: String, price: Int) {

  var material: String
  var color: String
  var price: Int

  init {
    this.material = material
    this.color = color
    this.price = price
  }

  fun printValues() {
    println("\nthe material is $material, the colour of the clothe is $color, the price of the material is $price ")
  }
  fun peroformOperations() {
    println("\nprint all the operations")
  }
}

fun main() {

  // I have written this program to show the boiler plate code which I have not used in the Clothes.kt program 

  var clothe1 = Clothes1("nylon", "black", 400)
  clothe1.printValues()
}
