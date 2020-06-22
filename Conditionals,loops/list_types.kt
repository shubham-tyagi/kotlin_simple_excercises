fun main() {
 // Create an immutable list, a mutable list, and an arraylist of the elements: “Lionel Messi”, 
 // “Wayne Rooney”, “Luka Modric”, “Eden Hazard”, “Sergio Aguero”. Print all the above three lists.

 var list1: List<String> = listOf("Lionel Messi", "Wayne Rooney", "Luka Modric", "Eden Hazard", "Sergio Aguero")
 var list2: MutableList<String> = mutableListOf("Lionel Messi", "Wayne Rooney", "Luka Modric", "Eden Hazard", "Sergio Aguero")
 var list3: List<String> = arrayListOf("Lionel Messi", "Wayne Rooney", "Luka Modric", "Eden Hazard", "Sergio Aguero")

 list2[0] = "Shubham Tyagi" // we can change this element because it is mutable list

 println("\n $list1 \n")
 println(" $list2 \n")
 println(" $list3 ")
}
