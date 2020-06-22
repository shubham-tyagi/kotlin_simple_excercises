class Clothes(var material: String, var color: String, var price: Int) {
  var height: Int? = null
  var age: Int? = null

  constructor(material: String, color: String, price: Int, height: Int, age: Int) : this(material, color, price) {
    this.height = height
    this.age = age
  }

  fun printValues() {
    println("\nthe material is $material, the colour of the clothe is $color, the price of the material is $price ")
    println("the height is $height, the age is $age")
  }
  fun peroformOperations() {
    println("\nprint all the operations")
  }
}

fun main() {

  // Write the program shown in the previous video, see the output, and write a print statement below 
  // the created object to print out the information of both the objects.
  // Create class 'Clothes' with ‘material’, ‘colour’, and ‘price’ as properties in primary constructor 
  // and create its objects in the main function.

  var clothe1 = Clothes("nylon", "black", 400)
  clothe1.printValues()

  // Write the program shown in the previous video and create a secondary constructor and add the property 
  // ‘height’ along with ‘age’. Also create its object.

  var clothe2 = Clothes("nylon", "black", 400, 6, 12)
  clothe2.printValues()
}
