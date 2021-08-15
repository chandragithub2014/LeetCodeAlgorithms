package colruyt.android.techgig
fun main(args: Array<String>) {


    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val consecutiveOnes = MoveZeroes()
    consecutiveOnes.moveZeroes(arr.toIntArray())
    // println("Result is $result")
}
class MoveZeroes {
    fun moveZeroes(nums: IntArray): Unit {
     var size = nums.size
        var i = 0
        while(i < size) {
           if(nums[i] == 0 ){
              for(j in i+1 until  size){
                  var temp = nums[j]
                  nums[j] = nums[j-1]
                  nums[j-1] = temp
              }
               i = 0
               size -= 1
           }else{
               i += 1
           }

        }

        for(element in nums){
            println("Formatted Array is $element")
        }
    }
}

/*
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
 */
/*
 if (nums[i] == 0) {
                for (k in i + 1 until size) {
                    var temp = nums[k]
                    nums[k] = nums[k - 1]
                    nums[k - 1] = temp
                }
             i = 0
            }
 */