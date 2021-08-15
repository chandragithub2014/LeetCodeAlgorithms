package colruyt.android.techgig
fun main(args: Array<String>) {


    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val consecutiveOnes = SortArrayByParity()
   var result =  consecutiveOnes.sortArrayByParity(arr.toIntArray())
    println("Result is ${result.contentToString()}")
}
class SortArrayByParity {
    fun sortArrayByParity(nums: IntArray): IntArray {
        var i = 0
        var size = nums.size
        while(i < size){

             if(nums[i] % 2 == 1){
                 for(j in i+1 until size){
                     var temp = nums[j]
                     nums[j] = nums[j-1]
                     nums[j-1] = temp
                 }
                 i = 0
                 size -= 1
             } else{
                 i += 1
             }

        }

        for(element in nums){
            println("Formatted Array is $element")
        }

        return nums
    }
}

/*
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 */