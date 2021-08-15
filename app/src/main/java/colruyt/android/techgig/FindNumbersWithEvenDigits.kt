package colruyt.android.techgig
fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val consecutiveOnes = Solution()
    val result = consecutiveOnes.findNumbers(arr.toIntArray())
    println("Result is $result")

}
class Solution {
    fun findNumbers(nums: IntArray): Int {
        var evenDigitCount = 0
         nums.forEach { number ->
             val digitSize = number.toString().toCharArray().size
            if(digitSize %2 == 0){
                 evenDigitCount += 1
             }

         }
        return  evenDigitCount
    }
}


/*
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.
 */