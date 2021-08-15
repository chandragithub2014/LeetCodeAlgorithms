package colruyt.android.techgig
fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val checkExists = HeightChecker()
    val result =  checkExists.heightChecker(arr.toIntArray())
    println("Result is $result")
}
class HeightChecker {
    fun heightChecker(heights: IntArray): Int {
        var heights1 = IntArray(heights.size)
        var size = heights.size
        for(i in 0 until size ){
            heights1[i] = heights[i]
        }

        var count = 0

        for(i in 0 until size){
             for(j in i+1 until  size){
                 if(heights[i] > heights[j]){
                     var temp = heights[j]
                     heights[j] = heights[i]
                     heights[i] = temp

                 }
             }


        }

        for(i in 0 until heights.size){
            if(heights[i] != heights1[i]){
                count += 1
            }
        }




     return count
    }
}


/*
Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation:
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]
Indices 2, 4, and 5 do not match.
 */