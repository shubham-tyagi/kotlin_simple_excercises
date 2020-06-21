import java.util.* // this import is required for Arrays.toString to work

fun main() {

var arr: Array<Int> = arrayOf(1, 2, 3, 4, 5)
println(Arrays.toString(arr))
println(arr.size)

var diffarr = arrayOf("Hello", 1, 5.34, 12.3f, true)
println(Arrays.toString(diffarr))
}
