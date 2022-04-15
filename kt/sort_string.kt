fun main(){

var s = readLine()!!.toCharArray();

var sorted_string  = s.sorted().joinToString("")
//sorted() function returns list of sorted elements
//and joinToString function convert list to string
println(sorted_string)

}
