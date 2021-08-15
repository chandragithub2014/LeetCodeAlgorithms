package colruyt.android.techgig

fun twoSubsequences(x: Array<Int>, r: Int, s: Int): Int {
    // Write your code here
    var mySet = mutableSetOf<String>()
    var temp : String = "{"
    var startingBrace = "{"
    var endingBrace = "}"
    var comma = ","
    var size = x.size-1
        for(i in 0..size) {
            temp += "${x[i]}$comma"
              mySet.add("$startingBrace${x[i]}$endingBrace")
              for(j in 0..size){
                    if(j > i  && x[i]!=x[j]) {
                         mySet.add("$startingBrace${x[i]}$comma${x[j]}$endingBrace")
                        var k = j
                        while(k-1 != i){
                            if(x[i]!=x[k-1] && x[i]!=x[k] && x[k-1]!=x[k]) {
                                mySet.add("$startingBrace${x[i]}$comma${x[k - 1]}$comma${x[j]}$endingBrace")
                            }
                            k -= 1
                        }
                    }
                  if(x[i]!=x[j]){
                      temp += "${x[j]}$comma"
                  }
              }
            if(i==0){
                val final = temp.subSequence(0,temp.lastIndexOf(","))
                val finalVal :String = "$final$endingBrace"
                mySet.add(finalVal)
            }
        }
   println("Final Sequence is $mySet")
    return mySet.size
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val m = first_multiple_input[0].toInt()

    val r = first_multiple_input[1].toInt()

    val s = first_multiple_input[2].toInt()

    val x = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = twoSubsequences(x, r, s)

    println(result)
}
