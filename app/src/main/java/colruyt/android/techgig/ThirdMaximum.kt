package colruyt.android.techgig
fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val checkExists = ThirdMaximum()
    val result =  checkExists.thirdMax(arr.toIntArray())
    println("Result is $result")
}
/*
Input: nums = [3,2,1]
Output: 1
Explanation: The third maximum is 1.

Input: nums = [2,2,3,1]
Output: 1
Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.

 */
class ThirdMaximum {
    fun thirdMax(nums: IntArray): Int {
         var thirdMax = 0
          if(nums.size == 2){
              return if(nums[0] > nums[1] || nums[0] == nums[1]){
                  nums[0]
              }else{
                  nums[1]
              }
          }

         if(nums.size == 1){
             return  nums[0]
         }


    val mySet = nums.toMutableSet()
    val uniqueArray = mySet.toIntArray()
      for(i in 0 until  uniqueArray.size){
            for(j in i+1 until uniqueArray.size){
              if(uniqueArray[i] != uniqueArray[j]) {
                  if (uniqueArray[i] < uniqueArray[j]) {
                      var temp = uniqueArray[i]
                      uniqueArray[i] = uniqueArray[j]
                      uniqueArray[j] = temp
                  }
              }
            }
       }
        for(element in uniqueArray){
            println("Elements is $element")
        }

    thirdMax = uniqueArray[0]
        if(uniqueArray.size >= 3) {
            for (i in 0 until 3) {
                if (uniqueArray[i] < thirdMax) {
                    thirdMax = uniqueArray[i]
                }
            }
        }


        return thirdMax
    }
}


//Remove duplicates


/* while(i < size) {

     loop@ for(j in 0 until size) {
         if(i != j) {
             if (nums[i] == nums[j]) {
                 nums[i] = nums[j]
                 size -= 1
                 i = 0
                 for (k in j until size) {
                     nums[k] = nums[k + 1]
                 }
                 break@loop

             }
         }
     }
     i += 1
 }*/