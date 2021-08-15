package colruyt.android.techgig
/*
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

 */
fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val consecutiveOnes = ConsecutiveOnes()
    val result =  consecutiveOnes.findMaxConsecutiveOnes(arr.toIntArray())
    println("Result is $result")
}
class ConsecutiveOnes {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
          var maxConsecutiveOneCount = 0
           var tempCount = 0
          nums.forEach { item ->

            if(item == 1){
                tempCount += 1

                if(tempCount > maxConsecutiveOneCount){
                    maxConsecutiveOneCount = tempCount
                }
            }else{
                tempCount = 0
            }
        }

        return  maxConsecutiveOneCount
    }
}