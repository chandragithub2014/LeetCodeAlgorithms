package colruyt.android.techgig
fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val checkExists = DisappearElementsArray()
    val result =  checkExists.findDisappearedNumbers(arr.toIntArray())
    println("Result is $result")
}
/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
 */
class DisappearElementsArray {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val finalList = mutableListOf<Int>()
        val numSet = nums.toSet()
        for(i in 1 .. nums.size){
            if(!numSet.contains(i)){
                finalList.add(i)
            }
        }

        return finalList
    }
}


//Solution 2:
/*

  val finalList = mutableListOf<Int>()
       val list = nums.toList()
       val initial =  list.sorted()[0]
       val lastElement = list.size

        println("Initial and LastElement is $initial and $lastElement")

       for(i in 1 .. lastElement){
           finalList.add(i)
       }

        println("Final List is $finalList")
        println("Intersection is ${finalList.minus(list)}")
        return finalList.minus(list)
 */