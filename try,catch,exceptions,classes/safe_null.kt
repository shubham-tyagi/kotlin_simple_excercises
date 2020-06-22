fun main() {
  var string: String? = "Hello,Kotlin"
  string = null
  print(string?.length)
  // print(string!!.length)  
  // this is a non null asserted call this !! forces the code to be executed even if there is an error
  // it is recommended to use null safety operator because i didn't much understood the concept of 
  // non null asserted call
}
